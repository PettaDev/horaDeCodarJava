import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número para ver se ele é positivo, negativo ou neutro ");
        float numero = entrada.nextFloat();

        if (numero < 0){
            System.out.println(numero + " é um número negativo");
        }

        if (numero == 0){
            System.out.println(numero + " é um número neutro");
        }

        if (numero > 0){
            System.out.println(numero + " é um número positivo");
        }

        entrada.close();
    }
}
