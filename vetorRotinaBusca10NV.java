package vetorRotinaBusca10NV;
import java.util.Scanner;

public class vetorRotinaBusca10NV {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		int i,n,a[],posicao=0;//criei uma variavel posicao pra guardar onde estava o valor encontrado
		boolean achou=false; //criei uma variavel booleana chamada achou que será mudada pra true quando encontrar o valor
		        
		a = new int[TAM];
		        
		for(i=0; i<TAM; i++) {
		    System.out.println("Digite o "+(i+1)+" elemento de A:");
		    a[i] = in.nextInt();
		}
		
		System.out.println("Digite o valor para verificar se está no vetor A:");
		n = in.nextInt();
		        
		for(i=0; i<TAM; i++) {
		    if(a[i]==n) {
		       achou = true;
		       posicao = i;     
		    }
		}
		     if (achou==true) {
		        System.out.println("\nValor "+n+" encontrado na posicao "+posicao);
		     }else {
		         System.out.println("\nValor nao encontrado");
		     }
		        
		      //exibindo o vetor completo
		        System.out.print("Vetor A completo: ");
		        for(i=0; i<TAM; i++) {
		             System.out.print(a[i]+ " ");
		        }
		        in.close();
	}
}
		
		