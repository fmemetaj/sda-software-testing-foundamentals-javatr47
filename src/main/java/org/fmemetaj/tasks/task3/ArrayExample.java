package org.fmemetaj.tasks.task3;

public class ArrayExample {

    public static String[] removeDuplicates(String[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        // Create a temporary array to store unique elements
        String[] temp = new String[array.length];
        int uniqueCount = 0;

        // Iterate through the original array
        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the element already exists in the temporary array
            for (int j = 0; j < uniqueCount; j++) {
                if (array[i].equals(temp[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temporary array
            if (!isDuplicate) {
                temp[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Create the final array with the exact size and copy unique elements
        String[] result = new String[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }

        return result;
    }
}
