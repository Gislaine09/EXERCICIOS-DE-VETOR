package vetorPrimo10;
import java.util.Scanner;
public class vetorPrimo10 {
		public static void main(String [] args) {
			Scanner in = new Scanner(System.in);
			final int TAM=10;
			
			int i, resto0=0, a[], j=0;
			a= new int[TAM];
			
		  for(j=0; j<TAM; j++){
				System.out.println("Entre com o  número inteiro:");
				   a[j] = in.nextInt();	
				
			    for (i=1; i<=a[j]; i++) {
				   if (a[j] % i ==0) {
					   resto0++;	
			       }
			    }
			    
			   if( a[j] ==1) {
				  System.out.print(""+a[j]+" NÃO é primo "); 
				  System.out.print("\n");
			   }else if (resto0<=2) {
				  System.out.print(""+a[j]+" é primo ");
				  System.out.print("\n");
			   }else {
				  System.out.print(""+a[j]+" NÃO é primo "); 
				  System.out.print("\n");
			   }
			  resto0=0;
		  }
		
	}
}



