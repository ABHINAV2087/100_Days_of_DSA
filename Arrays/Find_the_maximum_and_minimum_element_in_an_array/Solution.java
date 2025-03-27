package Find_the_maximum_and_minimum_element_in_an_array;



public class Solution {

    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        // Finding minimum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // Finding maximum value
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new Pair<>(min, max);
    }
}
