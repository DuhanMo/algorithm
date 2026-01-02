class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        return clothes.groupingBy { it[1] }
        .eachCount()
        .values
        .fold(1) {acc, count ->
            acc * (count + 1)
        } - 1
    }
}