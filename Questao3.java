import java.io.IOException;
import java.util.Scanner;
public class Questao3
{
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in); 
	double x1, y1, x2, y2, d;
	System.out.println("Digite as coordenadas x e y dos pontos, respectivamente:");
	x1 = teclado.nextFloat();
	y1 = teclado.nextFloat(); 
	x2 = teclado.nextFloat(); 
	y2 = teclado.nextFloat(); 
	d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); 
	System.out.println("A distância é: " + d);
	    
	} 
    
}

