/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.exception;

/**
 *
 * @author andre
 */
public class InsufficientWithdrawalException extends RuntimeException {
    
    public InsufficientWithdrawalException() {
        super ("Seu saldo não é suficiente para saque!");
    }
}
