import javax.swing.JOptionPane;
 
public class Questao15
{
public static void main (String[]args)
{
String firstnota, secondnota,thirdnota;
double not1, not2, not3, mediaaluno;
 
  firstnota = JOptionPane.showInputDialog("Digite a primeira nota:");
 
  not1= Double.parseDouble(firstnota);
  
  secondnota = JOptionPane.showInputDialog("Digite a segunda nota:");
  not2 = Double.parseDouble(secondnota);
 
 thirdnota = JOptionPane.showInputDialog("Digite a terceira nota:");
  not3 = Double.parseDouble(thirdnota);
  
  mediaaluno = (not1+not2+not3)/3;
  if (mediaaluno>=6.0)
  {
    JOptionPane.showMessageDialog(null,"Média:"+mediaaluno,"Aprovado",JOptionPane.INFORMATION_MESSAGE);
  } if
 (mediaaluno < 6.0 & mediaaluno > 4.0){
   JOptionPane.showMessageDialog(null,"Média:"+mediaaluno, "Verificação Suplementar", JOptionPane.WARNING_MESSAGE);
 }
  if (mediaaluno<4.0)
  {
  JOptionPane.showMessageDialog(null,"Média:"+mediaaluno, "Reprovado", JOptionPane.WARNING_MESSAGE);
  }
 
   System.exit(0);
}
}
