
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
        TestMultiPriority1 m1=new TestMultiPriority1();   
		TestMultiPriority1 m2=new TestMultiPriority1();
	    m1.setName("Mythread-1");
	    m2.setName("Mythread-2");
         
        m1.setPriority(Thread.MIN_PRIORITY); 
         m2.setPriority(Thread.MAX_PRIORITY); 
	    m1.start();
	    m2.start();
    }
}
        // call the run() method  
         t1.start(); 
		 t2.start(); 
    }    
}  
