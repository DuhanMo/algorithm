class Solution {
    fun solution(number: String, k: Int): String {
        val stack = StringBuilder()
        
        var deleteCount = k
        
        for (num in number) {
            while (stack.isNotEmpty() && deleteCount > 0 && stack.last() < num) {
                // 432
                // 0,1,2
                // 5
                stack.deleteAt(stack.length - 1)
                deleteCount--
            }
            stack.append(num)
        }
        
        // "9876", 1
        
        // "987"
        // "987", 6
        // "543", 

        
        return stack.substring(0, stack.length - deleteCount)
    }
}