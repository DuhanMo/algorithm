class Solution {
    fun solution(survey: Array<String>, choices: IntArray): String {
        val scoreMap = mutableMapOf(
            'R' to 0,
            'T' to 0,
            'C' to 0,
            'F' to 0,
            'J' to 0,
            'M' to 0,
            'A' to 0,
            'N' to 0,
        )
        for (i in survey.indices) {
            val pair = survey[i]

            val first = pair[0]
            val second = pair[1]
            when (choices[i]) {
                1 -> scoreMap[first] = scoreMap[first]!! + 3
                2 -> scoreMap[first] = scoreMap[first]!! + 2
                3 -> scoreMap[first] = scoreMap[first]!! + 1
                
                5 -> scoreMap[second] = scoreMap[second]!! + 1
                6 -> scoreMap[second] = scoreMap[second]!! + 2
                7 -> scoreMap[second] = scoreMap[second]!! + 3
            }
        }
        
        val sb = StringBuilder()
        when {
            scoreMap['R']!! > scoreMap['T']!!  -> sb.append("R")
            scoreMap['R']!! < scoreMap['T']!!  -> sb.append("T")
            else  -> sb.append("R")
        }
        when {
            scoreMap['C']!! > scoreMap['F']!!  -> sb.append("C")
            scoreMap['C']!! < scoreMap['F']!!  -> sb.append("F")
            else  -> sb.append("C")
        }
        when {
            scoreMap['J']!! > scoreMap['M']!!  -> sb.append("J")
            scoreMap['J']!! < scoreMap['M']!!  -> sb.append("M")
            else  -> sb.append("J")
        }
        when {
            scoreMap['A']!! > scoreMap['N']!!  -> sb.append("A")
            scoreMap['A']!! < scoreMap['N']!!  -> sb.append("N")
            else  -> sb.append("A")
        }
        
        return sb.toString()
    }
}