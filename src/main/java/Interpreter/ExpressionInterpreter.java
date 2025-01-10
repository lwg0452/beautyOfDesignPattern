package Interpreter;

import java.util.Deque;
import java.util.LinkedList;

public class ExpressionInterpreter {

    private Deque<Expression> numbers = new LinkedList<>();

    public long interpret(String expression) {
        String[] elements = expression.trim().split(" ");
        int len = elements.length;
        for (int i = 0; i < len / 2 + 1; i++) {
            numbers.offerLast(new NumberExpression(elements[i]));
        }

        for (int i = len / 2 + 1; i < len; i++) {
            String operator = elements[i];
            if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
                throw new RuntimeException("Expression is invalid: " + expression);
            }
            Expression exp1 = numbers.pollFirst();
            Expression exp2 = numbers.pollFirst();
            Expression combinedExp = null;
            if (operator.equals("+")) {
                combinedExp = new AddExpression(exp1, exp2);
            } else if (operator.equals("-")) {
                combinedExp = new SubstractionExpression(exp1, exp2);
            } else if (operator.equals("*")) {
                combinedExp = new MultiplicationExpression(exp1, exp2);
            } else if (operator.equals("/")) {
                combinedExp = new DivisionExpression(exp1, exp2);
            }
            long result = combinedExp.interpret();
            numbers.offerFirst(new NumberExpression(result));
        }

        if (numbers.size() != 1) {
            throw  new RuntimeException("Expression is invalid: " + expression);
        }

        return numbers.poll().interpret();
    }

    public static void main(String[] args) {
        ExpressionInterpreter interpreter = new ExpressionInterpreter();
        long result = interpreter.interpret("1 2 3 2 4 1 3 + - + * + /");
        System.out.println(result);
    }
}
