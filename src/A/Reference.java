package A;

/**
 * Get the reference of the main thread */

public class Reference {

   public void main() throws InterruptedException{
       Thread main = Thread.currentThread();
     
       
       System.out.println(main.getName());
       
      for (int i = 0; i <=100; i++) {
                if(i%2==1){
               System.out.println(i);
            main.setName(String.valueOf(i));
            Thread.sleep(2*1000);
           
                }
       }
       
   } 
  
    
        
   
    

    
        
   
}
