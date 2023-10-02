import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {
        Registry registry = LocateRegistry.getRegistry(2732);
        SquareProblemSolver stub = (SquareProblemSolver) registry.lookup("SquareProblemSolver");
        System.out.println(stub.solve(1., -3., -6.));
    }
}
