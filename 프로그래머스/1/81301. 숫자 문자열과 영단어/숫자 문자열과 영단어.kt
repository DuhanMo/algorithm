class Solution {
    fun solution(s: String): Int {
        val worlds = arrayOf(
            "zero",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
        )
        return worlds.foldIndexed(s) { index, acc, word ->
            acc.replace(word, index.toString())
        }.toInt()
    }
}