package HomeWork6;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public abstract class SiteLoader {
    public SiteLoader() {
    }

    protected final double load(String urlToSite, SiteLoader.Currency currencyName) {
        int retryCount = 0;

        StringBuilder content;
        boolean error;
        do {
            content = new StringBuilder();
            error = false;

            try {
                HttpURLConnection con = (HttpURLConnection)(new URL(urlToSite)).openConnection();
                con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:47.0) Gecko/20100101 Firefox/47.0");
                con.setConnectTimeout(50000);
                con.setReadTimeout(50000);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                String line;
                try {
                    while((line = bufferedReader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                } catch (Throwable var11) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable var10) {
                        var11.addSuppressed(var10);
                    }

                    throw var11;
                }

                bufferedReader.close();
            } catch (Exception var12) {
                error = true;
                ++retryCount;
                System.err.println("При соединении что-то пошло не так. " + var12.getMessage());
            }
        } while(error && retryCount < 5);

        if (error) {
            throw new RuntimeException("Не получилось загрузить курсы валют");
        } else {
            return this.handle(content.toString(), currencyName);
        }
    }

    public abstract double load(SiteLoader.Currency currencyName, String date);

    protected abstract double handle(String content, SiteLoader.Currency currencyName);

    public enum Currency {
        USD("145"),
        EUR("292"),
        RUB("298");

        private String id;

        Currency(String id) {
            this.id = id;
        }

        public String getId() {
            return this.id;
        }

    }


}
