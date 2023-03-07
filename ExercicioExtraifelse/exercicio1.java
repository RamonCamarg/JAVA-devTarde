package ExercicioExtraifelse;

import java.util.Scanner;

public class exercicio1 {
    Scanner sc = new Scanner(System.in);
    public void ex1(){
            System.out.println("Digite um numero");
            int numero = sc.nextInt();
            if (numero%2 == 0) {
                System.out.println("Portanto o numero será PAR");
            } else {
                System.out.println("Portanto o numero será IMPAR");
            }
       }
       public void ex2(){
        System.out.println("Informe a nota do Aluno");
        int nota = sc.nextInt();
        if (nota>=7) {
            System.out.println(" Você foi aprovado");
            }
              else if (nota >= 5 ) {
            System.out.println("Você está de recuperação");
        }
           
        else {
            System.out.println("Você foi reprovado");
        }
        }

        public void ex3(){
         System.out.println("Digite uma letra");
         String N = sc.next();
         N = N.toUpperCase();
         if (N.equals("A")|| N.equals("E") || N.equals("I") || N.equals("O") || N.equals("U")){
            System.out.println("Essa letra é vogal");
         }
        
         else{
            System.out.println("Essa letra e cosoante");
         }
        }

        public void ex4 (){
            System.out.println("Digite o salário do colaborador");
            double salario = sc.nextDouble();
            double percentualaumento;
            double salariofinal;
            double aumento;
            if (salario <= 1280){
            percentualaumento = 0.2;
            aumento = salario*percentualaumento;
            salariofinal = salario+aumento;
            }
            
            else if (salario >= 1280 && salario < 1700){
                percentualaumento = 0.15;
                aumento = salario*percentualaumento;
                salariofinal = salario+aumento;
            }

            else if (salario >= 1700 && salario < 2500){
                percentualaumento = 0.1;
                aumento = salario*percentualaumento;
                salariofinal = salario+aumento;
            }

            else {
                percentualaumento = 0.05;
                aumento = salario*percentualaumento;
                salariofinal = salario+aumento;
            }
            System.out.println("O salário do colaborador antes do reajuste é R$"+salario);
            System.out.println("O salário do colaborador depois do reajuste é R$"+salariofinal);
            System.out.println("O aumento do salário foi de R$"+aumento);
            System.out.println("O percentual do aumento do salário foi de "+percentualaumento+" vezes");
        }
    }