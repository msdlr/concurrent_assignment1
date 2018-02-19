package B;

/**
 * Create class Numbers which instantiates 5 T_PrintID objects (with ID 1 to 5) and runs them.
 * Can you detect some problem? Can you explain the reason?
 * 
 * @author yournamehere
 *
 */

public class Numbers {

    public Numbers() {
    
    }
   
    public void main(){
    T_PrintID idPrinter1 = new T_PrintID();    
    T_PrintID idPrinter2 = new T_PrintID();    
    T_PrintID idPrinter3 = new T_PrintID();    
    T_PrintID idPrinter4 = new T_PrintID();    
    T_PrintID idPrinter5 = new T_PrintID();
    
    idPrinter1.start();
    idPrinter2.start();
    idPrinter3.start();
    idPrinter4.start();
    idPrinter5.start();
    }

}
