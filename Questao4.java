import java.io.IOException;
import java.util.Scanner;
public class Questao4
{
	public static void main(String[] args) throws IOException {
	    Scanner input = new Scanner (System.in);
        System.out.println ("Digite o nome do produto:");
        String nomedoproduto = input.next();
        System.out.println ("Digite o preço do produto:");
        double preco = input.nextDouble();
         System.out.println ("Digite a quantidade do produto:");
        double quantidade = input.nextDouble();
        if (quantidade <=10){
        double precototal = preco * quantidade;
        System.out.println(nomedoproduto+" custa:"+precototal);
        }if (quantidade > 10 & quantidade < 21){
        double totaldesconto10 = (preco * quantidade)*0.9;
       System.out.println(nomedoproduto+" custa:"+totaldesconto10);
	    }if (quantidade > 20 & quantidade < 50){
	    double totaldesconto20 = (preco * quantidade)*0.8;
	   System.out.println(nomedoproduto+" custa:"+totaldesconto20);
	    } if (quantidade > 50){
	   double totaldesconto25 = (preco*quantidade)*0.75;
	    System.out.println(nomedoproduto+" custa:"+totaldesconto25);
	    }
	}
}
