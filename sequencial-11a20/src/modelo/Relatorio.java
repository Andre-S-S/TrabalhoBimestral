package modelo;
/**
 * 
 * @author Douglas Oliveira
 *
 */


//15) Crie uma classe Relatório que possui um método gerarRelatório que 
//receba um objeto imprimível e executa o método mostrarDados do objeto.
public class Relatorio {
    public void gerarRelatorio(Imprimivel imprimivel){
        imprimivel.mostrarDados();
    }
}
