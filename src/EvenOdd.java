class OddEven extends Thread{
	public void odd()  {
		try {
		for(int i=1;i<=10;i++) {
			if(i%2!=0)
				System.out.println("Odd:"+i);
			
		}
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
	}
	public void even()  {
		try {
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				System.out.println("Even:"+i);
			
		}
		}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
	}
	public void run() {
		try {
		if(Thread.currentThread().getName().equals("odd")) 
			odd();
		else {
			even();
		}
	}
		catch(ArithmeticException e1) {
			e1.printStackTrace();
		}
	}
	
}
public class EvenOdd {

	public static void main(String[] args) throws InterruptedException {
		OddEven oe1=new OddEven();
		OddEven oe2=new OddEven();
	
		oe1.setName("odd");
		oe2.setName("even");
		oe1.start();
		oe1.join();
		oe2.start();
		oe2.join();
		
		}
	}


