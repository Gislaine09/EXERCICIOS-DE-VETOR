package vetorFatorialnv;
import java.util.Scanner;

public class vetorFatorialnv {
	public static void main(String [] args) {
		Scanner in= new Scanner(System.in);
		final int TAM=5;
		long fat=1;
		long b[],a[],j;
		int i;
		a= new long [TAM];
		b= new long [TAM];
		
		for(i=0; i<TAM; i++) { 
            System.out.println("Digite um  numero inteiro:");
            a[i] = in.nextInt();
     
            for (j=a[i]; j>=1; j--) { 
                  fat=fat*j; 
             }
            b[i] = fat;
            fat=1;
        }
         System.out.print("a = ");
              for (i=0; i<TAM; i++) {
                  System.out.print(a[i]+" ");   
               }
                  System.out.print("\nb = ");
             
                  
                  for (i=0; i<TAM; i++) {
                      System.out.print(b[i]+" ");   
                   }
     
    }
}