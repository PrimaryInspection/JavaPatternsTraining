package patterns.compositeTest;

/**
 * 15.10.2019
 *
 * Класс-компонент(лист в древовидной структуре) для значений типа Float
 * */
class FloatValue implements SubExpression {

    private Float value;

    public FloatValue(Float value) {
        this.value = value;
    }

    @Override
    public void add(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SubExpression getSubExpression(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sub(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void div(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void mult(SubExpression expr) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Number value() {
        return value;
    }
}