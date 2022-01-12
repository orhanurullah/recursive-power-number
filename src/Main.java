import java.util.Scanner;

public class Main {

    static int pow(int base,int exp){
        if(exp == 0){
            return 1;
        }
        return base*pow(base,exp-1);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Taban Değerini Girin : ");
        int base = scanner.nextInt();
        System.out.print("Üs Değerini Girin : ");
        int exponent = scanner.nextInt();
        System.out.println(pow(base,exponent));
    }
}
