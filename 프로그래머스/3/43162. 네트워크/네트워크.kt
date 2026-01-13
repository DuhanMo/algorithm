class Solution {
    fun solution(n: Int, computers: Array<IntArray>): Int {
        var answer = 0
        // 방문
        val visited = BooleanArray(n)
        // 큐
        val queue = ArrayDeque<Int>()
        var network = 0
        // 모든 컴퓨터 돌기
        for (i in 0 until n) {
            if (!visited[i]) {
                // 방문한게 아니라면 네트워크 수 증가, 방문 후 
                visited[i] = true
                network++
                // 큐에 집어넣기
                queue.addFirst(i)
                // bfs 진행    
                // 큐가 존재할 때까지
                while (queue.isNotEmpty()) {
                    // 큐에서 꺼내기
                    val computer = queue.removeLast()
                    for (j in 0 until n) {
                        val isConnected = computers[computer][j]
                        // 해당 큐에 연결된 모든 네트워크 진행
                        // 연결되어있고 방문하지 않았다면 방문표시, 큐에 집어넣기
                        if (isConnected == 1 && !visited[j]) {
                            visited[j] = true
                            queue.addFirst(j)
                        }
                    }
                }
            }
        }
        return network
    }
}