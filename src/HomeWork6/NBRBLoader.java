package HomeWork6;

public class NBRBLoader extends SiteLoader {
    public NBRBLoader() {
    }

    public double load(Currency currencyName) {
        return this.load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    protected double handle(String content, Currency currencyName) {
        String field = "\"Cur_OfficialRate\"";
        String rate = content.substring(content.indexOf(field) + field.length() + 1, content.indexOf(field)+field.length()+7);

        double currentrate = Double.parseDouble(rate);
        System.out.println("курсы нбрб "+currentrate);
        return currentrate;
    }
}