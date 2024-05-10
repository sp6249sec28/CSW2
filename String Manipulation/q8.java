//Caesar Cipher Encryption/Decryption
public class q8 {
    public static void main(String[] args) {
        String message = "Hello, World!";
        int key = 3; // Shift key

        // Encrypt the message
        String encryptedMessage = encrypt(message, key);
        System.out.println("Encrypted message: " + encryptedMessage);

        // Decrypt the message
        String decryptedMessage = decrypt(encryptedMessage, key);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String encrypt(String message, int key) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (((c - 'a' + key) % 26) + 'a');
                encrypted.append(shifted);
            } else {
                encrypted.append(c);
            }
        }
        return encrypted.toString();
    }

    public static String decrypt(String encryptedMessage, int key) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encryptedMessage.toCharArray()) {
            if (Character.isLetter(c)) {
                char shifted = (char) (((c - 'a' - key + 26) % 26) + 'a');
                decrypted.append(shifted);
            } else {
                decrypted.append(c);
            }
        }
        return decrypted.toString();
    }
}