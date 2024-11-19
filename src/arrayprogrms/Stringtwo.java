package arrayprogrms;

import java.util.Scanner;

public class Stringtwo {

	public static void main(String[] args) {
		String[][] ar=new String[3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				ar[i][j]=sc.next();
			}
		}
		System.out.println("entered names= ");
		for(int i=0;i<3;i++)
				{
					for(int j=0;j<2;j++)
					{
						System.out.print(ar[i][j]+ " ");
					}
					System.out.println();
				}

	}

}
