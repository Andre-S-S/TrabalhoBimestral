package runner;

import modelo.ContaCorrente;
import modelo.ContaPoupanca;
import modelo.Relatorio;

/**
 * 
 * @author Douglas Oliveira
 *
 */

//16- Crie uma classe executável na qual você instância duas contas (uma de cada tipo)
//credita algum valor para elas e efetua um saque (obs: no objeto conta poupança 
//faça um saque maior que o saldo atual). Crie um objeto relatório  
//execute o método gerar relatório para cada conta criada. 

public class Executavel {
   
    
    public static void main(String[] args) {
        operacoes();
    }
    public static void operacoes(){
        ContaCorrente  c= new ContaCorrente();
        ContaPoupanca  p= new ContaPoupanca();
        
        c.setNumeroDeConta(1234);
        c.depositar(1200);
        
        p.setNumeroDeConta(5678);
        p.depositar(1200);
        
        // c.sacar(200);
        p.sacar(1250);
        
        //Crie um objeto relatório, execute o método gerar relatório para cada conta criada.
        Relatorio relatorio = new Relatorio();
        
        //relatorio.gerarRelatorio(c);
        relatorio.gerarRelatorio(p);
    }
    
    
}
