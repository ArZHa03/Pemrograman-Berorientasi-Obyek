public class Encryptor implements IEncryptor {
    private String encryptedData;

    public String encrypt(String data) {
        encryptedData = data;
        return encryptedData;
    }

    public String decrypt(String data) {
        return encryptedData;
    }
}
