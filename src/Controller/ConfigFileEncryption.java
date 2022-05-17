package Controller;

import javax.crypto.spec.SecretKeySpec;

import static Controller.Encryption.*;

public class ConfigFileEncryption {

    public static void main(String[] args) throws Exception {
        String password = "";

        if (password == null) {
            throw new IllegalArgumentException("No such parameter present in config file");
        }

        byte[] salt = new String("12345678").getBytes();
        int iterationCount = 40000;
        int keyLength = 128;
        SecretKeySpec key = createSecretKey(password.toCharArray(), salt, iterationCount, keyLength);

        String originalPassword = password;
        System.out.println("Original password: " + originalPassword);
        String encryptedPassword = encrypt(originalPassword, key);
        System.out.println("Encrypted password: " + encryptedPassword);
        String decryptedPassword = decrypt(encryptedPassword, key);
        System.out.println("Decrypted password: " + decryptedPassword);
    }
}