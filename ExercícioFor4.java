import java.util.Scanner;

public class ExercícioFor4 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       int idade;
       double altura; 

       double somaAlturas = 0;
       int contadorPessoas = 0; 

       for(int i = 1; i <= 10 ; i++){
        System.out.println("Digite a idade da pessoa " + i +":");
        idade = scanner.nextInt();

        System.out.println("Digite a altura da pessoa "+ i + ":");
        altura = scanner.nextDouble();

        if(idade >= 50 ){
            somaAlturas += altura;
            contadorPessoas++;
        }
        }

        if (contadorPessoas > 0) {
            double media = somaAlturas / contadorPessoas;
            System.out.println("Média das alturas (mais de 50 anos): " + media);
        } else {
            System.out.println("Nenhuma pessoa com mais de 50 anos.");
        }
    }
}