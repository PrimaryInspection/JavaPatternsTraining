package patterns.compositeTest;
/**
 * Клиентский код
 * */
public class Main {
    public static void main(String[] args) {
        // Вычислим выражение 20+30-19+(42+10)+11-(6-9)
        // Приведем к следующему виду 20 - a - b
        SubExpression expr = new Expression();

        SubExpression a = new Expression(new IntegerValue(42), new IntegerValue(10));
        SubExpression b = new Expression(new IntegerValue(6), new IntegerValue(-9));

        expr.add(new IntegerValue(20));
        expr.add(new IntegerValue(30));
        expr.add(new IntegerValue(-19));
        expr.add(a);
        expr.add(new IntegerValue(11));
        expr.sub(b);


        System.out.println(expr.value());
    }
}
