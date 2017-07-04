package PS11;

import java.util.Scanner;

public class PS63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE ARRAY SIZE");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int i,j;
		System.out.println("ENTER THE A NUMBER");
		for(i=0;i<n;i++){
			a[i]=s.nextInt();
			}
		System.out.println("ENTER THE B NUMBER");
		for(j=0;j<n;j++){
			b[j]=s.nextInt();
		}
	for(i=0;i<n;i++){
		for(j=0;j<n;j++){
			if(a[i]==b[j]){
				System.out.println(a[i]);
			}
			}
	}
	System.out.println("-1");
		for(i=0;i<n;i++){
				if(a[i]!=b[j]){
					}
				}
	
	
	}
}
