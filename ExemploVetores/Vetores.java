package ExemploVetores;

public class Vetores {
    //Criando método
    public void exemplo1(){
        //Criando um vetor
        double[] valores = new double[]{10.5,20.7,30.6,40.4};
        System.out.println("1º Posição- Índice[0]:" +valores[0]);
        System.out.println("2º Posição- Índice[1]:" +valores[1]);
        System.out.println("3º Posição- Índice[2]:" +valores[2]);
        System.out.println("4º Posição- Índice[3]:" +valores[3]);
        //Mudando valores de uma posição definida
        valores[0] = 15.6; // Mudando o valor do índice[0]
        System.out.println("1º Posição- índice[0]" +valores[0]);
         
    }
}
