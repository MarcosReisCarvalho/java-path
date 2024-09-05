import java.util.Scanner;

public class BoletimEstudante {
    public static void main(String[] args){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Digite sua média:");
            
            Double media = myObj.nextDouble();
            if(media < 6)
                System.out.println("Reprovado");
            else if (media == 6)
                System.out.println("Prova minerva");
            else 
                System.out.println("Aprovado");
        }
    }
}
