
public class TestMultiPriority extends Thread  
{    
    public void run()  
    {    
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }    
    public static void main(String args[])  
    {    
        // creating one thread   
        TestMultiPriority1 t1=new TestMultiPriority1();   
		TestMultiPriority1 t2=new TestMultiPriority1();
        // print the maximum priority of this thread  
        t1.setPriority(Thread.MAX_PRIORITY); 
         t2.setPriority(Thread.MIN_PRIORITY); 		
        // call the run() method  
         t1.start(); 
		 t2.start(); 
    }    
}  
