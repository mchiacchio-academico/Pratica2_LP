package Pratica2_LP;

public class Questao2 {

	public static void main(String[] args) {
		
		int[][] matriz=new int[50][50];
		
		int impares=1;
		
		for(int linhas=0; linhas<50; linhas++) {
			for (int cals=0;cals<50;cals++){
				matriz[linhas][cals]=impares;
					if(linhas==cals)
					System.out.printf("%d\t", matriz[linhas][cals]);
					
					else
						System.out.printf("O\t");
				impares+=2;
			}
			System.out.printf("\n");
		}

	}

}
