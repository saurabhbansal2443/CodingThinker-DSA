package Strings;

public class StringBuilderTheroy {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        // Appends the specified string representation of a value to
        /// the StringBuilder.
        sb.append("Saurabh");

        // Inserts the specified string representation of a value at the specified
        // position in the StringBuilder.
        // sb.insert(2, "bansal");

        // delete(): Removes the characters in a substring of the StringBuilder.
        // sb.delete(2, 8);

        // deleteCharAt(): Removes the character at the specified position in the
        // StringBuilder.
        // sb.deleteCharAt(1);

        // replace(): Replaces the characters in a substring of the StringBuilder with
        // the specified string.
        // sb.replace(2, 5, "Bansal");

        // reverse(): Reverses the order of characters in the StringBuilder.
        // sb.reverse();

        // Returns the character at the specified position in the StringBuilder.
        // System.out.println(sb.charAt(0));

        // Returns the length (number of characters) of the StringBuilder.
        // System.out.println(sb.length());

        // substring(): Returns a new StringBuilder that contains a subsequence of
        // characters from the original StringBuilder.
        // System.out.println(sb.substring(1, 7));

        // toString(): Converts the StringBuilder to a String.

        // indexOf(): Returns the index within the StringBuilder of the first occurrence
        // of the specified substring.
        // System.out.println(sb.indexOf("a"));

        // lastIndexOf(): Returns the index within the StringBuilder of the last
        // occurrence of the specified substring.
        // System.out.println(sb.lastIndexOf("a"));

        // setCharAt(): Sets the character at the specified position in the
        // StringBuilder to the specified character.

        sb.setCharAt(1, 'Z');

        System.out.println(sb);

    }
}
