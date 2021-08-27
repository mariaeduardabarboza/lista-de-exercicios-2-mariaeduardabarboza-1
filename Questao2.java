import java.io.IOException;
import java.util.Scanner;
public class Questao2
{
	public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.print("Digite o valor da coordenada do x1: ");
    double x1 = input.nextDouble();
    System.out.print("Digite o valor de coordenada do y1: ");
    double y1 = input.nextDouble();
    System.out.print("Digite o valor de coordenada do z1: ");
    double z1 = input.nextDouble();
     System.out.print("Digite o valor de coordenada do x2: ");
    double x2 = input.nextDouble();
    System.out.print("Digite o valor de coordenada do y2: ");
    double y2 = input.nextDouble();
    System.out.print("Digite o valor de coordenada do z2: ");
    double z2 = input.nextDouble();
    
      double distanciaAB = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)+Math.pow(z2-z1,2));
        System.out.println("distância entre A e B é: " + distanciaAB);
      
     }
}

