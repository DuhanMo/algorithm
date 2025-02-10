package codility._01iterations

import kotlin.math.max


// 자바 라이브러리 사용
fun solution(n: Int): Int {
    val binaryString = Integer.toBinaryString(n)
    val zerosStrings = binaryString.trim('0').split('1')
    if (zerosStrings.isEmpty()) {
        return 0
    }
    return zerosStrings.maxOfOrNull { it.length } ?: 0
}

// 슬라이딩 윈도우 사용
fun solution2(n: Int): Int {
    val binaryString = Integer.toBinaryString(n)
    var left = -1
    var maxGap = 0
    for (right in binaryString.indices) {
        if (binaryString[right] == '1') {
            if (left != -1 ) {
                maxGap = max(maxGap, right - left - 1)
            }
            left = right
        }
    }
    return maxGap
}

fun main() {
    println(solution2(1041)) // 출력: 5
    println(solution2(32))   // 출력: 0
    println(solution2(9))    // 출력: 2
    println(solution2(529))  // 출력: 4
    println(solution2(20))   // 출력: 1
    println(solution2(15))   // 출력: 0
}