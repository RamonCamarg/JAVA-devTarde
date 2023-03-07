package CalculadoraGastoViagem;

public class CustoViagem {
    public static void main(String[] args) {
      System.out.println("===Custo de Viagem===");
      double distanciaViagem = 148;
      System.out.println("Distancia Total da Viagem é: "+distanciaViagem+"KM");
      double valorGasolina = 5;
      System.out.println("O Valor do Litro da Gasolina é:"+valorGasolina+"reais");
      double distanciaPorLitro = 10;
      System.out.println("O Veiculo Percorre "+distanciaPorLitro+"KM");
      double quantidadeLitros = distanciaViagem/distanciaPorLitro;
      double custoViagem = quantidadeLitros*valorGasolina;
      System.out.println("O Custo da Viagem será de "+custoViagem+"reais");
    }
}
