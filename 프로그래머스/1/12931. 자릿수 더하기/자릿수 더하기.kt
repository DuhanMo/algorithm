class Solution {
    fun solution(n: Int): Int {
        var sum = 0
        val stringInt = n.toString()
        stringInt.forEach {
            sum += it.digitToInt()
        }
        return sum
    }
}