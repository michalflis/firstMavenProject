package enhacedCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sum sum = new Sum();
        Subtract subtract = new Subtract();
        Multiply multiply = new Multiply();
        Divide divide = new Divide();

        System.out.println("Wybierz działanie jakie chcesz wykonać:\n" +
                "Dodawnia naciśnij \"+\"\n" +
                "Odejmowanie naciśnij \"-\"\n" +
                "Mnożenie naciśnij \"*\"\n" +
                "Dzielenie naciśnij \"/\"");
        String sign = scanner.nextLine();
        System.out.println("Podaj pierwszą liczbę");
        double figureA = scanner.nextDouble();
        System.out.println("Podaj drugą liczbę");
        double figureB = scanner.nextDouble();
        System.out.print(figureA + " " + sign + " " + figureB + " = " );

        switch (sign){
            case "+" : System.out.println(sum.doMath(figureA, figureB)); break;
            case "-" : System.out.println(subtract.doMath(figureA, figureB)); break;
            case "*" : System.out.println(multiply.doMath(figureA, figureB)); break;
            case "/" : System.out.println(divide.doMath(figureA, figureB)); break;
        }

    }

}
