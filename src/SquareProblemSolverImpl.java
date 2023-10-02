import java.util.Set;

public class SquareProblemSolverImpl implements SquareProblemSolver{
    @Override
    public Set<Double> solve(Double a, Double b, Double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant < 0) {
            return Set.of();
        }

        if (discriminant == 0) {
            return Set.of(-b / (2 * a));
        }

        return Set.of(
                -b + Math.sqrt(discriminant) / (2 * a),
                -b - Math.sqrt(discriminant) / (2 * a)
        );
    }
}
