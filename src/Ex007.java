import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros diferentes: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a != b && a != c && b != c) {
            int soma;

            if ((a > b && a < c) || (a > c && a < b)) {
                soma = a + Math.max(b, c);
            } else if ((b > a && b < c) || (b > c && b < a)) {
                soma = b + Math.max(a, c);
            } else {
                soma = c + Math.max(a, b);
            }

            System.out.println("A soma dos dois maiores valores é: " + soma);

        } else {
            System.out.println("ERROR: Os valores informados são iguais!");
        }
        entrada.close();
    }
}

