package patterns.compositeTest;


/**
 * 15.10.2019
 *
 * Единообразный интерфейс доступа к листовым и контейнерным объектам
 * */
interface SubExpression {

     Number value();

     void add(SubExpression expr);
     void sub(SubExpression expr);
     void div(SubExpression expr);
     void mult(SubExpression expr);
     SubExpression getSubExpression(int index);
}