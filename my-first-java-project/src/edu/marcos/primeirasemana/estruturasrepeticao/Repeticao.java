package edu.marcos.primeirasemana.estruturasrepeticao;

public class Repeticao {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int contador = 0; contador < alunos.length; contador++) {
            System.out.println("O aluno no índice x= "+ contador + " é " + alunos[contador]);
        }
    }
}
