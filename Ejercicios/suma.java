public class suma {
    public static void main(String[] args) {
        int suma = 0;
        int i = 1;

        do {
            suma += i;
            i++;
        } while (i <= 50);

        System.out.println(suma);
    }
}

