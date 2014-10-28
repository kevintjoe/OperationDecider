/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p090112081;

/**
 *
 * @author i12081
 */
public class Context {
    private Strategy strat;
    public Context(Strategy strat)
    {
        this.strat=strat;
    }
    public double executeStrategy(double num1 , double num2)
    {
        return strat.doOperation(num1, num2);
    }
}
