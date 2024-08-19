class Solution {
    public void setZeroes(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        List<List<Integer>> s=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    s.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        for(List<Integer> t:s){
            for(int i=0;i<n;i++){
                matrix[t.get(0)][i]=0;
            }
            for(int i=0;i<m;i++){
                matrix[i][t.get(1)]=0;
            }
        }
    }
}