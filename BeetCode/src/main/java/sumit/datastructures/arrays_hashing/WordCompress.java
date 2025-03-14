package sumit.datastructures.arrays_hashing;

import java.util.stream.IntStream;

public class WordCompress {
    public static String compressString(String input) {
        if(input == null || input.isEmpty()){
            return "";
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;  // Increase count for repeating character
            } else {
                result.append(count).append(input.charAt(i - 1)); // Append previous character and count
                count = 1;  // Reset count for new character
            }
        }

        // Append last character and its count
        result.append(count).append(input.charAt(input.length() - 1));

        return result.toString();
    }
    public static String compressString2(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        int[] index = {0}; // Mutable index to track positions

        IntStream.range(0, input.length())
                .filter(i -> i == 0 || input.charAt(i) != input.charAt(i - 1))
                .forEach(i -> {
                    if (i > 0) {
                        result.append(i - index[0]).append(input.charAt(i - 1));
                    }
                    index[0] = i;
                });

        // Append last counted character
        result.append(input.length() - index[0]).append(input.charAt(index[0]));

        return result.toString();
    }
}
