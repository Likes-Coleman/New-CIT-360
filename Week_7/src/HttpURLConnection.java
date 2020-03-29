import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.URLConnection;

/* This program reaches out and establishes a connection, then, it prints 
whether the string input line is equal to null or not.*/
public class HttpURLConnection {
    public static void main(String[] args) throws Exception {

        /*
         * This try statement will catch any exceptions involving an IO or malformed URL
         * error.
         */
        try {

            // This will attempt to connect to the URL address of Google
            URL urlAddress = new URL("http://google.com");

            // The URLConnection object.
            URLConnection urlTest = urlAddress.openConnection();

            // Buffered Reader Object
            BufferedReader readerInput = new BufferedReader(new InputStreamReader(urlTest.getInputStream()));

            // String of the input stream.
            String inputString;

            /*
             * This while loop reads the incoming connection through the Buffered Reader and
             * prints if the connection succeeded if it is equal to null.
             */
            if ((inputString = readerInput.readLine()) != null) {
                System.out.println("\n" + "Connection test." + inputString);
            }

            // Closes the reader
            readerInput.close();

            // The MalformedURLException is thrown when the URL class finds an invalid URL.
        } catch (MalformedURLException e) {
            System.out.println("The URL you entered is invalid: " + e.getMessage());

            /*
             * This message will appear if the URL connection is disconnected or fails to
             * read the data.
             */
        } catch (IOException e) {
            System.out.println("An I/O error has occured:  " + e.getMessage());
        }
    }
}
