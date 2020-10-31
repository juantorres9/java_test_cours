package threadTest;

public class ThreadSimple1 extends Thread{
	//variables
	int counter=0;
	
	//Constructeurs
	public ThreadSimple1() {
		super();
	}
	public ThreadSimple1(String name,int counter) {
		super(name);
		this.counter=counter;
	}
//method
	public void run() {
		for (int i=0;i<this.counter;i++) {
			System.out.println("la thread actuel avec nom="+this.getName()+"et comptage="+i+"/"+this.counter+"et status="+this.getState());
		}
		
	}
}
