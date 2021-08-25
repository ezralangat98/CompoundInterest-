import java.util.Scanner;

public class compoundInterest {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Amount;
        double P;
        double R;
        double n;
        double t;

        System.out.println("Enter the Principle Amount P");
        P = scanner.nextDouble();

        System.out.println("Enter the Rate R");
        R = scanner.nextDouble();

        System.out.println("Enter the Number of times interest is compounded per unit t");
        n = scanner.nextDouble();

        System.out.println("Enter the time money is invested for t");
        t = scanner.nextDouble();

        //Amount = P(1+R/n)(nt)-P
        Amount = P*Math.pow(1+(R/t),P);
        System.out.println("Compound Interest Is: " + Amount);
        System.out.println(Math.pow(5,2));




    }
}
