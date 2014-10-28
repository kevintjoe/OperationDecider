/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p090112081;

/**
 *
 * @author i12081
 */
public class OpSub implements Strategy {

    @Override
    public double doOperation(double num1, double num2) {
        return num1 - num2;
    }
}
