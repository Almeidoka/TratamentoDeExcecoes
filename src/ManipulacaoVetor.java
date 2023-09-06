public class ManipulacaoVetor {
    public static void inserirValor(int vetor[], int valor, int posicaoVetor) throws Excecao{
        if(posicaoVetor>vetor.length){
            throw new Excecao(MensagemUtil.MENSAGEM_ERRO);

        }else{
            vetor[posicaoVetor]= valor;
        }
    }
    
}
