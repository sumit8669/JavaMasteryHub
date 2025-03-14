package sumit.datastructures.arrays_hashing;

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
}
