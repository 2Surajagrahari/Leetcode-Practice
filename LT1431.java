class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int n = candies.length;
        int max = 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,candies[i]);
        }

        for(int i=0;i<n;i++){
            result.add((candies[i] + extraCandies) >= max);
        }
        return result;
    }
}