class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        // Directions array representing the 8 possible neighbors
        int[][] directions = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1}, {1, 0}, {1, 1}
        };

        // Step 1: Apply in-place encoding for transitions
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;

                // Count live neighbors
                for (int[] dir : directions) {
                    int ni = i + dir[0];
                    int nj = j + dir[1];
                    
                    // Check for valid neighbors and consider both live (1) and transitioning cells (-1)
                    if (ni >= 0 && ni < m && nj >= 0 && nj < n && Math.abs(board[ni][nj]) == 1) {
                        liveNeighbors++;
                    }
                }

                // Apply the rules
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) {
                    // Live to dead
                    board[i][j] = -1;
                }
                if (board[i][j] == 0 && liveNeighbors == 3) {
                    // Dead to live
                    board[i][j] = 2;
                }
            }
        }

        // Step 2: Final pass to update the board to the new state
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 2) {
                    board[i][j] = 1;  // 2 means the cell is now alive
                } else if (board[i][j] == -1) {
                    board[i][j] = 0;  // -1 means the cell is now dead
                }
            }
        }
    }
}
