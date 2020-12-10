package vetorPalindromo10NOVO;
import java.util.Scanner;

public class vetorPalindromo10NOVO {
		public static void main(String [] args) {
			Scanner in = new Scanner(System.in);
			final int N =10;
			int i,j=N-1, a[];
            boolean palindromo;
            a = new int[N];
           
            for(i=0; i<N; i++) {
                System.out.println("Digite o "+(i+1)+" valor de A");
                a[i] = in.nextInt();
            }
           
            System.out.print("\na = ");
            for (i=0; i<N; i++) {
                System.out.print(a[i]+"  ");  
            }
            i=0;
            palindromo=true;
           
                if(a[i]!=a[j]) {
                    palindromo=false;
                    
                 }else {
                      palindromo=true;
                   
                  }
                 if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                    
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                     
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                    
                 }else {
                     palindromo=false;
                    
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                     
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                     
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                     
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                     
                 }
                if(a[i+1] == a[j-1]){
                      palindromo=true;
                      
                 }else {
                     palindromo=false;
                     
                 }   
                if(a[i+1] == a[j-1]){
                    palindromo=true;
                      System.out.print("\n É um palindromo");
                 }else {
                     palindromo=false;
                     System.out.print("\n NÃO é um palindromo");
                 }

   }  
}




