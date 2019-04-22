package designpatterns.behavioral.interpreter;

public class InterpreterTest {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression david = new TerminalExpression("David");
        return new OrExpression(robert, david);
    }

    //Rule: Julie is a married women
    public static Expression getFemaleExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isFemale = getFemaleExpression();

        System.out.println("Robert is male? " + isMale.interpret("Robert"));
        System.out.println("Julie is a married women? " + isFemale.interpret("Married Julie"));
    }
}
