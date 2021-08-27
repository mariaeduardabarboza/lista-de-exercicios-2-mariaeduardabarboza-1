import java.io.IOException;
import java.util.Scanner;
public class Questao5
{
public static void main(String[] args) throws IOException {
   Scanner input = new Scanner (System.in);
  for (int multiplicando = 1; multiplicando<=10; multiplicando++)
  { System.out.println ("Tabuada do número: "+multiplicando);
  for (int multiplicador = 1; multiplicador<=10; multiplicador++) 
  System.out.println (multiplicando+" x "+multiplicador+" = "+ multiplicando*multiplicador); 
  }
}
}
