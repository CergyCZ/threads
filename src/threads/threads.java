package threads;

public class threads {

	public static void main(String[] args) {
		ThreadClass alfa = new ThreadClass("Alfa");
		ThreadClass beta = new ThreadClass("Beta");
		
		alfa.run();
		beta.run();

	}

}
