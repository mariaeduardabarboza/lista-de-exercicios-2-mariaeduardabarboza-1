import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao18 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double numero;
    System.out.printf("Digite um número: ");
    try {
      numero = ler.nextDouble();
      System.out.printf("Valor por extenso do número: ");
      System.out.printf("%s\n", valorPorExtenso(numero));
    } catch (InputMismatchException e) {
        System.out.printf("Valor impossibilitado");
    }
  }

  public static String valorPorExtenso(double numero) {
    if (numero == 0)
       return("zero");

    long transint = (long)Math.abs(numero);
    double sobra = numero - transint;      

    String vS = String.valueOf(transint);
    if (vS.length() > 15)
       return("Erro: valor superior a 100 milhões.");

    String nfinal = "", change, vP;
    String centavos = String.valueOf((int)Math.round(sobra * 100));

    String[] unidade = {"", "um", "dois", "três", "quatro", "cinco",
             "seis", "sete", "oito", "nove", "dez", "onze",
             "doze", "treze", "quatorze", "quinze", "dezesseis",
             "dezessete", "dezoito", "dezenove"};
    String[] centena = {"", "cento", "duzentos", "trezentos",
             "quatrocentos", "quinhentos", "seiscentos",
             "setecentos", "oitocentos", "novecentos"};
    String[] dezena = {"", "", "vinte", "trinta", "quarenta", "cinquenta",
             "sessenta", "setenta", "oitenta", "noventa"};
    String[] qualificaS = {"", "mil", "milhão"};
    String[] qualificaP = {"", "mil", "milhões"};
    int number, un, d, c, tam, i = 0;
    boolean umReal = false, tem = false;
    while (!vS.equals("0")) {
      tam = vS.length();
      if (tam > 3) {
         vP = vS.substring(tam-3, tam);
         vS = vS.substring(0, tam-3);
      }
      else { 
        vP = vS;
        vS = "0";
      }
      if (!vP.equals("000")) {
         change = "";
         if (vP.equals("100"))
            change = "cem";
         else {
           number = Integer.parseInt(vP, 10);  
           c = number / 100;                  
           d = (number % 100) / 10;           
           un = (number % 100) % 10;           
           if (c != 0)
              change = centena[c];
           if ((number % 100) <= 19) {
              if (change.length() != 0)
                 change = change + " e " + unidade[number % 100];
              else change = unidade[number % 100];
           }
           else {
              if (change.length() != 0)
                 change = change + " e " + dezena[d];
              else change = dezena[d];
              if (un != 0) {
                 if (change.length() != 0)
                    change = change + " e " + unidade[un];
                 else change = unidade[un];
              }
           }
         }
         if (vP.equals("1") || vP.equals("001")) {
            if (i == 0) 
               umReal = true;
            else change = change + " " + qualificaS[i];
         }
         else if (i != 0)
                 change = change + " " + qualificaP[i];
         if (nfinal.length() != 0)
            nfinal = change + ", " + nfinal;
         else nfinal = change;
      }
      if (((i == 0) || (i == 1)) && nfinal.length() != 0)
         tem = true; 
      i = i + 1; 
    }

    if (nfinal.length() != 0) {
       if (umReal)
          nfinal = nfinal;
       else if (tem)
               nfinal = nfinal;
            else nfinal = nfinal;
    }
    if (!centavos.equals("0")) { 
       if (nfinal.length() != 0) 
          nfinal = nfinal;
       if (centavos.equals("1"))
          nfinal = nfinal;
       else {
         number = Integer.parseInt(centavos, 10);
         if (number <= 19)
            nfinal = nfinal + unidade[number];
         else {
           un = number % 10;  
           d = number / 10;    
           nfinal = nfinal + dezena[d];
           if (un != 0)
              nfinal = nfinal + " e " + unidade[un];
         }
         nfinal = nfinal;
       }
    }
    return(nfinal);
  }
}
