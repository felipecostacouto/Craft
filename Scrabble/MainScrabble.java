public class MainScrabble {
    public static void main(String[] args){
        System.out.println("Felipe -> " + CalculatorScrabble.result("Felipe")); //15

        System.out.println("Intuit -> " + CalculatorScrabble.result("Intuit")); //20

        System.out.println("turbotax -> " + CalculatorScrabble.result("turbotax")); //19

        System.out.println("quickbooks -> " + CalculatorScrabble.result("quickbooks")); //37

        System.out.println("mint -> " + CalculatorScrabble.result("mint")); //14

        System.out.println("creditKarma -> " + CalculatorScrabble.result("creditKarma")); //24

        System.out.println("mailchimp -> " + CalculatorScrabble.result("mailchimp")); //28

        System.out.println("çççççç -> " + CalculatorScrabble.result("çççççç")); //Element it's not present on the map

        System.out.println("aaaçãçç -> " + CalculatorScrabble.result("ççãçç")); //Element it's not present on the map
    }
}
