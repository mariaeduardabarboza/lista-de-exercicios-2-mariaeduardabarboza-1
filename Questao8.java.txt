import java.io.IOException;

import java.util.Scanner;
public class Questao8 {
public static void main(String[] args) {
  int firstnumber = 1;
  int secondnumber = 0;
  int number;
  Scanner leitor = new Scanner(System.in);    
  System.out.println("Digite um n:") ;
  int n = leitor.nextInt();
  int s = n+1;
  for(int i = 0; i < s; i++){
  System.out.println (secondnumber);
  number = secondnumber;
  secondnumber = firstnumber + secondnumber;
  firstnumber = number;
 }
  }
    
}
