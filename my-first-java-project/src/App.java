import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Digite seu primeiro nome e segundo nome abaixo do primeiro: ");
            
            //String Input
            String name = myObj.nextLine();
            String name2 = myObj.nextLine();
            
            System.out.print(nome(name, name2));
        }
    }

    public static String nome(String primerioNome, String segundoNome) {
        return "metodo retorno: " + primerioNome.concat(" ").concat(segundoNome);
    };
}
