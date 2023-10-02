import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {

    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        Registry registry = LocateRegistry.createRegistry(2732);

        SquareProblemSolverImpl obj = new SquareProblemSolverImpl();
        SquareProblemSolver stub = (SquareProblemSolver) UnicastRemoteObject.exportObject(obj, 0);

        registry.bind("SquareProblemSolver", stub);

        System.out.println("Server ready");
    }
}
