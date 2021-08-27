import java.util.Scanner;
public class Questao1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int a;
System.out.println("Digite o valor de A:");
a = input.nextInt();
while (a == 0) {
System.out.println("O valor de A não pode ser zero");
System.out.println("Digite o valor de A:");
a = input.nextInt();
}
System.out.println("Digite o valor de B: ");
    double b = input.nextInt();
    System.out.println("Digite o valor de C: ");
    double c = input.nextInt();
      double discriminante = ((b*b) - 4*a*c);
      if (discriminante >= 0){
      double raiz1 = (-b + Math.sqrt(discriminante) ) / 2*a; 
      double raiz2 = (-b - Math.sqrt(discriminante) ) / 2*a; 
        System.out.println("raiz1 = " + raiz1);
        System.out.println("raiz2 = " + raiz2);
      }if (discriminante < 0){
            System.out.println("Não há soluções que possam ser expressas com o conjunto dos números reais");
        }
      }
	}
