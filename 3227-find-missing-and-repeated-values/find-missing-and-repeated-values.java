class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer> seen = new HashSet<>();
        int repeating = -1;
        int actualSum = 0;

        for(int[] row : grid){
            for(int val : row){
                if(!seen.add(val)){
                    repeating = val;
                }
                actualSum += val;
            }
        }
        int total =n*n;
        int expectedSum = total*(total+1)/2;
        int missingValue = expectedSum + repeating - actualSum;
        return new int[]{repeating, missingValue};
    }
}