package Threads;

import java.io.Console;
import java.io.IOException;

public class threadgroup implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());  
	}
	public static void main(String[] args) throws IOException {  
		
		threadgroup rf = new threadgroup();
		ThreadGroup TG = new ThreadGroup("Main Thread Group");
		Thread t1 = new Thread(TG, rf, "dfs");
		Thread t2 = new Thread(TG, rf, "dsf2");
		Thread t3 = new Thread(TG, rf, "dsf3");
		t1.start();
		t2.start();
		t3.start();
		
		TG.list();
		
	}
	
	
	
	
}
