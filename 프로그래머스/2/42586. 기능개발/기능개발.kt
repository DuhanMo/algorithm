class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val queue = ArrayDeque<Int>()
        
        for (i in progresses.indices) {
            val remainProgress = 100 - progresses[i]
            val remainDay = (remainProgress + speeds[i] - 1) / speeds[i]
            queue.addFirst(remainDay)
        }
        val result = mutableListOf<Int>()
        while (queue.isNotEmpty()) {
            val standard = queue.removeLast()
            var count = 1
            while(queue.isNotEmpty() && queue.last() <= standard) {
                queue.removeLast()
                count++
            }
            result.add(count)
        }
        
        return result.toIntArray()
    }
}