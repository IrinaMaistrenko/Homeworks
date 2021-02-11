package HomeWork6;

public class AlfaLoader extends SiteLoaderAlfa {
    public static void main(String[] args) {

    }

    public AlfaLoader() {
    }

    @Override
    public double load(SiteLoader.Currency var1) {
        return 0;
    }

    @Override
    protected double handle(String var1, SiteLoader.Currency var2) {
        return 0;
    }




    //@Override
    /*protected double load(String s, Currency currencyName) {
        return this.load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/rates", currencyName);
    }*/

    protected double handle(String content, Currency currencyName) {


        String field = "\"buyRate\"";
        String sub = "933";
        String sub1 = "EUR";
        String sub2 = "USD";
        String sub3 = "RUB";
        String sellrate;
        String sellrateUSD;
        String sellrateRUB;
        double currentrate = 0;
        String[] substring = content.split("}");
        //StringBuilder ourSellrates = new StringBuilder();
        //System.out.println("курс евро" + sellrateEUR);


        System.out.println("currentrate"+currentrate);
        for (String substrings : substring) {
            //System.out.println(substrings);

            if (substrings.contains(sub)) {
                sellrate = substrings.substring(content.indexOf(field), content.indexOf(field) + field.length() - 1);
                System.out.println("Sellrates" + sellrate);
               // ourSellrates.append(sellrate);

                /*if (substrings.contains(sub) && substrings.contains(sub2)) {
                    sellrateUSD = substrings.substring(content.indexOf(field), content.indexOf(field) + field.length() - 1);
                    System.out.println("Sellrate USD " + sellrateUSD);
                    ourSellrates.append(sellrateUSD);

                    if (substrings.contains(sub) && substrings.contains(sub3)) {
                        sellrateRUB = substrings.substring(content.indexOf(field), content.indexOf(field) + field.length() - 1);
                        System.out.println("Sellrate RUB " + sellrateRUB);
                        ourSellrates.append(sellrateRUB);
                        //System.out.println("Выбранные в билдер строки " + ourSellrates);

                        //System.out.println("Спарсенные курсы "+currentrate);*/
                currentrate = Double.parseDouble(sellrate);

                    }

                }


        return currentrate;
    }


}

