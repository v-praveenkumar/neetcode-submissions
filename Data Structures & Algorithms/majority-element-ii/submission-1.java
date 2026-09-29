class Solution {
    public List<Integer> majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> s = new HashSet<>();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 3) {
                s.add(i);
            }
        }

        return new ArrayList<>(s);
    }
}