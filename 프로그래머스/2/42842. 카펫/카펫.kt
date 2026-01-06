import kotlin.math.*

class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        // 총 면적 w * h = brown + yellow = total
        // (w-2)(h-2) = yellow
        val total = brown + yellow
        for (h in 3..total) {
            if (total % h == 0) {
                val w = total / h
                if ((w-2)*(h-2) == yellow) {
                    return intArrayOf(w,h)
                }
            }
        }
        var answer = intArrayOf()
        return answer
    }
}