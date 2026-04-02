import java.util.Scanner;

import javafx.scene.media.Media;

public class ExercícioFor5 {

    public static void main(String[] args) {   
        Scanner scanner = new Scanner(System.in);
        
        float nota1, nota2;      
        int alunos;
        int totalAprovados = 0;
        int totalExame = 0;
        int totalReprovados = 0;
        double somaDasMedias = 0;

        for(alunos = 1; alunos <= 6; alunos++){
            System.out.println("Digite as notas do aluno numero " + alunos + " : ");
            nota1 = scanner.nextFloat();
            nota2 = scanner.nextFloat();
            double media = (nota1 + nota2) / 2;
            somaDasMedias += media ; 

            if(media <= 3){
                System.out.println("O aluno numero " + alunos + ": REPROVADO");
                totalReprovados++;
            }
            else if( media < 7){
                System.out.println("O aluno numero " + alunos + ": EXAME");
                totalExame ++;
            }
            else if(media >= 7){
                System.out.println("O aluno numero " + alunos +": APROVADO");
                totalAprovados++;
            }
        }
        double mediaClasse = somaDasMedias / 6; 

        System.out.println("Total de Aprovados: " + totalAprovados);
        System.out.println("Total de Exame: " + totalExame);
        System.out.println("Total de Reprovados: " + totalReprovados);
        System.out.println("Média Geral da Classe: " + mediaClasse);
        


    }
}