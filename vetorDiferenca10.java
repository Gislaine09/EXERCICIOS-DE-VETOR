package vetorDiferenca10;
import java.util.Scanner;

public class vetorDiferenca10 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		final int n=10;
		int a[], b[], c[], i, j, x=0, diferentes=0;
		boolean igual=false;
		
		a = new int[n];
		b= new int[n];
	 	c = new int[n];

	 	//leitura de a
        for(i=0; i<n; i++) {
            System.out.println((i+1)+" elemento de A: ");
            a[i] = in.nextInt();
        }
        
        //leitura de b
        for (i=0; i<n; i++) {
            System.out.println((i+1)+" elemento de B: ");
            b[i] = in.nextInt();
        }
        
        //comparacao do vetor a
        for(i=0;i<n; i++) {
        	for(j=0; j<n; j++) {
        		if (a[i] == b[j]) {
        			igual = true;
        		}
        	}
        	if (igual == false) {
        			c[x] = a[i];
        			x++;
        			diferentes++; //qtde de elementos de c que sao diferentes, pois somente eles serão exibidos
        	}
        	igual = false;
        }
        //rotina pra exibir vetor a
        System.out.print("\nA: ");
        for (i=0; i<n; i++) {
            System.out.print(a[i]+" ");
        }
        //rotina pra exibir vetor b
        System.out.print("\nB: ");
        for (i=0; i<n; i++) {
            System.out.print(b[i]+" ");
        }
        //rotina pra mostrar vetor c
        System.out.print("\nC: ");
        for (i=0; i<diferentes; i++) {
            //usei a variavel diferentes pq C pode ter tamanho diferente de A 
            System.out.print(c[i]+" ");
        }    
}
}
