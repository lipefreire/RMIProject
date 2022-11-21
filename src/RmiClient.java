import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {

	public static void main(String[] args) throws Exception {
		String objNome = "rmi://localhost:1099/calc";
		ITFCalculadora calc = (ITFCalculadora) Naming.lookup(objNome);
		System.out.println("\n---------------------------------------");
		System.out.println("A soma de 2 + 2 = " + calc.adicao(2, 2));
	}

}
