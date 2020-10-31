package threadTest;

public class MainTest {

	public static void main(String[] args) {
		Thread t1 = new ThreadSimple1("thread1",100);
		Thread t2 = new ThreadSimple1("thread2",100);
	//demarrage de threads
	t1.start();
	t2.start();
	}

}
