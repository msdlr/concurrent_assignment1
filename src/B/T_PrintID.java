package B;

/**
 * Create class T_PrintID which extends Thread:
 *	- It must contain a variable ID whose value is first set through the class constructor.
 *	- Method run() has a loop which iterates 10 times displaying ID.
 *
 * @author yournamehere
 */

public class T_PrintID extends Thread {
    
long variableID;

/* Constructor */
    public T_PrintID() {
        this.variableID = this.getId();
    }

/* Methods */    

    @Override
    public void run(){
    for (int i = 0; i < 10; i++) {
        System.out.println("ID: "+this.variableID);
    }
}


}
