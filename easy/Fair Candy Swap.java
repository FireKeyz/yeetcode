class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int at = 0;
        int bt = 0;
        for(int a : aliceSizes) {
            at+=a;
        }
        for(int b : bobSizes) {
            bt+=b;
        }
        int avg = (at+bt)/2;

        Set<Integer> set = new HashSet<>();
        for (int value : bobSizes) {
            set.add(value);
        }

        for(int a : aliceSizes) {
            int ebg = avg - (at-a);
            if(set.contains(ebg)) {
                return new int[] {a, ebg};
            }
        }
        return null;
    }
}