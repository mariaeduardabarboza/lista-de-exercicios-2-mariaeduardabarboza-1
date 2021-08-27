import java.io.*;
public class Questao16
{

   private int hora,minuto,segundo;
   public Questao16(int hours,int minutes,int segunds)
   {
      hora = hours;
      minuto = minutes;
      segundo = segunds;
   }
   public void transformar()
   {
     if(++segundo>59)
     {
        segundo = 0;
        if(++minuto>59)
        {
          minuto = 0;
          if(++hora>23)
            hora = 0;
        }
     }
   }
   public void transformar2()
   {
     if(--segundo<0)
     {
        segundo = 59;
        if(minuto<0)
        {
          minuto = 59;
          if(hora<0)
            hora = 23;
        }
     }
   }

   public void mostrar()
   {
      System.out.println("Hora do momento: "+hora+":"+minuto+":"+segundo);
   }
}
public class Tempo {

private int horas;
private int minutos;
private int segundos;

public Tempo() {
setTempo(0, 0, 0);
}
public Tempo(int hora) {
setTempo(hora, 0, 0);
}
public Tempo(int hora, int minutos) {
setTempo(hora, minutos, 0);
}
public Tempo(int hora, int minutos, int segundos) {
setTempo(hora, minutos, segundos);
}

public boolean setTempo(int h, int m, int s) {
if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60)) {
this.horas = h;
this.minutos = m;
this.segundos = s;
return true;
}else {
this.horas = 0;
this.minutos = 0;
this.segundos = 0;
return false;
}
}
}


