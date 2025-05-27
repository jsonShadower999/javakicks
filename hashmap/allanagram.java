// Input: arr[] = ["act", "god", "cat", "dog", "tac"]
// Output: [["act", "cat", "tac"], ["god", "dog"]]
// Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.

// Input: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]
// Output: [["abc", "cab", "bac"], ["listen", "silent", "enlist"],["rat", "tar", "art"]]
// Explanation: 
// Group 1: "abc", "bac" and "cab" are anagrams.
// Group 2: "listen", "silent" and "enlist" are anagrams.
// Group 3: "rat", "tar" and "art" are anagrams.
static ArrayList<ArrayList<String>> anagrams(String[] arr) {
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        Map<String, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < arr.length; i++) {
            String key = getHash(arr[i]);
            
            // If key is not present in the hash map, add
            // an empty group (List) in the result and
            // store the index of the group in hash map
            if (!mp.containsKey(key)) {
                mp.put(key, res.size());
                res.add(new ArrayList<>());
            }

            // Insert the string in its correct group
            res.get(mp.get(key)).add(arr[i]);
        }

        return res;
    }
