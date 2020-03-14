import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnection2 {

    public static void main(String[] args) {
        URL url;
        HttpURLConnection urlConnection = null;
        try {
//            This is a login page that I built for work for a monitoring software.
            url = new URL("http://google.com");

            urlConnection = (HttpURLConnection) url.openConnection();

            InputStream in = urlConnection.getInputStream();

            InputStreamReader isw = new InputStreamReader(in);

            int data = isw.read();
            while (data != -1) {
                char current = (char) data;
                data = isw.read();
                System.out.print(current);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (urlConnection != null) {
                urlConnection.disconnect();
            }
        }

    }
}