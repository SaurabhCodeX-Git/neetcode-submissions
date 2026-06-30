class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] chr = strs[i].toCharArray();
            Arrays.sort(chr);

            String key = new String(chr);
            List<String> list = new ArrayList<>();
            if(!map.containsKey(key)){
                list.add(strs[i]);
                map.put(key, list);
            } else{
                map.get(key).add(strs[i]);
            }

        }
        return new ArrayList<>(map.values());
    }
}
