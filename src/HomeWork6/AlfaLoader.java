package HomeWork6;

public class AlfaLoader extends SiteLoader{
    public AlfaLoader() {
    }

    public double load(Currency currencyName) {
        return this.load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates" + currencyName.getCode(), currencyName);
    }

    protected double handle(String content, Currency currencyName) {
        String field = "\"sellRate\"";
        String sellrate = content.substring(content.indexOf(field) + 10, content.lastIndexOf(","));
        double currentrate = Double.parseDouble(sellrate);
        return currentrate;
    }
}

