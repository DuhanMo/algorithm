class Solution {
    private var maxCount = 0
    private lateinit var visited: BooleanArray
    
    fun solution(k: Int, dungeons: Array<IntArray>): Int {
        visited = BooleanArray(dungeons.size)
        
        // 현재 피로도, 카운트, 던전
        dfs(k, 0, dungeons)
        
        return maxCount
    }
    
    private fun dfs(currentK: Int, count: Int,dungeons: Array<IntArray>) {
        maxCount = maxOf(count, maxCount)
        
        // 모든 던전 순회하면서
        // 방문하지 않았고, 현재피로도로 들어갈 수 있다면
        // 방문표시
        // 소모된 후 피로도와 count+1을 함께 (dfs) 전달
        // 방문해제
        for (i in dungeons.indices) {
            val needed = dungeons[i][0]
            val consume = dungeons[i][1]
            
            if (!visited[i] && currentK >= needed) {
                visited[i] = true
                dfs(currentK - consume, count + 1, dungeons)
                visited[i] = false
            }
        }
    }
}