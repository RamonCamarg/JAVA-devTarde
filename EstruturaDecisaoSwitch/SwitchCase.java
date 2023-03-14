package EstruturaDecisaoSwitch;

import java.util.Scanner;

public class SwitchCase {
    Scanner sc = new Scanner(System.in);
    public void letra(){
        //1. receber a letra digitada pelo usuario
        System.out.println("Informe uma letra");
        String letra = sc.nextLine();
        //2. escolher o resultado referente a letra 
        String tipoLetra = "";
        switch (letra) {
            case "a": tipoLetra="vogal";
                break;
            case "e": tipoLetra="vogal";
                break;
            case "i": tipoLetra="vogal";
                break;
            case "o": tipoLetra="vogal";
                break;
            case "u": tipoLetra="vogal";
                break;
                  default:tipoLetra = "consoante";
                  break;
        }
        //3. mostrar o resultado para o usuario
        System.out.println("A letra que voce digitou é uma " + tipoLetra); 
    }

    public void mes(){
        System.out.println("Informe um numero de 1 a 12");
        int numeroMes = sc.nextInt();
        String mes = "";
        switch (numeroMes) {
            case 1: mes = "Janeiro";
                break;
                case 2: mes = "Fevereiro";
                break;
                case 3: mes = "Março";
                break;
                case 4: mes = "Abril";
                break;
                case 5: mes = "Maio";
                break;
                case 6: mes = "Junho";
                break;
                case 7: mes = "Julho";
                break;
                case 8: mes = "Agosto";
                break;
                case 9: mes = "Setembro";
                break;
                case 10: mes = "Outubro";
                break;
                case 11: mes = "Novembro";
                break;
                case 12: mes = "Dezembro";
                break;
        
            default: mes = "Esse mes não existe";
                break;
        }
        System.out.println("O mes corresponde a esse numero " +mes);
    }
}