class Solution {
    fun solution(n: Int, times: IntArray): Long {
        // 모든 시간을 정해놓고 (시간 범위는 1~가장 느리게 처리되는 경우)
        // 중간 값을 고르기
        // 심사관들에게 가능한지 묻기
        // 가능하게 된 최소값이 정답
        
        var left:Long = 1
        var right:Long = times.maxOrNull()!!.toLong() * n
        var time:Long = right
        while(left <= right) {
            val mid: Long = (left + right) / 2
            var totalProcesses = 0L
            for (time in times) {
                // 심사관별로 시간안에 처리가능한 인원 묻기
                totalProcesses += mid / time
                // 이미 넘었다면 빠른 중지
                if (totalProcesses >= n) break
            }
            // 처리 가능한 인원을 넘었다면 답 지정해놓고 다음 루프 돌리기
            if (totalProcesses >= n) {
                time = mid
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return time
    }
}