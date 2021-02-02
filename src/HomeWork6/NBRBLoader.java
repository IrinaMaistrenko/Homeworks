package HomeWork6;

public class NBRBLoader extends SiteLoader {
    public NBRBLoader() {
    }

    public double load(Currency currencyName) {
        return this.load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    protected double handle(String content, Currency currencyName) {
        String field = "\"Cur_OfficialRate\"";
        String rate = content.substring(content.indexOf(field) + 19, content.lastIndexOf("}"));
        double currentrate = Double.parseDouble(rate);
        return currentrate;
    }
}