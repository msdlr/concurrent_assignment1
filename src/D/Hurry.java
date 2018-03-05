package D;



/**
 * Hurry must:
 * - Be the main thread
 * - Create the Lazy thread.
 * - Wait for Lazy to finish. Each second it must print the message: “Aren’t you ready yet?” and checks if Lazy is finished.
 * - If Lazy isn’t finished after 5 seconds, Hurry will claim “You are resting in your laurels… and I am leaving!” and interrupts Lazy. Then it waits for Lazy to finish.
 * - However, if Lazy finishes before the 5 seconds deadline, Hurry says “At last, a turtle runs rings round you!”.
 * 
 * @author yournamehere
 *
 */


public class Hurry  {
     
     Lazy a = new Lazy();
     

   
    public void main() throws InterruptedException {
        a.start();
        int i;
        for ( i = 0; i < 5 && a.isAlive(); i++) {
            Thread.sleep(1000);
            if(i==0){
             // a.interrupt();
                System.out.println("Hurry: Aren´t you ready yet?");
            }
            
            if(i==4){
                System.out.println("Hurry: At last, a turtle runs rings round you!");
               
            }
     
            
        }
            if (i==5){
                a.interrupt();
                System.out.println("Hurry: you´re resting in your laurels… and I am leaving!");
                
                
        
            }
    }

    
     
     
         
         
     
    
    
}
