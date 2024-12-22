class Warrior extends Thread{
	String res1="AK47";
	String res2="M416";
	String res3="AWM";
	@Override
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("Student1"))
			Student1Acq();
		else
			Student2Acq();
			
	}
	public void Student1Acq() {
		try {
			synchronized(res1) {
				System.out.println("Student1 Acquired the resource:"+res1);
				Thread.sleep(3000);
			}
			synchronized(res2) {
				System.out.println("Student1 Acquired the resource:"+res2);
				Thread.sleep(3000);
			}
			synchronized(res3) {
				System.out.println("Student1 Acquired the resource:"+res3);
				Thread.sleep(3000);
			}
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void Student2Acq() {
		try {
			synchronized(res1) {
				System.out.println("Student2 Acquired the resource:"+res1);
				Thread.sleep(3000);
			}
			synchronized(res2) {
				System.out.println("Student2 Acquired the resource:"+res2);
				Thread.sleep(3000);
			}
			synchronized(res3) {
				System.out.println("Student2 Acquired the resource:"+res3);
				Thread.sleep(3000);
			}
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
public class SynchronizedThread {

	public static void main(String[] args)throws InterruptedException {
		
		Warrior w1=new Warrior();
		Warrior w2=new Warrior();
		w1.setName("Student1");
		w2.setName("Student2");
		w1.start();
		w2.start();
	}

}
