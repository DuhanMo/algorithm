class Solution {
    fun solution(progresses: IntArray, speeds: IntArray): IntArray {
        val remainDays = progresses.mapIndexed { i, progress -> 
            // 잔여 퍼센트
            val remainPercent = 100 - progress
            val remainDay = if (remainPercent % speeds[i] != 0) {
                remainPercent / speeds[i] + 1
            } else {
                remainPercent / speeds[i]
            }
            
            remainDay
        }
        // 7, 3, 9
        // 5, 10, 1, 1, 20, 1
        // 
        // 이전 맥시멈 숫자 기록
        // 7 숫자. 이전 맥시멈 숫자보다 크거나 같은가? 작은가?
        // 
        // 3 숫자. 이전 맥시멈 숫자보다 큰거나 같은가? 작은가?
            // 작은 경우 -> 배포 건수+1
            //
        // 9 숫자. 이먼 맥시멈 숫자보다 크거나 같은가? 작은가?
            // 큰 경우 -> 맥시멈 숫자 갱신 -> 이전 배포건수를 리스트에 더하고 배포 건수를 1로 초기화
        
        var max = remainDays[0]
        var count = 1
        val result = mutableListOf<Int>()
        
        for (i in 1..remainDays.size -1) {
            if (remainDays[i] <= max) {
                count++
            } else {
                max = remainDays[i]
                result.add(count)
                count=1
            }
        }
        result.add(count)
        return result.toIntArray()
    }
}