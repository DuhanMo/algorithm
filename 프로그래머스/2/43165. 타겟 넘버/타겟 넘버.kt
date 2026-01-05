class Solution {
    fun solution(numbers: IntArray, target: Int): Int {
        return dfs(numbers,target,0,0)
    }
    
    private fun dfs(numbers: IntArray, target: Int, index: Int, sum: Int) : Int{
        // 1. 모든 숫자를 다 사용한 경우
        if (index == numbers.size) {
            return if (sum == target) 1 else 0
        }
        // 2. 이진트리 형태로 +, - 를 해나감
        return dfs(numbers, target, index + 1, sum + numbers[index]) +
        dfs(numbers, target, index + 1, sum - numbers[index]) 
    }
}