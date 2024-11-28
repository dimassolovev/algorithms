package two.pointers.problems;

import java.util.*;

// https://leetcode.com/problems/partition-labels/description/
public class PartitionLabelsProblem {
    public List<Integer> partitionLabels(String s) {
        Map<Character, int[]> segments = new LinkedHashMap<>();
        List<Integer> result = new ArrayList<>();

        // generate segments
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (!segments.containsKey(character))
                segments.put(character, new int[]{i, i});
            else {
                int[] segment = segments.get(character);
                segment[1] = i;
            }
        }

        // solving
        int min = -1, max = -1;
        for (Character character : segments.keySet()) {
            int[] segment = segments.get(character);

            if (min == -1 && max == -1) {
                min = segment[0];
                max = segment[1];
            }

            else if (segment[0] <= max || segment[1] <= max) {
                if (segment[1] > max)
                    max = segment[1];
            }

            else {
                result.add(max - min + 1);

                min = segment[0];
                max = segment[1];
            }
        }
        result.add(max - min + 1);

        return result;
    }
}