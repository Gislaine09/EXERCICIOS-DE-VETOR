package vetorInterseccao10;
import java.util.Scanner;

public class vetorIntersecao10 {
	public static void main(String [] args) {
	Scanner in = new Scanner(System.in);
	final int N =10;
	int a[], b[], c[], i, j,x,Iguais=0;
	a = new int[N];
	b = new int[N];
    
	for(i=0; i<N; i++) {
		System.out.println("Digite o "+(i+1)+" valor de A");
		a[i] = in.nextInt();
	}
	
	for(i=0; i<N; i++) {
		System.out.println("Digite o "+(i+1)+" valor de B");
		b[i] = in.nextInt();
	}
	
	for(i=0; i<N; i++) {
		for (j=0; j<N; j++) {
			if (a[i] == b[j]) {
				Iguais++;
			}
		}
	}
	
	if (Iguais == 0) {
		System.out.println("Não há valores iguais e o vetor C está vazio");
	}else {
		x=0;
		c = new int[Iguais];
		
		System.out.print("A= ");
		for (i=0; i<N; i++) {
			System.out.print(a[i]+"  ");   
		}
		
		System.out.print("\nB= ");
		for (i=0; i<N; i++) {
			System.out.print(b[i]+"  ");   
		}
		
		System.out.print("\nC= ");
		for (i = 0; i<N ; i++) {
			for (j = 0; j<N; j++) {
				if (a[i] == b[j]) {
						c[x] = a[i];
						System.out.print(c[x]+"  ");
						x++;
			    }
		    }
	    }
	}
  }
}
