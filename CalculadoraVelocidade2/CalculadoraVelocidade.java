package CalculadoraVelocidade2;
import java.util.Scanner;
/**
 * CalculadoraVelocidade
 */
public class CalculadoraVelocidade {
    Scanner sc = new Scanner(System.in);
   public void calcular(){
    System.out.println("Informe a Distância Percorrida");

    double distanciaPercorrida = sc.nextDouble();
    System.out.println("Informe O Tempo Gasto");
    double tempoGasto = sc.nextDouble();
    double velocidadeMedia = distanciaPercorrida/tempoGasto;
    System.out.println("a Velocidade Média é"
    + velocidadeMedia + "Km/h");
      }
      
public void destino() {
    System.out.println("Informe o Seu Ponto de Partida");
    String origem = sc.next();
    System.out.println("Informe o Ponto de Destino");
    String destino = sc.next();
    System.out.println("Você irá de"
     + origem + "até" + destino);
    }
}