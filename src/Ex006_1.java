import java.util.Scanner;

public class Ex006_1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite 4 números inteiros diferentes: ");
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();
        int d = entrada.nextInt();

        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("O maior é: " + max(a,b,c,d));
        } else {
            System.out.println("ERROR: Os valores informados são iguais!");
        }

        entrada.close();
    }

    // Criando uma função para encontrar o maior valor entre três números
    public static int max(int a, int b, int c, int d) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max){
            max = d;
        }
        return max;
    }

}