package HomeWork6;


import java.text.DecimalFormat;

public class Test {
    public Test() {
    }

    public static void main(String[] args) throws Exception {

        //printRates1(new NBRBLoader());

        //printRates2(new AlfaLoader());

       //SiteLoader loader = new NBRBLoader();
        //String nbrb_Eur = "Курс НБРБ " + SiteLoader.Currency.EUR + ": " + loader.load(SiteLoader.Currency.EUR) + "\n";
        //String nbrb_Rub = "Курс НБРБ " + SiteLoader.Currency.RUB + ": " + loader.load(SiteLoader.Currency.RUB) + "\n";
        //String nbrb_Usd = "Курс НБРБ " + SiteLoader.Currency.USD + ": " + loader.load(SiteLoader.Currency.USD) + "\n";
        //WritingToFile.newFile(nbrb_Eur, nbrb_Rub, nbrb_Usd);


    //}

  /*public static void printRates1(SiteLoader loader) {
        System.out.println("Текущий курс евро НБРБ: " + loader.load(SiteLoader.Currency.EUR));
        //System.out.printf("Текущий курс российского рубля: " + "%.4f %n", loader.load(SiteLoader.Currency.RUB)/100);
        System.out.println("Текущий курс российского рубля НБРБ: " + new DecimalFormat("#.####").format(loader.load(SiteLoader.Currency.RUB) / 100));
        System.out.println("Текущий курс доллара США НБРБ: " + loader.load(SiteLoader.Currency.USD));

      System.out.println("----------------------------------------");

    }*/

       /*public static void printRates2(AlfaLoader loader) {
        System.out.println("Текущий курс евро Альфабанк: " + loader.load(SiteLoaderAlfa.Currency.EUR));
        System.out.println("Текущий курс российского рубля Альфабанк: " + loader.load(SiteLoaderAlfa.Currency.RUB));
        System.out.println("Текущий курс доллара США Альфабанк: " + loader.load(SiteLoaderAlfa.Currency.USD));

           //System.out.println("----------------------------------------");
           //System.out.println("----------------------------------------");*/

       }




}
