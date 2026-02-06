import java.util.Scanner;

public class MayoryMenor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("es mayor");
            System.out.println(a);
            System.out.println("es Menor");
            System.out.println(b);
        } else if (b > a) {
            System.out.println("es mayor");
            System.out.println(b);
            System.out.println("es Menor");
            System.out.println(a);
           
        } else if (b == a) {
            System.out.println("Iguales");
        }
    }
    
}
