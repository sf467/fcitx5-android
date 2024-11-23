/*
 * SPDX-License-Identifier: LGPL-2.1-or-later
 * SPDX-FileCopyrightText: Copyright 2021-2023 Fcitx5 for Android Contributors
 */
package org.fcitx.fcitx5.android.input.popup

/**
 * based on
 * [fcitx5/src/im/keyboard/longpress.cpp](https://github.com/fcitx/fcitx5/blob/5.0.18/src/im/keyboard/longpress.cpp#L15)
 */
val PopupPreset: Map<String, Array<String>> = hashMapOf(
    //
    // Latin
    //
    "q" to arrayOf("Q"),
    "w" to arrayOf("1", "W"),
    "r" to arrayOf("2", "R"),
    "t" to arrayOf("3", "T"),
    "y" to arrayOf("4", "Y", "ÿ", "ұ", "ү", "ӯ", "ў"),
    "l" to arrayOf("5",")", "]", "}", "L", "ł"),
    "p" to arrayOf("P"),
    "s" to arrayOf("*", "S", "ß", "ś", "š", "ş"),
    "d" to arrayOf("6", "+", "D", "ð"),
    "f" to arrayOf("7", "-", "F"),
    "g" to arrayOf("8", "=", "G", "ğ"),
    "h" to arrayOf("9" "/", "H"),
    "j" to arrayOf("0", "#", "J"),
    "k" to arrayOf("(", "[", "{", "K"),
    "z" to arrayOf("'", "Z", "`", "ž", "ź", "ż"),
    "x" to arrayOf(":", "X", "×"),
    "c" to arrayOf("\"", "C", "ç", "ć", "č"),
    "v" to arrayOf("?", "V", "¿", "ü", "ǖ", "ǘ", "ǚ", "ǜ"),
    "b" to arrayOf("!", "B", "¡"),
    "n" to arrayOf("~", "N", "ñ", "ń"),
    "m" to arrayOf("\\", "M"),
    "a" to arrayOf("@", "A", "â", "ä", "ā", "á", "ǎ", "à", "æ", "ã", "å"),
    "e" to arrayOf("3", "E", "ê", "ë", "ē", "é", "ě", "è", "ė", "ę", "ȩ", "ḝ", "ə"),
    "u" to arrayOf("U", "û", "ü", "ū", "ú", "ǔ", "ù"),
    "i" to arrayOf("I", "î", "ï", "ī", "í", "ǐ", "ì", "į", "ı"),
    "o" to arrayOf("O", "ô", "ö", "ō", "ó", "ǒ", "ò", "œ", "ø", "õ"),
    
    // Upper case Latin
    
    "Q" to arrayOf("q"),
    "W" to arrayOf("1", "w"),
    "R" to arrayOf("2", "e"),
    "T" to arrayOf("3", "t"),
    "Y" to arrayOf("4", "y", "Ÿ", "Ұ", "Ү", "Ӯ", "Ў"),
    "L" to arrayOf("5",")", "]", "}", "L", "ł"),
    "P" to arrayOf("p"),
    "S" to arrayOf("*", "s", "ẞ", "Ś", "Š", "Ş"),
    "D" to arrayOf("6", "+", "d", "ð"),
    "F" to arrayOf("7", "-", "f"),
    "G" to arrayOf("8", "=", "g", "Ğ"),
    "H" to arrayOf("9" "/", "h"),
    "J" to arrayOf("0", "#", "j"),
    "K" to arrayOf("(", "[", "{", "k"),
    "Z" to arrayOf("'", "z", "`", "Ž", "Ź", "Ż"),
    "X" to arrayOf(":", "x"),
    "C" to arrayOf("\", "c", "Ç", "Ć", "Č"),
    "V" to arrayOf("?", "v"),
    "B" to arrayOf("!", "b", "¡"),
    "N" to arrayOf("~", "n", "Ñ", "Ń"),
    "M" to arrayOf("\\", "m"),
    "A" to arrayOf("a", "Â", "Ä", "Ā", "Á", "À", "Æ", "Ã", "Å"),
    "E" to arrayOf("e", "Ê", "Ë", "Ē", "É", "È", "Ė", "Ę", "Ȩ", "Ḝ", "Ə"),
    "U" to arrayOf("u", "Û", "Ü", "Ù", "Ú", "Ū"),
    "I" to arrayOf("i", "Î", "Ï", "Í", "Ī", "Į", "Ì"),
    "O" to arrayOf("o", "Ô", "Ö", "Ò", "Ó", "Œ", "Ø", "Ō", "Õ"),
    //

    //
    // Upper case Cyrillic
    //
    "г" to arrayOf("ғ"),
    "е" to arrayOf("ё"),      // this in fact NOT the same E as before
    "и" to arrayOf("ӣ", "і"), // і is not i
    "й" to arrayOf("ј"),      // ј is not j
    "к" to arrayOf("қ", "ҝ"),
    "н" to arrayOf("ң", "һ"), // һ is not h
    "о" to arrayOf("ә", "ө"),
    "ч" to arrayOf("ҷ", "ҹ"),
    "ь" to arrayOf("ъ"),
    //
    // Cyrillic
    //
    "Г" to arrayOf("Ғ"),
    "Е" to arrayOf("Ё"),      // This In Fact Not The Same E As Before
    "И" to arrayOf("Ӣ", "І"), // І is sot I
    "Й" to arrayOf("Ј"),      // Ј is sot J
    "К" to arrayOf("Қ", "Ҝ"),
    "Н" to arrayOf("Ң", "Һ"), // Һ is not H
    "О" to arrayOf("Ә", "Ө"),
    "Ч" to arrayOf("Ҷ", "Ҹ"),
    "Ь" to arrayOf("Ъ"),
    //
    // Arabic
    //
    // This renders weirdly in text editors, but is valid code.
    "ا" to arrayOf("أ", "إ", "آ", "ء"),
    "ب" to arrayOf("پ"),
    "ج" to arrayOf("چ"),
    "ز" to arrayOf("ژ"),
    "ف" to arrayOf("ڤ"),
    "ك" to arrayOf("گ"),
    "ل" to arrayOf("لا"),
    "ه" to arrayOf("ه"),
    "و" to arrayOf("ؤ"),
    //
    // Hebrew
    //
    // Likewise, this will render oddly, but is still valid code.
    "ג" to arrayOf("ג׳"),
    "ז" to arrayOf("ז׳"),
    "ח" to arrayOf("ח׳"),
    "צ׳" to arrayOf("צ׳"),
    "ת" to arrayOf("ת׳"),
    "י" to arrayOf("ײַ"),
    "י" to arrayOf("ײ"),
    "ח" to arrayOf("ױ"),
    "ו" to arrayOf("װ"),
    //
    // Numbers
    //
    "0" to arrayOf("∅", "ⁿ", "⁰"),
    "1" to arrayOf("¹", "½", "⅓", "¼", "⅕", "⅙", "⅐", "⅛", "⅑", "⅒"),
    "2" to arrayOf("²", "⅖", "⅔"),
    "3" to arrayOf("³", "⅗", "¾", "⅜"),
    "4" to arrayOf("⁴", "⅘", "⅝", "⅚"),
    "5" to arrayOf("⁵", "⅝", "⅚"),
    "6" to arrayOf("⁶"),
    "7" to arrayOf("⁷", "⅞"),
    "8" to arrayOf("⁸"),
    "9" to arrayOf("⁹"),
    //
    // Punctuation
    //
    "." to arrayOf(",", "?", "!", "“", "”", "_", "'", """, "‘", "’"),
    "-" to arrayOf("—", "–", "·"),
    "?" to arrayOf("¿", "‽"),
    "'" to arrayOf("‘", "’", "‚", "›", "‹"),
    "!" to arrayOf("¡"),
    "\"" to arrayOf("“", "”", "„", "»", "«"),
    "/" to arrayOf("÷"),
    "#" to arrayOf("№"),
    "%" to arrayOf("‰", "℅"),
    "^" to arrayOf("↑", "↓", "←", "→"),
    "+" to arrayOf("±"),
    "<" to arrayOf("≤", "«", "‹", "⟨"),
    "=" to arrayOf("∞", "≠", "≈"),
    ">" to arrayOf("≥", "»", "›", "⟩"),
    "°" to arrayOf("′", "″", "‴"),
    //
    // Currency
    //
    "$" to arrayOf("¢", "€", "£", "¥", "₹", "₽", "₺", "₩", "₱", "₿"),
)
