import java.util.Scanner;

public class Ex003 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Captar a entrada do Usuario

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();         // Captar o nome do Usuario

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();            // Captar a idade do Usuario

        System.out.println("Olá, " + nome + " sua idade é: " + idade);

        entrada.close();
    }
}
