package codility._02arraysort

fun solution(A: IntArray, K: Int): IntArray {
    if (A.isEmpty()) {
        return A
    }
    val k = K % A.size
    if (k ==0) {
        return A
    }
    return A.takeLast(k).toIntArray() + A.dropLast(k)
}

fun main() {
    val message = solution(A = intArrayOf(3, 8, 9, 7, 6), K = 1)
    println(message)
}