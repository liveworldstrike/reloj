
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    //parametro de hora
    private int horas;
    //parametro de minutos
    private int minutos;
    /**
     * Constructor for objects of classs ClockDisplay
     */
    public ClockDisplay()
    {
    }
    
    /**
     * fijar hora
     */
    public void setTime(int horasVisibles,int minutosVisibles)
    {
         if (horasVisibles<24 && minutosVisibles<60){
          horas = horasVisibles;
          minutos = minutosVisibles;
         }
         else{
          System.out.println(" hora no admitida");
         }
    }
    
    /**
     * sumar un minuto
     */
    public void timeTick()
    { 
      if (minutos<60){
          minutos = minutos + 1;
        }
      if(minutos==60){
          horas = horas +1;
          minutos = 0;
        }
      if (horas == 24){
              horas = 0;
            }
    } 
    
    /**
     * hora actual
     */
    public String getTime()
    {
        String horAc ="%02d:%02d";
        String resultado = String.format(horAc,horas,minutos);
        return resultado;
    }
        
}
