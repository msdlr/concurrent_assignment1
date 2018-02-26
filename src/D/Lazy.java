package D;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Lazy must:
 * - Extend Thread
 * - Enter in a loop which iterates a random number of times between 2 to 8.
 * - Sleep 1 second
 * - At each iteration, it displays a random message among: “I am dressing up…”, “Just a sec, please…”, or “These clothes do not suit me…”.
 * - If Hurry interrupts Lazy before it is finished, Lazy claims: “That’s not cricket, please play the game!”.
 * - If Lazy finishes before being interrupted, it says “I am ready, the early bird catches the worm!”.
 * 
 * @author yournamehere
 *
 */

public class Lazy extends Thread{
    Random r= new Random();
    boolean isInterrupted = false;
    public Lazy() {
    }

    @Override
    public boolean isInterrupted(){
        return super.isInterrupted();
    }
    
    @Override
    public void run() {
        int iterations = r.nextInt(10);
        for (int i = 0; i < iterations-2; i++) {
            int messageNumber = r.nextInt(1);
            
            switch(messageNumber){
                case 0:
                    System.out.println("Lazy: I'm dressing up... Just a sec, please\n");
                    break;
                case 1:
                    System.out.println("Lazy: This clothes do not suite me...\n");
                    break;
                default:
                    System.out.println("[If this appears one it's an error. Otherwise it's a feature]\n");
            }
            
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Lazy.class.getName()).log(Level.SEVERE, null, ex);
                boolean isInterrupted = true;
                System.out.println("Lazy: That’s not cricket, please play the game!");
            }
            System.out.println("I  am  ready, the  early  bird  catches  the worm!");
            
        }
    }
    

}
