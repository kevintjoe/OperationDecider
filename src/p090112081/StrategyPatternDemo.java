/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p090112081;

import java.util.Scanner;

/**
 *
 * @author i12081
 */
public class StrategyPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Strategy strat;
        Context con;
        while (sc.hasNext()) {
            double num1 = sc.nextDouble();
            char operand = sc.next().charAt(0);
            double num2 = sc.nextDouble();

            if (operand == '+') {
                con = new Context(new OpAdd());
            } else if (operand == '-') {
                con = new Context(new OpSub());
            } else if (operand == '*') {
                con = new Context(new OpMul());
            } else {
                con = new Context(new OpDiv());
            }
            System.out.println(num1 + " " + operand + " " + num2 + " " + "=" + " " + con.executeStrategy(num1, num2));
        }
    }
}
