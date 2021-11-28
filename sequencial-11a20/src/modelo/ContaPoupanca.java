package modelo;

import javax.swing.JOptionPane;

/**
 * @author Douglas Oliveira
 */

//12- Crie as classes Conta Poupança que herdam da Conta Bancaria.
//14- Faça as classes Conta Poupança implementarem a interface.
public class ContaPoupanca extends ContaBancaria implements Imprimivel{
	
    //valor limite de saldo que pode ser atingido
    private final double limite = -100;
    
    //A segunda possui um atributo limite que dá crédito a mais para o correntista 
    //caso ele precise sacar mais que o saldo. Neste caso, o saldo pode ficar negativo 
    //desde que não ultrapasse o limite.
    @Override
    public void sacar(double valor){
        if( (super.getSaldo()-valor) >= limite){
            super.setSaldo(super.getSaldo()-valor);
             JOptionPane.showMessageDialog(null,"Levantamento efectuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"O levantamento nao pode ser efectuado");
        }            
    }
    
    @Override
    public void depositar(double valor){
        super.setSaldo(super.getSaldo()+valor);    
        JOptionPane.showMessageDialog(null,"Deposito efectuado com sucesso");
    }
    
    @Override
    public void mostrarDados() {
        String dados="Numero da conta: "+super.getNumeroDeConta()+"\n"+
                "Saldo actual: "+super.getSaldo()+"\n"+
                "Limite: "+ this.limite;
        JOptionPane.showMessageDialog(null,dados);
    }

    public double getLimite() {
        return limite;
    }
    
}
