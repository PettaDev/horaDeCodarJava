import java.util.Scanner;


public class Ex006 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 3 números inteiros diferentes: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a != b && a != c && b != c) {
            System.out.println("O maior é: " + max(a,b,c));
        } else {
            System.out.println("ERROR: Os valores informados são iguais!");
        }

        entrada.close();
    }

    // Criando uma função para encontrar o maior valor entre três números
    public static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

}
