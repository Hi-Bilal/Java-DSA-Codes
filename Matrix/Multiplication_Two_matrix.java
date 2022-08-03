package Matrix;
import java.util.Scanner;
public class Multiplication_Two_matrix {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the 1st Row Size");
        int r1=scan.nextInt();
        
        System.out.println("Enter the 1st column Size");
        int c1=scan.nextInt();
        
        int a[][]=new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
             a[i][j]=scan.nextInt();   
            }
        }
        
        System.out.println("Enter the 2nd Row Size");
       int r2=scan.nextInt();
       
       System.out.println("Enter the 2nd Column Size");
        int c2=scan.nextInt();
        int b[][]=new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
             b[i][j]=scan.nextInt();   
            }
        }
        
        int count =0;
        if(r1!=c2){
           System.out.println("-1");
            return;
        }
        int c[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<r2;k++)   
            {      
            c[i][j]+=a[i][k]*b[k][j];  
            }
       }
        
        }
        System.out.println("After Multiplication :--");
            for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
        
        System.out.print(c[i][j]+" ");
            }
            System.out.println();
    }

	}

}
