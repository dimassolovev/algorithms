package search;

public class LinearSearch {
    public int search(int[] numberArray, int target) {
        for (int i = 0; i < numberArray.length; i++)
            if (numberArray[i] == target)
                return i;

        return -1;
    }
}
