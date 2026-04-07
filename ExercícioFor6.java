import java.util.Scanner;

public class ExercícioFor6{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;
        int nulos = 0, brancos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite o voto do eleitor " + i + ": ");
            int voto = scanner.nextInt();

            if (voto == 1) {
                c1++;
            } else if (voto == 2) {
                c2++;
            } else if (voto == 3) {
                c3++;
            } else if (voto == 4) {
                c4++;
            } else if (voto == 5) {
                nulos++;
            } else if (voto == 6) {
                brancos++;
            } else {
                System.out.println("Voto inválido!");
                i--; 
            }
        }

        System.out.println("RESULTADOS:");
        System.out.println("Candidato 1: " + c1);
        System.out.println("Candidato 2: " + c2);
        System.out.println("Candidato 3: " + c3);
        System.out.println("Candidato 4: " + c4);
        System.out.println("Votos nulos: " + nulos);
        System.out.println("Votos em branco: " + brancos);

        double percentual = ((nulos + brancos) / 10.0) * 100;
        System.out.println("Percentual de nulos e brancos: " + percentual + "%");

        
    }
}