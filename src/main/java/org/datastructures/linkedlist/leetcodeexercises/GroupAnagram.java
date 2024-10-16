package org.datastructures.linkedlist.leetcodeexercises;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, ArrayList<String>> hashMap = new HashMap<>();

        for (int i = 0 ; i < strs.length ; i++) {
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String string = new String(str);

            if (hashMap.containsKey(string)) {
                hashMap.get(string).add(strs[i]);
            } else {
                ArrayList<String> list = new ArrayList<>();
                list.add(strs[i]);
                hashMap.put(string, list);
            }
        }
        return new ArrayList<>(hashMap.values());
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = solution.groupAnagrams(input);

        // Imprimir el resultado para probar la función
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
