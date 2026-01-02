import kotlin.math.abs

class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val scoreMap = mutableMapOf<Char, Int>().withDefault { 0 }
        // 순회
        // 점수 4를 기준으로 스코어맵에 점수 더하기
        // 리스트 쌍을 만들어서 그 값을 비교하고 결과를 joinToString
        for (i in survey.indices) {
            // AC, TC,..
            val pair = survey[i]
            // 1,2,3,4,5,6,7
            // choice - 4 = -3, -2,-1,0,1,2,3
            val score = choices[i] - 4
            if (score < 0) {
                scoreMap[pair[0]] = (scoreMap[pair[0]]?:0) + abs(score)
            } else if (score > 0) {
                scoreMap[pair[1]] = (scoreMap[pair[1]]?:0) + score
            }
        }
        
        val types = listOf("RT", "CF", "JM", "AN")
        return types.map { type ->
            // "R"
            val first = type[0]
            // "T"
            val second = type[1]
            
            if ((scoreMap[first] ?: 0) >= (scoreMap[second] ?: 0)) {
                first
            } else {
                second
            }
        }.joinToString("")
    }
}