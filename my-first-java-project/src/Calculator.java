import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("---Calculadora----");
        System.out.println("|1-Soma          |");
        System.out.println("|2-Subtração     |");
        System.out.println("|3-Multiplicação |");
        System.out.println("|4-Divisão       |");
        System.out.println("|5-Sair          |");
        System.out.println("------------------");
        System.out.println("Escolha a operação:");

        Double num1;
        Double num2;
        
        int operador = myObj.nextInt();

        if(operador != 5){
            System.out.println("Digite dois números:");

            num1 = myObj.nextDouble();
            num2 = myObj.nextDouble();
        
            switch(operador) {
                case 1:
                    System.out.print(soma(num1, num2));
                    break;
                case 2:
                    System.out.print(sub(num1, num2));
                    break;
                case 3:
                    System.out.print(mult(num1, num2));
                    break;
                case 4:
                    System.out.print(sub(num1, num2));
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar a calculadora :)");
                    break;
            };
        };

        myObj.close();
    };

    public static String soma(Double number1, Double number2) {
        Double resultado = number1 + number2;

        return "Resultado final é: " + Double.toString(resultado);
    };

    public static String sub(Double number1, Double number2) {
        Double resultado = number1 - number2;
        
        return "Resultado final é: " + Double.toString(resultado);  
    };

    public static String mult(Double number1, Double number2) {
        Double resultado = number1 * number2;
        
        return "Resultado final é: " + Double.toString(resultado);  
    };

    public static String div(Double number1, Double number2) {
        Double resultado = number1 / number2;
        
        return "Resultado final é: " + Double.toString(resultado);  
    };
};
