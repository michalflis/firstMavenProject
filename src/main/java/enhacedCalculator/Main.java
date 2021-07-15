package enhacedCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EnhancedCalculator enhancedCalculator = new EnhancedCalculator();

        System.out.println("Wybierz działanie jakie chcesz wykonać:\n" +
                "Dodawnia naciśnij \"+\"\n" +
                "Odejmowanie naciśnij \"-\"\n" +
                "Mnożenie naciśnij \"*\"\n" +
                "Dzielenie naciśnij \"/\"");
        String sign = scanner.nextLine();
        System.out.println("Podaj pierwszą liczbę");
        int figureA = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int figureB = scanner.nextInt();
        System.out.print(figureA + " " + sign + " " + figureB + " = " );

        switch (sign){
            case "+" : System.out.println(enhancedCalculator.sum(figureA, figureB)); break;
            case "-" : System.out.println(enhancedCalculator.subtract(figureA, figureB)); break;
            case "*" : System.out.println(enhancedCalculator.multiply(figureA, figureB)); break;
            case "/" : System.out.println(enhancedCalculator.divide(figureA, figureB)); break;
        }

    }

}
