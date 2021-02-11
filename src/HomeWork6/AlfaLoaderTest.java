package HomeWork6;

public class AlfaLoaderTest {
    public static void main(String[] args) {

        String str = "{\"rates\":[{\"sellRate\":89.000000,\"sellIso\":\"EUR\",\"sellCode\":978,\"buyRate\":94.000000,\"buyIso\":\"RUB\",\"buyCode\":643,\"quantity\":1,\"name\":null,\"date\":\"2021-02-03T12:17:49.000Z\"},{\"sellRate\":73.000000,\"sellIso\":\"USD\",\"sellCode\":840,\"buyRate\":78.000000,\"buyIso\":\"RUB\",\"buyCode\":643,\"quantity\":1,\"name\":null,\"date\":\"2021-02-03T12:17:49.000Z\"},{\"sellRate\":1.180000,\"sellIso\":\"EUR\",\"sellCode\":978,\"buyRate\":1.230000,\"buyIso\":\"USD\",\"buyCode\":840,\"quantity\":1,\"name\":null,\"date\":\"2021-02-03T12:17:49.000Z\"},{\"sellRate\":3.400000,\"sellIso\":\"RUB\",\"sellCode\":643,\"buyRate\":3.550000,\"buyIso\":\"BYN\",\"buyCode\":933,\"quantity\":100,\"name\":\"российских рублей\",\"date\":\"2021-02-03T12:17:49.000Z\"},{\"sellRate\":3.100000,\"sellIso\":\"EUR\",\"sellCode\":978,\"buyRate\":3.220000,\"buyIso\":\"BYN\",\"buyCode\":933,\"quantity\":1,\"name\":\"евро\",\"date\":\"2021-02-03T12:17:49.000Z\"},{\"sellRate\":2.610000,\"sellIso\":\"USD\",\"sellCode\":840,\"buyRate\":2.670000,\"buyIso\":\"BYN\",\"buyCode\":933,\"quantity\":1,\"name\":\"доллар США\",\"date\":\"2021-02-03T12:17:49.000Z\"}]}";


        String field = "\"buyRate\"";
        String sub = "933";
        String sellrate = null;
        String source;
        double currentrate = 0;
        String[] substring = str.split("},");
        for (String substrings : substring) {
          System.out.println("разбили на строки: " + substrings);


            if (substrings.contains(sub)) {
                sellrate = substrings.substring(substrings.indexOf(field) + field.length() + 1, substrings.indexOf(field) + field.length() + 7);
                StringBuilder ourSellrates = new StringBuilder(sellrate);
                System.out.println(ourSellrates);
                currentrate = Double.parseDouble(String.valueOf(ourSellrates));
                System.out.println(currentrate);
                System.out.println();
                //System.out.println("курсы в строках с 933: " + sellrate);
            } //else {
               //String str1 = str.replaceAll (substrings, "");
               //System.out.println(str1);
            }

                //if (sellrate != null) {
                    //currentrate = Double.parseDouble(sellrate);
               // }
                //System.out.println("спарсили выбранные строки в double " + currentrate);


            }


        }















