package app;
import org.apache.commons.codec.binary.Base64;


public class example {
    public static void main(String[] args) throws Exception {
        String message = "Hello World";
        System.out.println(message);
        String encodedMessage = Base64.encodeBase64String(message.getBytes());
        System.out.println(encodedMessage);

    }
}