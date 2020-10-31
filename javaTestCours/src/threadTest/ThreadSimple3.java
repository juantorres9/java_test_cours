package threadTest;

/**
 * @author jctorreszetino
 *
 */
public class ThreadSimple3 extends Thread{
	//variables
	int counter=0;
	Thread t=null;
	int i=0;
	//Constructeurs
	public ThreadSimple3() {
		super();
	}
	public ThreadSimple3(String name,int counter) {
		super(name);
		this.counter=counter;
	}
	public ThreadSimple3(String name,int counter,Thread t) {
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
public int getI() {
	return i;
}
public void setI(int i) {
	this.i = i;
}
public void setT(Thread t) {
	this.t = t;
}
	//method
	public void run() {
		if (t == null) {
			for (i=0;i<this.counter;i++) {
				System.out.println("la thread actuel avec nom="+this.getName()+"et comptage="+i+"/"+this.counter+"et status="+this.getState());
			}
		}
		else if (t != null) { 
			for (i=0;i<this.counter;i++) {
				System.out.println("la thread actuel de nom="+this.getName()+" et comptage="+i+"/"+this.counter+" et status="+this.getState()+
						"est executé pendant que le thread3 ="+t.getName()+"et comptage="+((ThreadSimple3)t).getI()+ "et counter="+((ThreadSimple3) t).getCounter()+" ThreadSimple1et status="+t.getState()
						);
			}
		}
		else {
			System.out.println("do nothing");
		}
	}
}