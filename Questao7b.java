import java.util.Scanner;
public class Questao7b {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
int codigo;
do {
System.out.print("Informe o código: ");
codigo = teclado.nextInt();
System.out.println("Código: " + codigo);
System.out.println("Informe o código: ");
codigo = teclado.nextInt();
} while (codigo != -1);
}
}
