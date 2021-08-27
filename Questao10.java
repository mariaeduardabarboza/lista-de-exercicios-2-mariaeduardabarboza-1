import java.io.IOException;
import java.util.Scanner;
public class Questao10 {
public static void main(String[] args) throws IOException {
   Scanner input = new Scanner (System.in);
        double investimento = input.nextDouble();
        double taxajuros = input.nextDouble();
        double taxadecimal = taxajuros/100;
      
while( investimento!=0){
double retornofinanceiro =  Math.pow(taxadecimal ,12)+investimento *12;
retornofinanceiro++;
System.out.println("Saldo do investimento após 1 ano: "+retornofinanceiro);  
System.out.println("Deseja processar mais um ano (S/N): ");
String resposta = input.next();
 if (resposta.matches("[S]*")){
   retornofinanceiro++;
 continue;
 } if (resposta.matches("[N]*")){
   System.out.println("Fim do programa");
   break;
   }
 }
 }
}
