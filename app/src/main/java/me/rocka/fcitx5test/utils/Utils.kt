package me.rocka.fcitx5test.utils

import android.content.ContentResolver
import android.content.Context
import android.inputmethodservice.InputMethodService
import android.net.Uri
import android.provider.OpenableColumns
import android.view.HapticFeedbackConstants
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.view.inputmethod.InputConnection
import androidx.core.view.children
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.sun.jna.Library
import com.sun.jna.Native
import me.rocka.fcitx5test.FcitxApplication
import me.rocka.fcitx5test.data.Prefs

fun View.allChildren(): List<View> {
    if (this !is ViewGroup)
        return listOf(this)
    val result = mutableListOf<View>()
    children.forEach { result.addAll(it.allChildren()) }
    return result.toList()
}

val InputMethodService.inputConnection: InputConnection?
    get() = currentInputConnection

fun ViewPager2.getCurrentFragment(fragmentManager: FragmentManager): Fragment? =
    fragmentManager.findFragmentByTag("f$currentItem")

val appContext: Context
    get() = FcitxApplication.getInstance().applicationContext

fun Uri.queryFileName(contentResolver: ContentResolver) =
    contentResolver.query(
        this,
        null, null, null, null
    )?.use {
        val index = it.getColumnIndex(OpenableColumns.DISPLAY_NAME)
        it.moveToFirst()
        it.getString(index)
    }

inline fun <reified T : Library> nativeLib(name: String): Lazy<T> = lazy {
    Native.load(name, T::class.java)
}

fun View.globalLayoutListener(repeat: () -> Boolean = { true }, block: () -> Unit) {
    viewTreeObserver.addOnGlobalLayoutListener(object : ViewTreeObserver.OnGlobalLayoutListener {
        override fun onGlobalLayout() {
            if (!repeat())
                viewTreeObserver.removeOnGlobalLayoutListener(this)
            block()
        }
    })
}

fun View.oneShotGlobalLayoutListener(block: () -> Unit) = globalLayoutListener({ false }, block)

fun <T : RecyclerView.ViewHolder> RecyclerView.Adapter<T>.onDataChanged(block: () -> Unit) =
    registerAdapterDataObserver(object : RecyclerView.AdapterDataObserver() {
        override fun onChanged() {
            block()
        }

        override fun onItemRangeInserted(positionStart: Int, itemCount: Int) {
            block()
        }

        override fun onItemRangeRemoved(positionStart: Int, itemCount: Int) {
            block()
        }
    })

fun View.hapticIfEnabled() {
    if (Prefs.getInstance().buttonHapticFeedback.value)
        performHapticFeedback(
            HapticFeedbackConstants.KEYBOARD_TAP,
            HapticFeedbackConstants.FLAG_IGNORE_GLOBAL_SETTING or HapticFeedbackConstants.FLAG_IGNORE_VIEW_SETTING
        )
}