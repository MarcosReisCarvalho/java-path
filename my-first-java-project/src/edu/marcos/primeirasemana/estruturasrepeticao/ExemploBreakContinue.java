package edu.marcos.primeirasemana.estruturasrepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 5; contador++) {
            if (contador == 3)
                continue;
            System.out.println(contador);
        }
    }
}
