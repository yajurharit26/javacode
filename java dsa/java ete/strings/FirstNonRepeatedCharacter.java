package strings;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String input = "abbaccdde"; // Example input
        char result = findFirstNonRepeatedCharacter(input);

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("There are no non-repeated characters.");
        }
    }

    public static char findFirstNonRepeatedCharacter(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            char currentChar = str.charAt(i);
            boolean isRepeated = false;

            // Check if currentChar is repeated in the rest of the string
            for (int j = 0; j < length; j++) {
                if (i != j && currentChar == str.charAt(j)) {
                    isRepeated = true;
                    break; // No need to check further if repeated
                }
            }

            // If not repeated, return the character
            if (!isRepeated) {
                return currentChar;
            }
        }

        return '\0'; // Return null character if no non-repeated character is found
    }
}
