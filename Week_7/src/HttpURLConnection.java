import java.io.InputStreamReader;
import java.net.URL;
import java.io.BufferedReader;
import java.net.URLConnection;

/* This program reaches out and establishes a connection, then prints 
whether string input line is equal to null or not.*/
public class HttpURLConnection {
    public static void main(String[] args) throws Exception {

        // This will attempt to connect to the URL address of Google
        URL urlAddress = new URL("http://google.com");

        // The URLConnection object.
        URLConnection urlTest = urlAddress.openConnection();

        // Buffered Reader Object
        BufferedReader readerInput = new BufferedReader(new InputStreamReader(urlTest.getInputStream()));

        // String of the input stream.
        String inputString;

        /* This while loop reads the incoming connection through the 
        Buffered Reader and prints if the connection succeeded if it is equal to null.*/
        if ((inputString = readerInput.readLine()) != null) {
            System.out.println("\n" + "Connection test." + inputString);
        }

    }
}