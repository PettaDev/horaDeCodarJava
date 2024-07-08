import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Escolher uma das Figuras Planas
        // Captar os valores
        // Calcular e imprimir os valores

        System.out.println("Digite 1- Retângulo; 2- Quadrado; 3- Losango; 4- Trapézio; 5- Paralelogramo; 6- Triângulo; 7- Círculo");
        if (entrada.nextInt() == 1) {

            System.out.println("Digite o valor da base do seu Retângulo: ");
            float base = entrada.nextFloat();

            System.out.println("Digite o valor da altura do seu Retângulo: ");
            float altura = entrada.nextFloat();

            float areaRetangulo = (base * altura);

            System.out.println("O valor da área do Retângulo é: " + areaRetangulo);

        }
        if (entrada.nextInt() == 2) {

            System.out.println("Digite o valor de um dos Lados: ");
            float lado = entrada.nextFloat();

            float areaQuadrado = (lado * lado);

            System.out.println("A área do seu Quadrado é: " + areaQuadrado);

        }
        if (entrada.nextInt() == 3) {

            System.out.println("Digite a diagonal maior do seu Losango: ");
            float diagMaior = entrada.nextFloat();

            System.out.println("Digite a diagonal menor do seu Losango: ");
            float diagMenor = entrada.nextFloat();

            float areaLosango = (diagMaior * diagMenor) / 2;

            System.out.println("A área do seu Losango é: " + areaLosango);

        }
        if (entrada.nextInt() == 4) {

            System.out.println("Digite a base maior do seu Trapézio: ");
            float baseMaior = entrada.nextFloat();

            System.out.println("Digite a base menor do seu Trapézio: ");
            float baseMenor = entrada.nextFloat();

            if (baseMaior < baseMenor) {

                System.out.println("Erro: A base maior deve ser maior que a base menor. Por favor, insira os valores corretos.");

            } else {

                System.out.println("Digite a altura do seu Trapézio: ");
                float altura = entrada.nextFloat();

                float areaTrapez = ((baseMaior + baseMenor) * altura) / 2;
                System.out.println("A área do trapézio é: " + areaTrapez);

            }
        }
        if (entrada.nextInt() == 5) {

            System.out.println("Digite o valor da base do seu Paralelogramo: ");
            float base = entrada.nextFloat();

            System.out.println("Digite o valor da altura do seu Paralelogramo: ");
            float altura = entrada.nextFloat();

            float areaParale = (base * altura);

            System.out.println("O valor da área do Retângulo é: " + areaParale);

        }
        if (entrada.nextInt() == 6) {

            System.out.println("Digite a base do seu Triângulo: ");
            float base = entrada.nextFloat();

            System.out.println("Digite a altura do seu Triângulo: ");
            float altura = entrada.nextFloat();

            float areaTri = (base * altura) / 2;

            System.out.println("A área do seu Triângulo é: " + areaTri );

        }
        if (entrada.nextInt() == 7) {

            System.out.println("Digite o raio do seu Círculo: ");
            double raio = entrada.nextDouble();  // Utilizando double por conta que o PI é um número infinito e precisamos de mais precisão

            double areaCirculo = Math.PI * Math.pow(raio, 2);  // Colando Math. pois se trata de valores matemática como: PI e a POW -> potenciação

            System.out.println("A área do seu Círculo é: " + areaCirculo);

        }

        entrada.close();
    }
}
