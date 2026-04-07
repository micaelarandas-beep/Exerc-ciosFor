import java.util.Scanner;

public class ExercícioFor7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int Idade;
        float Altura;
        float Peso;

        int cIdade = 0;
        float SomarAltura = 0;
        int cAltura = 0;
        int cPeso = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Pessoa " + i + " Qual a sua idade: ");
            Idade = scanner.nextInt();

            System.out.println("Pessoa " + i + " Qual a sua altura: ");
            Altura = scanner.nextFloat();

            System.out.println("Pessoa " + i + " Qual o seu peso: ");
            Peso = scanner.nextFloat();

            if (Idade > 50) {
                cIdade++;
            }

            if (Idade >= 10 && Idade <= 20) {
                SomarAltura += Altura;
                cAltura++;
            }

            if (Peso < 40) {
                cPeso++;
            }
        }

        float media = SomarAltura / cAltura;
        float porcentagem = (cPeso / 10.0f) * 100;

        System.out.println("Pessoas com mais de 50 anos: " + cIdade);
        System.out.println("Média de altura (10 a 20 anos): " + media);
        System.out.println("Porcentagem abaixo de 40kg: " + porcentagem + "%");

       
    }
}