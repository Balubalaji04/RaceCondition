

class Vamsi extends Thread{
public void typing() {
	try {
		for(int i=0;i<5;i++) {
			System.out.println("typing");
			Thread.sleep(1000);
		}
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}
public void spellcheck() {
	try {
	for(int i=0;i<5;i++) {
		System.out.println("spellcheck");
		Thread.sleep(1000);
	}}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
}
public void saving(){
	try {
		for(int i=0;i<5;i++) {
			System.out.println("saving");
			Thread.sleep(1000);
		}}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

public void run() {
	try {
	if(Thread.currentThread().getName().equals("typing")) {
		typing();
	}
	else if(Thread.currentThread().getName().equals("spellcheck")) {
		spellcheck();
	}
	else {
		saving();
	}
}
	catch(ArithmeticException e1) {
		e1.printStackTrace();
	}
}
}
public class MSoffice{
	public static void main(String args[]) throws InterruptedException {
		Vamsi v1=new Vamsi();
		Vamsi v2=new Vamsi();
		Vamsi v3=new Vamsi();
		v1.setName("typing");
		v2.setName("spellcheck");
		v3.setName("saving");
		v1.start();
		v1.join();
		v2.start();
		v2.join();
		v3.start();
		v3.join();
	}
}