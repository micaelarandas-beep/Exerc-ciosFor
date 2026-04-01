import java.util.Scanner;

public class ExercíciosFor3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu numero: ");

        int n = scanner.nextInt();

    
        
        for(int contador = 0; contador <= n; contador++){
            System.out.println( "Sequencia é: " + contador );
        }
    }
}