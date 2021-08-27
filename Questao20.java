public class Questao20 {
    private static String nomepessoa;
    private static String numeropessoa;
    static int variavel = 1;

    public class Agenda{

        public void firstpart(){
            System.out.println(" Agenda: " + (variavel++) + "\n");
            System.out.println("variavel");
        }
        public void basicinformattion(){
            System.out.println("Insira informações básicas do contato:");
            System.out.println("Insira o nome da pessoa desejada" + nomepessoa);
            System.out.println("Número dela: " + numeropessoa);
        }
        public class Contato{
            public void setNomepessoa(String variavel){
                nomepessoa = variavel;
            }
            public String getNomepessoa(){
                return nomepessoa;
            }
    
            public void setNumeropessoa(String variavel){
                numeropessoa = variavel;
            }
            public String getNumeropessoa(){
                return numeropessoa;
            }
            }

        }
}
