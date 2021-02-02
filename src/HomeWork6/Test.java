package HomeWork6;


import java.text.DecimalFormat;

public class Test {
    public Test() {
    }

    public static void main(String[] args) throws Exception {

        printRates1(new NBRBLoader());
        printRates2(new AlfaLoader());
        

    }

   public static void printRates1(SiteLoader loader) {
        System.out.println("Текущий курс евро НБРБ: " + loader.load(SiteLoader.Currency.EUR));
        //System.out.printf("Текущий курс российского рубля: " + "%.4f %n", loader.load(SiteLoader.Currency.RUB)/100);
        System.out.println("Текущий курс российского рубля НБРБ: " + new DecimalFormat("#.####").format(loader.load(SiteLoader.Currency.RUB) / 100));
        System.out.println("Текущий курс доллара США НБРБ: " + loader.load(SiteLoader.Currency.USD));

    }

        public static void printRates2(SiteLoader loader) {
        System.out.println("Текущий курс евро Альфабанк: " + loader.load(SiteLoader.Currency.EUR));
        System.out.println("Текущий курс российского рубля Альфабанк: " + new DecimalFormat("#.####").format(loader.load(SiteLoader.Currency.RUB)/100));
        System.out.println("Текущий курс доллара США Альфабанк: " + loader.load(SiteLoader.Currency.USD));
    }




}
