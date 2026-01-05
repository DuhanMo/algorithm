class Solution {
    fun solution(numbers: IntArray): String {
        var answer = ""
        val max = numbers
        .map {it.toString()}
            .sortedWith(Comparator {a,b -> (b+a).compareTo(a+b) }) 
            .joinToString("")
    
        return if (max.startsWith("0")) {
            "0"
        } else {
            max
        }
    }
}