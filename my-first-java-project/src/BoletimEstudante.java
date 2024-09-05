import java.util.Scanner;

public class BoletimEstudante {
    public static void main(String[] args){
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Digite sua média:");
            
            Double media = myObj.nextDouble();
            System.out.println(verification(media));
        }
    }

    public static String verification(Double media){
        if(media < 6)
            return "Reprovado";
        else if (media == 6)
            return "Prova de minerva";
        else 
            return "Aprovado";
    }
}
