class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        var answer: Int = 0
        // 그룹핑 
        // 1 -> 1개
        // 2 -> 2개
        // 3 -> 2개
        // 4 -> 1개
        // 5 -> 2개
        // k = 6?
        // 5,3,2 -> 6개 return 3
        // k = 5?
        // 5,4,3 -> 5개 return 3
        // 
        // 1 -> 4개
        // 2 -> 3개
        // 3 -> 1개
        // k = 2?
        // 1->2개
        // 2->2개
        // 그룹핑해서 많은 수데로 정렬
        
        
        val counts = tangerine.toList().groupingBy { it }.eachCount()
        val sortedCounts = counts.values.sortedDescending()
        
        var remainingK = k
        
        for (count in sortedCounts) {
            remainingK -= count
            answer++
            if (remainingK <= 0) break
        }
        return answer
    }
}