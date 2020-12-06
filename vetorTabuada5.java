package vetorTabuada5;
import java.util.Scanner;

public class vetorTabuada5 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		final int TAM=5;
		
		int i, r, j, a[];
		a = new int[TAM];
		
		for (i=0; i<TAM; i++) {
		   System.out.println("Entre com o "+(i+1)+" número inteiro que deseja a tabuada:");
		   a[i] = in.nextInt();	
		}
		System.out.print("a = ");
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" ");   
		}
		System.out.print("\n");
		for(j=0; j<=4; j++){
		     for(i=0;i<=10;i++) {
				r = a[j]*i;
		        System.out.println(a[j]+"x" +i+ " = " +r);
		        		
		     }
		System.out.println(" ");	
		}
	
	}
		

}

