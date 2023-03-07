package ExercicioOperadores;

import java.util.Scanner;

public class NotaFrequencia {
    Scanner sc = new Scanner(System.in);
    public void calcular (){
        System.out.println("Informe a nota 1 do Aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Informe a nota 2 do Aluno:");
        int nota2 = sc.nextInt();
        //Operação Aritmética
        double mediaAluno = (nota1+nota2)/2;
        //Operação Atribuição
        // mediaAluno = nota1;
        //mediaAluno += nota2;
        //mediaAluno /= 2;
        System.out.println("a Média do Aluno é"+ mediaAluno);
        //Operação Relacional 
        boolean mediaAprovada = mediaAluno>=50;
        System.out.println("O aluno Está Aprovado por Nota?"+mediaAprovada);
        System.out.println("Informe a Frequência do Aluno");
        int frequeciaAluno = sc.nextInt();
        boolean frequeciaAprovada = frequeciaAluno>=75;
        System.out.println("O Aluno está Aprovado por Frequência?"+frequeciaAprovada);
        //Operação Lógica 
        boolean resultadoFinal = (mediaAprovada==true)
         && (frequeciaAprovada==true);
         System.out.println("O Aluno está aprovado no curso?"+resultadoFinal);
    }
}
