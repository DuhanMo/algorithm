package duhan.io.codility._02arraysort


fun solution(N: IntArray): Int {
    val map = mutableMapOf<Int, Int>()
    N.forEach { number ->
        map[number] = map.getOrDefault(number, 0) + 1
    }
    return map.entries.first { it.value % 2 != 0 }.key
}
