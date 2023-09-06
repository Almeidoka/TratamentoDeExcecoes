import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int [] vetor;
        int tamanho, indice, valor;

        Scanner teclado = new Scanner(System.in);
        for(int i= 0; i < tamanho; i++){
            System.out.println("Insira o tamanho do vetor");
            teclado.nextInt();
            vetor = new int[tamanho];
            System.out.println("insira o valor: ");
            valor=teclado.nextInt();
            System.out.println("Insira a posicão");
            indice=teclado.nextInt();
            try{
                ManipulacaoVetor.inserirValor(vetor,indice,valor);
            }catch(Excecao e){
                
            }
        }
    }
}
