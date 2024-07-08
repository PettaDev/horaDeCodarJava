import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); // Captar a entrada do Usuario
        System.out.println("Digite seu nome: ");  // Mostrar que o Usuario precisa colocar seu nome
        String nomeUsu = entrada.nextLine();      // Captar o nome do Usuario

        System.out.println("Olá, " + nomeUsu + "!"); // Imprimir a mensagem + o nome do Usuario

        entrada.close(); // Objeto usado para fechar o Scanner
    }
}
