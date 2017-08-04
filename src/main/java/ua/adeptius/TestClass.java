package ua.adeptius;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

@SuppressWarnings("Duplicates")
public class TestClass {


    public static void main(String[] args) throws Exception {
        System.out.println("test");
//        HttpReport report = HttpWorker.getResultViaJsoupConnect("http://e404.ho.ua/", "Бесплатная помощь");
//        System.out.println(report);
//        getWithEncoder("http://e404.ho.ua/", "Бесплатная помощь");
    }

    public static boolean getWithEncoder(String url, String word) throws Exception {
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla");
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.8,ru;q=0.6,uk;q=0.4");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder sb = new StringBuilder();
        while (in.ready()) {
            String s = new String(in.readLine().getBytes());
            sb.append(s);
        }
        in.close();
        long t0 = System.nanoTime();
        String result = sb.toString();
//        result = StringEscapeUtils.unescapeHtml4(result);
        System.out.println(TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - t0));
//        Document doc2 = Jsoup.parse(sb.toString());
//        String result = doc2.toString();
        System.out.println(result);
        return result.contains(word);
    }
}
