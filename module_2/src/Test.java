import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args) {
        String x = "51-X2-123.04";
        String y = "5\\d-[A-Z]\\d-((\\d{4})|(\\d{3}\\.\\d{2}))";
        if(x.matches(y)){
            System.out.print("A");
        }
        else{
            System.out.print("B");
        }
    }
}
