package Threads;

public class threadpriority extends Thread {

	public void run(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("dfs"+Thread.currentThread().getName());}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadpriority gj = new threadpriority();
		threadpriority gm = new threadpriority();
		threadpriority g1 = new threadpriority();
		threadpriority g2 = new threadpriority();
		threadpriority g3 = new threadpriority();
		threadpriority g4 = new threadpriority();
		threadpriority g5 = new threadpriority();
		threadpriority g6 = new threadpriority();
		gj.setPriority(MAX_PRIORITY);
		gj.setName("Max one");
		gm.setPriority(MIN_PRIORITY);
		gm.setName("Min one");
		
		gm.start();
		g1.start();
		g2.start();
		g3.start();
		g4.start();
		g5.start();
		g6.start();
		
		
		
	}

}
