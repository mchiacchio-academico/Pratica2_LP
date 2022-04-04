package Pratica2_LP;

import java.util.Scanner;

public class Questao3 {
	    public static void main(String[] args) throws Exception {

	        Scanner sc = new Scanner(System.in);

	        int vetor[]=new int[10];
	        int auxiliar=0;

	        for (int i = 0; i<=9 ; i++){
	            System.out.println("Entre com o valor da casa: "+(i+1));
	            vetor[i] = sc.nextInt();
	        }

	        for (int i=0; i<=9; i++){

	            for (int j=0; j<=9; j++){
	                
	                if (vetor[i] < vetor[j]){
	                    auxiliar = vetor [i];
	                    vetor[i] = vetor[j];
	                    vetor[j] = auxiliar;
	                }

	            }
	        }

	        System.out.println();

	        for (int i = 0; i<=9 ; i++){
	            System.out.println(vetor[i]+" ");

	        }
	    }
	}
