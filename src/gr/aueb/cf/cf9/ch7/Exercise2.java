package gr.aueb.cf.cf9.ch7;

/**
 * A simple Caesar cipher implementation.
 * The program shifts each letter of a string by a fixed key value
 * to encrypt it, and shifts it back to decrypt.
 */
public class Exercise2 {
    public static void main(String[] args) {
        String str = "abc";
        int key = 2;

        String encrypted = encrypt(str, key);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypt(encrypted, key));
    }

    /**
     * Encrypts a string by shifting each character forward in the alphabet by the given key.
     *
     * @param str the input string to encrypt (lowercase letters only)
     * @param key the number of positions to shift each character
     * @return the encrypted string
     */
    public static String encrypt(String str, int key) {
        String result = "";

        char ch;
        char newChar;
        int position = 0;
        int newPosition = 0;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            position = ch - 'a';
            newPosition = (position + key) % 26;
            newChar = (char) (newPosition + 'a');
            result += newChar;
        }
        return result;
    }

    /**
     * Decrypts a string by shifting each character backward in the alphabet by the given key.
     *
     * @param str the encrypted string to decrypt (lowercase letters only)
     * @param key the number of positions to shift each character back
     * @return the original decrypted string
     */
    public static String decrypt(String str, int key) {
        String result = "";
        char ch;
        char newChar;
        int position = 0;
        int newPosition = 0;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            position = ch - 'a';
            newPosition = (position + (26 - key)) % 26;
            newChar = (char) (newPosition + 'a');
            result += newChar;
        }
        return result;
    }
}
