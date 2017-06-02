package Threads;

public class ThreadEx1 extends Thread {
   static int con ;
	public void run()
	{
		for (int i=0;i<5;i++){
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		System.out.println("Hello Threre"+ i +"current thread"+ Thread.currentThread());
		
	}
	

		
	}
	
	
	public static  void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadEx1 gh = new ThreadEx1();
		ThreadEx1 gh2 = new ThreadEx1();
		ThreadEx1 gh3 = new ThreadEx1();
		//
		gh.start();
		gh.join(1000);
		gh.setName("Rijus Thread");
		gh2.start();
		gh3.start();
		gh3.sleep(1000);
		System.out.println("The state"+ gh.getState().toString() +":"+ gh.getName());
		System.out.println("The State"+ gh2.getState().toString()+":"+ gh2.getName());
		System.out.println("The State"+ gh3.getState().toString()+":"+ gh3.getName());
		Thread.sleep(200);
		System.out.println("The state"+ gh.getState().toString()+":"+ gh.getName());
		System.out.println("The State"+ gh2.getState().toString()+":"+ gh2.getName());
		System.out.println("The State"+ gh3.getState().toString()+":"+ gh3.getName());
		Thread.sleep(200);
		System.out.println("The state"+ gh.getState().toString()+":"+ gh.getName());
		System.out.println("The State"+ gh2.getState().toString()+":"+ gh2.getName());
		System.out.println("The State"+ gh3.getState().toString()+":"+ gh3.getName());
	}

}
