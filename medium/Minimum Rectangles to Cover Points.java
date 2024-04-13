class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        Arrays.sort(points, Comparator.comparingInt(arr -> arr[0]));
        int rects = 1;
        int curr = points[0][0];
        for(int i = 1; i<points.length; i++) {
            if(points[i][0]-curr > w) {
                rects++;
                curr = points[i][0];
            }
        }
        return rects;
    }
}