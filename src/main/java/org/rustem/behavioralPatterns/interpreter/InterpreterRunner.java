package org.rustem.behavioralPatterns.interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isEngineer = getEngineer();
        Expression isEngineerMechanic = getEngineerMechanic();

        System.out.println("Does is engineer: " + isEngineer.interpret("Engineer"));
        System.out.println("Does is engineerMechanic: " + isEngineerMechanic.interpret("Engineer Engineer Mechanic"));
    }

    public static Expression getEngineer(){
        Expression engineer = new TerminalExpression("Engineer");
        Expression engineerMechanic = new TerminalExpression("Engineer Mechanic");

        return new OrExpression(engineer, engineerMechanic);
    }

    public static Expression getEngineerMechanic(){
        Expression engineer = new TerminalExpression("Engineer");
        Expression engineerMechanic = new TerminalExpression("Engineer Mechanic");

        return new AndExpression(engineer, engineerMechanic);
    }
}
