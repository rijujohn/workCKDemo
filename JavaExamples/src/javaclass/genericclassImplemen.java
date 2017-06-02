package javaclass;

public class genericclassImplemen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		genericclass<String> gh = new genericclass<String>();
		genericclass<Integer> ghm = new genericclass<Integer>();
		gh.add("sdf");
		ghm.add(1);
		System.out.println(gh.get());
		System.out.println(ghm.get());
	}

}
