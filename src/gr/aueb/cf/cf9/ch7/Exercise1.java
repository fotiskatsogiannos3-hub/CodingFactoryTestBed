package gr.aueb.cf.cf9.ch7;

/**
 * A basic character substitution cipher.
 * Each character in the input string is replaced by the next character
 * in the ASCII table to encrypt it, and by the previous one to decrypt it.
 */
public class Exercise1 {
    public static void main(String[] args) {
        String str = "AUEB";

        String encrypted = encrypt(str);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypt(encrypted));
    }

    /**
     * Encrypts a string by replacing each character with the next one in the ASCII table.
     *
     * @param str the input string to encrypt
     * @return the encrypted string
     */
    public static String encrypt(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char next = (char) (ch + 1);
            sb.append(next);
        }
        return sb.toString();
    }

    /**
     * Decrypts a string by replacing each character with the previous one in the ASCII table.
     *
     * @param str the encrypted string to decrypt
     * @return the original decrypted string
     */
    public static String decrypt(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char previous = (char)(ch - 1);
            sb.append(previous);
        }
        return sb.toString();
    }
}
