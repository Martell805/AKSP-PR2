import java.util.Set;

public class SquareProblemSolverImpl implements SquareProblemSolver{
    @Override
    public Set<Double> solve(Double a, Double b, Double c) {
        if (a == 0 && b == 0 && c == 0) {
            return null;
        }

        if (a == 0 && b == 0) {
           return Set.of();
        }

        if (a == 0) {
            return Set.of(c / b);
        }

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
