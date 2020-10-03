import java.rmi.*;

public class Server {
	public static void main(String a[]) throws Exception {
		AddC o1 = new AddC();
		Naming.rebind("ADD", o1);
		System.out.println("Server je pokrenut...");
	}
}