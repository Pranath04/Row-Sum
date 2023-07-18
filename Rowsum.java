package rowsum;
import java.util.Scanner;

public class Rowsum{
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row size:");
		int rowsize = scanner.nextInt();
		System.out.println("Enter column size:");
		int columnsize = scanner.nextInt();
		System.out.println("Enter 2D array:");
		int arr[][] = new int[rowsize][columnsize];
		for(int i=0;i<rowsize;i++) {
			
			for(int j=0;j<columnsize;j++) {
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println();
		scanner.close();
		rowsum(arr,rowsize,columnsize);
	}
		public static void rowsum(int arr[][],int rowsize,int columnsize) {
		for(int i=0;i<rowsize;i++) {
			int sum=0;
			for(int j=0;j<columnsize;j++) {
				sum+=arr[i][j];
				//System.out.print(arr[j][i]);
			}
			System.out.print(sum+" ");
		}
		}
}