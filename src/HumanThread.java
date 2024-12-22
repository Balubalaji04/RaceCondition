class Humans extends Thread{
	@Override
	public void run(){
		try {
			System.out.println(Thread.currentThread().getName()+" has entered the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(3000);
			System.out.println(Thread.currentThread().getName()+" is finished using the bathroom");
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class HumanThread {

	public static void main(String[] args) throws InterruptedException {
		Humans v1=new Humans();
		Humans v2=new Humans();
		Humans v3=new Humans();
		Thread t1=new Thread(v1);
		Thread t2=new Thread(v2);
		Thread t3=new Thread(v3);
	
		t1.setName("boy");
		t2.setName("girl");
		t3.setName("others");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}

}
