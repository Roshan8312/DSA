class Solution:

  def minPathSum(self, grid: list[list[int]]) -> int:
    m, n = len(grid), len(grid[0])

    # Initialize DP array with positive infinity
    dp = [float("inf")] * n
    dp[0] = 0  # Base case: starting point

    for i in range(m):
      for j in range(n):
        if j > 0:
          # Take the minimum from top (dp[j]) or left (dp[j-1])
          dp[j] = min(dp[j], dp[j - 1]) + grid[i][j]
        else:
          # For the first column, you can only come from above
          dp[j] = dp[j] + grid[i][j]

    return dp[-1]
