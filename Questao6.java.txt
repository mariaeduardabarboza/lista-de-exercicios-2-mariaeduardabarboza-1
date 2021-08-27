import java.io.IOException;
import java.util.Scanner;
public class Questao6
{
public static void main(String[] args) throws IOException {
   Scanner input = new Scanner (System.in);
   System.out.println("Digite o número:");
  int numero = input.nextInt();
String quantdigitos = Integer.toString(numero);
System.out.println("A quantidade de dígitos é:"+quantdigitos.length());
  }
}
