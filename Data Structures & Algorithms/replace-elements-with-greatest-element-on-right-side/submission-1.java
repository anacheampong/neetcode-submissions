class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temporal = -1;
            int j = i + 1;
            while (j < arr.length) {
                if (arr[j] > temporal) {
                    temporal = arr[j];
                }
                j++;
            }
            arr[i] = temporal;

        }
        return arr;
    }
}