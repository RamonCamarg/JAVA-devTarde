package ExercicioIF1;

import java.util.Scanner;

public class Exercicio1 {
    Scanner sc = new Scanner(System.in);
    public void ex1() {
        System.out.println("Informe o Primeiro Numero ");
        double primeiroNumero = sc.nextDouble();
        System.out.println("Informe o Segundo Numero");
        double segundoNumero = sc.nextDouble();
        if (primeiroNumero>=segundoNumero) { 
            System.out.println("O maior numero é "+primeiroNumero);
        }
        if (segundoNumero>=primeiroNumero) {
            System.out.println("O maior numero é "+segundoNumero);
        }
    }
    public void ex2() {
        System.out.println("Informe seu ano de nascimento");
        int anoNasc = sc.nextInt();
        int idade = 2023 - anoNasc;
        if (idade>16) {
            System.out.println("Voce pode votar");
        } else {
            System.out.println("Voce não pode votar");
        }
    }
    public void ex3() {
        System.out.println("Digite a senha de 4 dígitos");
        int senha = sc.nextInt();
        if (senha == 1234) {
            System.out.println("Acesso PERMITIDO");
        } else {
            System.out.println("Acesso NEGADO");
        }

        
    }
    public void ex4() {
        System.out.println("Quantas maçãs você deseja comprar? ");
        double macas = sc.nextDouble();
        double preco = 0.25;
        if (macas<12) {
             preco = 0.3;
        }
        double valorFinal = macas*preco;
            
        System.out.println("O valor da compra será de R$ "+valorFinal);
    }
    public void ex5() {
        System.out.println("Digite um numero");
        int um = sc.nextInt();
        System.out.println("Agora, digite outro numero");
        int dois = sc.nextInt();
        System.out.println("Por ultimo, digite mais um número");
        int tres = sc.nextInt();
        int primeiro;
        int segundo;
        int terceiro;
        if (um>dois && dois>tres) {
            primeiro = um;
            segundo = dois;
            terceiro = tres;
        }  else if (um>dois && dois<tres) {
            primeiro = um;
            segundo = tres;
            terceiro = dois;
        }
        else if (dois>um && um>tres) {
            primeiro = dois;
            segundo = um;
            terceiro = tres;
        }
        else if (dois>um && um<tres) {
            primeiro = dois;
            segundo = tres;
            terceiro = um;
        }
        
        else if (tres>um && um>dois) {
            primeiro = tres;
            segundo = um;
            terceiro = dois;
        }
        else{ 
            primeiro= tres;
            segundo= dois;
            terceiro= um;
        }

        System.out.println("Do maior para o menor fica: "+primeiro+" "+segundo+" "+terceiro);
    }
      
    public void ex6() {
        System.out.println("Digite seu sexo (1:Feminino - 2:Masculino)");
        int sexo = sc.nextInt();
        System.out.println("Digite sua altura (em metros)");
        double altura = sc.nextDouble();
        double pesoIdeal;
        if ( sexo == 1) {
            pesoIdeal = (62.1*altura)-44.7;

        } else {
            pesoIdeal = (72.7*altura)-58;
        }
        System.out.println("Seu peso Ideal é de "+pesoIdeal+"KG");
        
    }
    public void ex7() {
        System.out.println("Digite a primeira nota do aluno:");
        int nota1 = sc.nextInt();
        System.out.println("Digite a segunda nota do aluno:");
        int nota2 = sc.nextInt();
        System.out.println("Digite a frequência doa aluno:");
        int freq = sc.nextInt();
        double notaMedia = (nota1+nota2)/2;
        if (notaMedia >= 50 && freq >= 75) {
            System.out.println("O aluno está aprovado");
        } else {
            System.out.println("o aluno está reprovado");
        }
    }
}