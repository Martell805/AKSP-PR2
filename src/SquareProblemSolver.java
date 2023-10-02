import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Set;

public interface SquareProblemSolver extends Remote {
    Set<Double> solve(Double a, Double b, Double c) throws RemoteException;
}
