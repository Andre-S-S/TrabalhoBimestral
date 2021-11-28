package modelo;

import javax.swing.JOptionPane;

/**
 * 
 * @author Douglas Oliveira
 *
 */

// 12- Crie as classes Conta Corrente que herdam da Conta Bancaria.
//14-Faça as classes Conta Corrente implementarem a interface. 

public class ContaCorrente extends ContaBancaria implements Imprimivel{
    //Taxa fixa para realizacao de transacoes
    private  final double taxaDeOperacao=5;
    
    //A primeira possui um atributo taxaDeOperação que é descontado sempre que um saque e um depósito são feitos.
    @Override
    public void sacar(double valor){
        if( super.getSaldo() >= (valor+taxaDeOperacao) ){
            super.setSaldo(super.getSaldo()-valor-taxaDeOperacao);
            JOptionPane.showMessageDialog(null,"Levantamento efectuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"O levantamento nao pode ser efectuado");
        }
    }
    
    @Override
    public void depositar(double valor){
        if((super.getSaldo()-taxaDeOperacao+valor)>=0){
            super.setSaldo(super.getSaldo()+valor-taxaDeOperacao);  
            JOptionPane.showMessageDialog(null,"Deposito efectuado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"O deposito nao pode ser efectuado");
        }
    }
    
    @Override
    public void mostrarDados() {
        String dados="Numero da conta: "+super.getNumeroDeConta()+"\n"+
                "Saldo actual: "+super.getSaldo()+"\n"+
                "Taxa de operacao: "+ this.taxaDeOperacao+
                "\n";
        JOptionPane.showMessageDialog(null,dados);
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }
    
    
    
}
