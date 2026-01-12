class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int greatest = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > greatest) {
                greatest = candies[i];
            }
        }
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {

            int totalCandies = candies[i] + extraCandies;

            if (totalCandies >= greatest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}