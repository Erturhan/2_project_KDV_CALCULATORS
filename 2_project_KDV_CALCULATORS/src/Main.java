import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);

        double price ,  finalPrice ;
        double KDV= 18  ; // if the value of the VAT is less than 500
        // , if it is greater than 18%, 8% is applied

        System.out.print("Pleas , write ddown the price of your product :");
        price = scan.nextDouble();

        if (price > 0 && price <500){
            KDV = (price/ 100 )* 18 ;
        }
        if (price >= 500){
            KDV = (price/ 100 )* 8 ;
        }

        finalPrice = price + KDV ;

        System.out.println("The  value of KDV : "+ KDV);
        System.out.println("The  value of Final Price : "+finalPrice);

    }
}