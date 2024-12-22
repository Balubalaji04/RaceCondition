class Queue{
	int data;
	public void put(int i) {
		data=i;
		System.out.println("Data Added...The data value is: "+i);
	}
	public void get(int i) {
		data=i;
		System.out.println("data retrived...The data value is: "+data);
	}
}
class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
		a=q;
	}
	@Override
	public void run() {
		int i=0;
		while(true) {
			a.put(i);
			i++; 
		}
	}
}
class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b=q;
	}
	@Override
	public void run() {
		int i=1;
		while(true) {
			b.get(i);
			i++;
		}
	}
}
public class ProducerConsumer {

	public static void main(String[] args) {
		Queue q=new Queue();
		(new Producer(q)).start();
		(new Consumer(q)).start();
		
		
		

	}

}
