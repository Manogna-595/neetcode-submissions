class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // empty hashmap
        Map<String,List<String>> hm = new HashMap<>();

        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String s1 = new String(chars);

            if(!hm.containsKey(s1)){
                hm.put(s1, new ArrayList<>());
                
            }
            hm.get(s1).add(s);
        }
      
        return new ArrayList<>(hm.values());
    }
}
