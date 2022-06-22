package leetcode.medium;

import java.util.*;

public class AccountMerge {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        // Init parent and set to current idx
        int[] parents = new int[accounts.size()];
        for (int i = 0; i < accounts.size(); i++) {
            parents[i] = i;
        }

        Map<String, Integer> owners = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            for (int j = 1; j < accounts.get(i).size(); j++) {
                String email = accounts.get(i).get(j);
                // If same email seen ...
                if (owners.containsKey(email)) {
                    int person = owners.get(email);
                    int p1 = findParent(parents, i);
                    int p2 = findParent(parents, person);
                    if (p1 != p2)
                        parents[p2] = p1;
                } else {
                    owners.put(email, i);
                }
            }
        }

        Map<Integer, TreeSet<String>> users = new HashMap<>();
        for (int i = 0; i < accounts.size(); i++) {
            int parent = findParent(parents, i);
            List<String> emails = accounts.get(i);
            users.putIfAbsent(parent, new TreeSet<>());
            users.get(parent).addAll(emails.subList(1, emails.size()));
        }

        // Build Final Result
        List<List<String>> res = new ArrayList<>();
        for (Integer idx : users.keySet()) {
            String name = accounts.get(idx).get(0);
            List<String> emails = new ArrayList<>(users.get(idx));
            emails.add(0, name);
            res.add(emails);
        }

        return res;
    }

    private int findParent(int[] parents, int idx) {
        while (idx != parents[idx]) {
            parents[idx] = parents[parents[idx]];
            idx = parents[idx];
        }
        return idx;
    }
}
