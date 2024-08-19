class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> res=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char curr_val=board[i][j];
                if(curr_val!='.'){
                    if( ! res.add(curr_val+"found in row"+i) ||
                   ! res.add(curr_val+"found in col"+j) ||
                    ! res.add(curr_val+"found in subbox"+i/3+"-"+j/3)
                    )return false;
                }
            }
        }
        return true;
    }
}