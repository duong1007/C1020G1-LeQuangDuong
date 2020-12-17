import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Test {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://vnexpress.net/fda-cong-nhan-vaccine-moderna-hieu-qua-cao-4206913.html");
            URLConnection conn = url.openConnection();

            InputStream stream = conn.getInputStream();
            DataInputStream ir = new DataInputStream(stream);

            while (true){
                System.out.println(ir.read());
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
