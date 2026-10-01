class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }
        int sr=0; 
        int sc=0; 
        int er= matrix.length-1; 
        int ec= matrix[0].length-1;

        while(sr<=er && sc<=ec){
            //top
            for(int j=sc; j<=ec;j++){
                result.add(matrix[sr][j]);
            }
            //right
            for(int i=sr+1;i<=er;i++){
                result.add(matrix[i][ec]);

            }
            //bottom
            for(int j=ec-1;j>=sc;j--){
                if(sr==er){
                    break;
                }
                result.add(matrix[er][j]);

            }
            //left
            for(int i=er-1;i>=sr+1; i--){
                if(sc==ec){
                    break;
                }
                result.add(matrix[i][sc]);

            }
            sr++;
            sc++;
            er--;
            ec--;
        }
        return result;
    }

}