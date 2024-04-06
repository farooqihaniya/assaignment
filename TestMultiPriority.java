
public class TestMultiPriority extends Thread  
{    
    public void run()  
    {    
	    System.out.println("Thread name: "+Thread.currentThread().getName());
        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
    }
    }    
public class Main{
	
    public static void main(String args[])  
    {    
        // creating  thread   
        TestMultiPriority1 t1=new TestMultiPriority1();   
		TestMultiPriority1 t2=new TestMultiPriority1();
	    t1.setName("Mythread-1");
	    t2.setName("Mythread-2");
         
        t1.setPriority(Thread.MIN_PRIORITY); 
         t2.setPriority(Thread.MAX_PRIORITY); 
	    
            
	    



        // call the run() method  
         t1.start(); 
		 t2.start(); 
    }    
}  
