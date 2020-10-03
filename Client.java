import java.rmi.*;

public class Client {
	public static void main(String a[]) throws Exception {
		AddI o1 = (AddI)Naming.lookup("ADD");
		int n = o1.add(9, 1);
		System.out.println("Rezultat je: " + n);
	}
}