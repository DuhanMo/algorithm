package duhan.io.codility._03time_complexity

fun solution(X: Int, Y: Int, D: Int): Int {
    val distance = Y - X
    return if (distance % D != 0 ) {
        distance / D + 1
    } else {
        distance / D
    }
}