package regex.bai_tap.crawl_new;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNew {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            URLConnection conn = url.openConnection();

            InputStream stream = conn.getInputStream();
            InputStreamReader ir = new InputStreamReader(stream);
            BufferedReader reader = new BufferedReader(ir);

            String line;
            while ((line = reader.readLine()) != null){
                Pattern p = Pattern.compile("news-item__sapo\"(.*)href");
                Matcher m = p.matcher(line);
                while (m.find()) {
                    System.out.println(m.group(1));
                };
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
