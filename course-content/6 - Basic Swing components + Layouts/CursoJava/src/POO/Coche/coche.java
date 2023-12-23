
package POO.Coche;

public class coche {
    
    //Atributos
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plat;
    private String color;
    private int peso_tot;
    private boolean asientos, climatizador;
    
    //Constructor
    public coche(){
    ruedas = 4;
    largo = 2000;
    ancho = 350;
    motor = 1600;
    peso_plat = 450;
    }
    
    //Getters
    public String getGeneral(){
    
        return "La plataforma tiene: " + ruedas + " ruedas\n" +
                " Mide " + largo/1000 + " metros con un ancho de " + ancho + " cm\n" + 
                " y un peso de plataforma de " + peso_plat + " kg";
    }
    
    public String getColor() {
        
        return "El color del vehiculo es " + color;
    }
    
    public String getAsientos(){
        if(asientos== true){
            return "El vehiculo tiene asientos de cuero";
        } else {
        return "El vehiculo  tiene asientos de serie";
        }
    }

    public String getClimatizador(){
        
        if(climatizador == true){
            return "El vehiculo tiene climatizador";
        } else {
            return "El vehiculo lleva aire acondicionado";
        }
    }
    
    public String getPrecio(){
        int precio_final = 10000;
        
        if(asientos == true){
            precio_final+=2000;  
        }
        if(climatizador == true){
            precio_final+=1500;
        }
        
        return "El precio final del vehiculo es: " + precio_final;
    }
    
    
    
    //Setters
    
   public void setColor(String color_coche){
       color = color_coche;
   }
   
   public void setAscientos(String asientos){
       this.asientos = asientos.equalsIgnoreCase("si");
   }
   
   public void setAcondicionador(String climatizador){
       if(climatizador.equalsIgnoreCase("si")){
           this.climatizador = true;
       } else {
           this.climatizador = false;
       }
   }
   
   //Setter y Getter
   
   public String getPesoTotal(){
       int peso_carroceria = 500;
       peso_tot = peso_plat + peso_carroceria;

       if(asientos==true){
           peso_tot+=50;
       } 
       
       if(climatizador==true){
           peso_tot+=20;
       }
       
       return "El peso total del coche es " + peso_tot + " kg";
   }

}
