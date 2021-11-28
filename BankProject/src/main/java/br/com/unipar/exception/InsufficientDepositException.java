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
public class InsufficientDepositException extends RuntimeException{
    
    public InsufficientDepositException() {
        super ("Não é possível fazer depósito com valor menor que 0,00!");
    }
}
