package C;

/**
 * Create class Numbers which instantiates 5 R_PrintID objects (with ID 1 to 5) and runs them.
 * 
 * 
 * @author yournamehere
 *
 */

public class Numbers {
 public Numbers() {
    
    }
   
    public void main() throws InterruptedException {
    R_PrintID idPrinter1 = new R_PrintID();    
    R_PrintID idPrinter2 = new R_PrintID();    
    R_PrintID idPrinter3 = new R_PrintID();    
    R_PrintID idPrinter4 = new R_PrintID();    
    R_PrintID idPrinter5 = new R_PrintID();
    
    idPrinter1.start();
    idPrinter2.start();
    idPrinter3.start();
    idPrinter4.start();
    idPrinter5.start();
    }
}
