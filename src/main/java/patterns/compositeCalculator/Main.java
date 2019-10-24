package patterns.compositeCalculator;


public class Main {
    public static void main(String[] args) {
        // ((-5)*(9/6)/(7+(2-1.5)) = -1
        Expression e =
                new Divider(new Multiplier(new Negate(new Constant(5.0)), new Divider(new Constant(9.0), new Constant(6.0))),
                        new Adder(
                                new Constant(7.0),
                                new Subtracter(new Constant(2.0), new Constant(1.5))
                        )

                );
        System.out.println(e.calculate());

    }
    }

