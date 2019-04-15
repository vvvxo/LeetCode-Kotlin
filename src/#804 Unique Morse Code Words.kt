import sun.text.normalizer.UTF16.append
import java.util.HashSet


fun uniqueMorseRepresentations(words: Array<String>) {
    var tmpWords = words.toString().toCharArray()
    val dictionary = arrayOf(
        ".-",
        "-...",
        "-.-.",
        "-..",
        ".",
        "..-.",
        "--.",
        "....",
        "..",
        ".---",
        "-.-",
        ".-..",
        "--",
        "-.",
        "---",
        ".--.",
        "--.-",
        ".-.",
        "...",
        "-",
        "..-",
        "...-",
        ".--",
        "-..-",
        "-.--",
        "--.."
    )

    val set = HashSet<String>()

    for (word in words) {
        val sb = StringBuilder()
        for (c in word.toCharArray()) sb.append(dictionary[c - 'a'])
        set.add(sb.toString())
    }
}

