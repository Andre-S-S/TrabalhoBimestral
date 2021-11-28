package br.com.unipar;

import br.com.unipar.entities.CalculatorScientific;

/**
 *
 * @author andre
 */
public class Main {

    public static void main(String[] args) {
        
        CalculatorScientific calculator = new CalculatorScientific();
        
        System.out.println(calculator.sum(2, 2));
        System.out.println(calculator.subtraction(4, 2));
        System.out.println(calculator.division(10, 2));
        System.out.println(calculator.multiplication(5, 2));
        System.out.println(calculator.squareRoot(9));
        System.out.println(calculator.potency(2, 3));
    }
    
}
