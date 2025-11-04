class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int lefttp = 0;
        int righttp = height.length-1;
        while(lefttp<righttp){
            int length = Math.min(height[lefttp], height[righttp]);
            int width = righttp - lefttp;
            int currarea = length*width;
            maxwater = Math.max(maxwater, currarea);

            if(height[lefttp]<height[righttp]) lefttp++;
            else righttp--;
        }
        return maxwater;
    }
}