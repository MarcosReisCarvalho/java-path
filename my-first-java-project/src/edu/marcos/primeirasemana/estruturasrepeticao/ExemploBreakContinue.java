package edu.marcos.primeirasemana.estruturasrepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int contador = 1; contador <= 5; contador++) {
            if (contador == 3)
                continue; // Não para a aplicação, mas mudou o fluxo, o número 3 não foi impresso no console.
            System.out.println(contador);
        }
    }
}
