    import java.util.Random;
    import java.util.Scanner;
    
    public class AtividadeFormativa1 {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        public void atividade1() {
            
            System.out.println("Por favor dígite o número de colunas desejadas:");
            int col= sc.nextInt();
            System.out.println("Por favor dígite o número de Linhas desejadas");
            int row= sc.nextInt();
            
            int tab[][] = new int[col][row];
    
            for(int i = 0; i<col; i++){
                for (int j = 0; j < row; j++){
                    tab[i][j] = rd.nextInt(9);
                }
            }
            for (int i = 0; i < col; i++){
                System.out.print(" |  ");
                for (int j = 0; j < row; j++) {
                    System.out.print(+tab[i][j] + " ");
                }
                System.out.println(" | ");
            }
            System.out.println("==================");
            for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++){
                tab[i][j] = rd.nextInt(9);
                if(i > j) {
                    tab[i][j] = 1;
                }
                if(i == j) {
                    tab[i][j] = 0;
                }
                if(i < j) {
                    tab[i][j] = 2;
                }
                
            }
            }
            for (int i = 0; i < col; i++){
                System.out.print(" | ");
                for (int j = 0; j < row; j++){
                    System.out.print(+tab[i][j]+" ");
                }
                System.out.println(" | ");
    
            }
    }

    public void atividade2() {
        Random rd = new Random();
        int cont = 1;
        int valorSorteado = rd.nextInt(1000);
        boolean tenteNovamente = true;
        while (tenteNovamente) {
            System.out.println("Digite um Nº");
            int nDigitado = sc.nextInt();
            if (nDigitado == valorSorteado) {
                System.out.println("Acertouuuuuuuuuuuuu!!!!!!");
                System.out.println("Números de tentativas: " + cont);
                tenteNovamente = false;
            } else if (nDigitado > valorSorteado) {
                System.out.println("O valor sorteado é menor do que o número digitado");
                cont++; 
            } else if (nDigitado < valorSorteado) {
                System.out.println("O valor sorteado é maior que o número digitado");
                cont++;
            }
        }
    }
    public void atividade3() {
        int tamanhoVetor = (rd.nextInt(900)+100);
        int vetor[] = new int[tamanhoVetor];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (rd.nextInt(99)+1);
        }

        System.out.println("Os Nº pares são: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0) {
                System.out.println("vetor["+i+"]= "+vetor[i]);
            }
        }
        System.out.println("=======================================");
        System.out.println("Os Nº ímpares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1) {
                System.out.println("vetor["+i+"]= "+vetor[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println("Os Nº pares nas posições ímpares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 0 && (i+1)%2 == 1) {
                System.out.println("Vetor posição: "+(i+1)+" = "+vetor[i]);
            }
        }
        System.out.println("=============================================");
        System.out.println("Os Nº ímpares nas posições pares são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i]%2 == 1 && (i+1)%2 == 0) {
                System.out.println("Vetor posição: "+(i+1)+" = "+vetor[i]);
            }
        }
    }
}