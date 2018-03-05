package C;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Modify class concurrent_assignment1.B.TPrintID so that it is created implementing Runnable 
 * (call the new class R_PrintID). 
 * And now the loop sleeps the thread a random time between 0 and 1.
 * 
 * @author yournamehere
 *
 */

public class R_PrintID  extends Thread {
long variableID;
        Random r = new Random();
/* Constructor */
    public R_PrintID() {
        this.variableID = this.getId();
    }

/* Methods */    

 
    @Override
    public void run()  {
    for (int i = 0; i < 10; i++) {

        System.out.println("ID: "+this.variableID);
       
        try {    
            Thread.sleep(r.nextInt(1000));
        } catch (InterruptedException ex) {
            Logger.getLogger(R_PrintID.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}

}
