package edu.marcos.primeirasemana.estruturasrepeticao;

public class Repeticao {
    public static void main(String[] args) {
        String[] alunos = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int contador = 0; contador < alunos.length; contador++) {
            System.out.println("FOR - O aluno no índice x= " + contador + " é " + alunos[contador]);
        }

        System.out.println(" ");

        for (String aluno : alunos) {
            System.out.println(" FOR EACH - O nome do aluno é: " + aluno);
        }
    }
}