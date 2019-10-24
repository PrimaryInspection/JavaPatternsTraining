package patterns.compositeCalculator;



public abstract class UnaryExpression implements Expression {

    Expression right;

    public UnaryExpression(Expression right) {
        this.right = right;
    }
}
