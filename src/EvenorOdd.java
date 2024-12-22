
class Even1OrOdd1 implements Runnable{
static int count=1;
Object obj;
public Even1OrOdd1(Object obj) {
	super();
	this.obj=obj;
}
@Override
public void run(){
	
		while(count<=10) {
			if(count%2==0 && Thread.currentThread().getName().equals("even")) {
				synchronized(obj) {
					System.out.println("Thread name:"+Thread.currentThread().getName()+" Value: "+count);
					try {
					Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					try {
					obj.wait();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			if(count%2!=0 && Thread.currentThread().getName().equals("odd")) {
				synchronized(obj) {
					System.out.println("Thread name:"+Thread.currentThread().getName()+" Value: "+count);
					try {
					Thread.sleep(2000);
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
					count++;
					try {
					obj.notify();
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
			
		}
	
}
}
public class EvenorOdd {

	public static void main(String[] args) throws InterruptedException {
		Object lock=new Object();
		Even1OrOdd1 eo1=new Even1OrOdd1(lock);
		Even1OrOdd1 eo2=new Even1OrOdd1(lock);
		/*Thread t1=new Thread(eo1);
		Thread t2=new Thread(eo2);
		t1.setName("even");
		t2.setName("odd");
		t1.start();
		t2.start();*/
		new Thread(eo1,"even").start();
		new Thread(eo2,"odd").start();

	}

}
