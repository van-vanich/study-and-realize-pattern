import adapters.SquarePegAdapter;
import round.RoundHole;
import round.RoundPeg;
import square.SquarePeg;

public class AdapterApplication {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (hole.fits(roundPeg)) {
            System.out.println("Round peg fits round hole.");
        }

        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largePeg);

        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("smallSquare peg fits round hole.");
        }

        if (!hole.fits(largeSquarePegAdapter)) {
            System.out.println("largeSquare peg does not fit into round hole.");
        }
    }
}
