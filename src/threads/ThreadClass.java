package threads;

public class ThreadClass implements Runnable {

	String name;
	
	public ThreadClass(String name) {
		this.name = name;
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread " + name + " is running!");
		//sleep(300);
		
	}

	
}
