package baithuchanh;
import java.util.Scanner;

public class Silde81 {

	public static void main(String[] args) {
		int i,j;
		int n,m;                

		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.print("nhap so hang: ");
			n = sc.nextInt();
			System.out.print("nhap so cot: ");
			m = sc.nextInt();
		} while (n<0&&m<0);
		
		int[][] arr =  new int[n][m];
	
		
		for(i=0;i<n;i++) 
		{
			for(j=0;j<m;j++)
			{
				System.out.printf("[%d][%d] = ",i+1 ,j+1, arr[i][j]);
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("ma tran vua nhap:  ");
		for(i=0;i<n;i++) 
		{
			for(j=0;j<m;j++)
			{
				System.out.print(arr[i][j] + "\t" );
			}
				System.out.println("\n");
		}
                
                
		int max = arr[1][1];
		for(i=0;i<n;i++) 
		{
			for(j=0;j<m;j++)
			{
				 if (arr[i][j]>max) {
                     max = arr[i][j]; 
                     break;
                 }
             }   
        }
			
        System.out.println("max = " +max);
	  
	}

}