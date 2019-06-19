package OBI;

import java.util.Scanner;

public class solucao {

	public static void main(String[] args) {
		
		int L;
		int C;
		Scanner c = new Scanner(System.in);
		Scanner l = new Scanner(System.in);
		
		
		L = l.nextInt();
		C = c.nextInt();

		System.out.print((1 + (L - 1) + (C - 1)) % 2);
		System.out.print("\n");
	}

}

