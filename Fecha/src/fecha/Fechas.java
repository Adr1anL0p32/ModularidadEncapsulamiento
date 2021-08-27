package fecha;

public class Fechas {
  
   private int dia, mes, año;
   
   public Fechas (int dia, int mes, int año){
     this.dia = dia;
     this.mes = mes;
     this.año = año;
   }
   private void setDia(){
     if(dia > 0 && dia <= 31){
       System.out.println("Dia valido");      
     }else{
       System.out.println("Dia no valido");    
     }    
   }
   private void setMes(){
     setDia();
     if(mes > 0 && mes <= 12){
       System.out.println("Mes valido");         
     }else{
       System.out.println("Mes no valido");    
     }    
   }
   public void fechaTerminada(){
     setMes();
     System.out.println("Fechas terminadas");
   }
   
}
