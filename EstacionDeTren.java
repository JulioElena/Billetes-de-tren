
/**
 * Write a description of class EstacionDeTren here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EstacionDeTren
{
private String ciudad;
private TicketMachine maquina1;
private TicketMachine maquina2;
/**
 * Constructor de la estacion de tren
 */
  public EstacionDeTren(String nombreCiudad,int precioMaquina1,int precioMaquina2)
   {
       ciudad =  nombreCiudad;
       maquina1 = new TicketMachine(precioMaquina1);
       maquina2 = new TicketMachine(precioMaquina2);
   }
   
   /**
    * Simula la ventana de un billete en la maquina 1
    */
   public void ventaBilleteMaquina1()
   {
    maquina1.insertMoney(500);
    maquina1.printTicket();
    }
   
  /** 
   * Simula la ventana de un billete en la maquina 2
    */
    public void ventaBilleteMaquina2()
   {
    maquina2.insertMoney(600);
    maquina1.printTicket();
   }
   
   /**
    * Devuelve el total de dinero recaudado por las maquinas de la estacion hasta el momento
    */
   
   public int getTotalRecaudado()
   {
   return maquina1.getTotal() + maquina2.getTotal();
   }
   
   /**
    * Devuelve el total de dinero recaudado por la maquina 1 hasta el momento
    */
   public int getDineroRecaudadoPorMaquina1()
   {
    return maquina1.getTotal();
   }
    
   /**
    * Imprime por pantalla la cantidad recaudada
    * por la maquina 1, por la 2 y el total se
    * ambas
    */
   public void prinRecaudacion()
   {
    System.out.println("La cantidad recaudada por la maquina1 es "  +  maquina1.getTotal());
    System.out.println("La cantidad recaudada por la maquina2 es "  +  maquina2.getTotal());
    System.out.println("La cantidad total es" + ( maquina1.getTotal() +  maquina2.getTotal()));
}
}
  
