package threadTest;

/**
 * @author jctorreszetino
 *
 */
public class ThreadSimple2 extends Thread{
	//variables
	int counter=0;
	Thread t=null;
	//Constructeurs
	public ThreadSimple2() {
		super();
	}
	public ThreadSimple2(String name,int counter) {
		super(name);
		this.counter=counter;
	}
	public ThreadSimple2(String name,int counter,Thread t) {
		super(name);
		this.counter=counter;
		this.t=t;
	}

//members
public int getCounter() {
	return this.counter ;
}

public void setCounter(int counter) {
	this.counter=counter;
}
	
public Thread getT() {
	return t;
}
public void setT(Thread t) {
	this.t = t;
}
	//method
	public void run() {
		if (t == null) {
			for (int i=0;i<this.counter;i++) {
				System.out.println("la thread actuel avec nom="+this.getName()+"et comptage="+i+"/"+this.counter+"et status="+this.getState());
			}
		}
		else if (t != null) { 
			for (int i=0;i<this.counter;i++) {
				System.out.println("la thread actuel de nom="+this.getName()+" et comptage="+i+"/"+this.counter+" et status="+this.getState()+
						"est executé pendant que le thread2 ="+t.getName()+" et counter="+((ThreadSimple2) t).getCounter()+" ThreadSimple1et status="+t.getState()
						);
			}
		}
		else {
			System.out.println("do nothing");
		}
	}
}