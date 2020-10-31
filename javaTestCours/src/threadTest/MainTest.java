package threadTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		
		List<String> l1= new ArrayList<String>(Arrays.asList("ThreadSimple1","ThreadSimple2","ThreadSimple3"));
				
		String test=null;
		test=l1.get(2);
		System.out.println("MicroRisk enterprises... option="+test);
	
		Thread t1 = new ThreadSimple1("thread1",100);
		Thread t2 = new ThreadSimple1("thread2",100);
		
		Thread t3 = new ThreadSimple2("thread3",90);
		Thread t4 = new ThreadSimple2("thread4",100,t3);
		
		Thread t5 = new ThreadSimple3("thread5",90);
		Thread t6 = new ThreadSimple3("thread6",100,t5);
		
		if (test == "ThreadSimple1" ) {
			//demarrage de threads example1
			t1.start();
			t2.start();
		}else if ( test == "ThreadSimple2") {
		//demarrage de threads example2
			t3.start();
			t4.start();
		}else if ( test == "ThreadSimple3") {
		//demarrage de threads example2
			t5.start();
			t6.start();
		}
		else
		{}
	}
}
