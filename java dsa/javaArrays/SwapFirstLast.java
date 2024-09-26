public class SwapFirstLast {
    public static String swapFirstLastChar(String str) {
        // Check if the string has at least 2 characters
        if (str.length() <= 1) {
            return str;
        }

        // Convert the string to a char array
        char[] charArray = str.toCharArray();

        // Swap the first and last characters
        char temp = charArray[0];
        charArray[0] = charArray[charArray.length - 1];
        charArray[charArray.length - 1] = temp;

        // Convert the char array back to string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String originalString = "abcd";
        String swappedString = swapFirstLastChar(originalString);
        System.out.println("Original String: " + originalString);
        System.out.println("Swapped String: " + swappedString);
    }
}
