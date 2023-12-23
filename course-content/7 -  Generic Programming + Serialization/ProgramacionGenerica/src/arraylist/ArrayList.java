
package arraylist;


public class ArrayList {

    private Object[] datosE;
    private int i = 0;
    
    public ArrayList(int z){
        datosE = new Object[z];
    }
    
    public Object get(int i){
        return datosE[i];
    }
    
    public void add(Object o){
        datosE[i]=0;
        i++;
    }
    
}
