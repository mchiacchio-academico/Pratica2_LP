package Pratica2_LP;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {

			Scanner ler=new Scanner(System.in);
			
			double desconto, novoValor, juros, prestacao;
			short parcelas;
			
			System.out.println("Insira o total gasto pelo cliente: ");
			double totalGasto=ler.nextDouble();
			
			while(totalGasto != -1) {
			
			short formaPag=0;
			
			System.out.println("Escolha uma forma de pagamento: ");
			System.out.println("1 - À Vista c/ 10% de desconto");
			System.out.println("2- Parcelado 2x");
			System.out.println("3- Parcelado de 3x até 6x c/ juros");
			formaPag=ler.nextShort();
			
			
			switch(formaPag){
					case 1:
						desconto=totalGasto*0.1;
						novoValor=totalGasto-desconto;
						System.out.println("O valor se pago a vista fica: "+novoValor);
						break;
					case 2:
						prestacao=totalGasto/2;
						System.out.println("Cada prestação ficará: "+prestacao);
						break;
					case 3:
						if (totalGasto>=500) {
							System.out.println("Quantas parcelas serão?");
							parcelas=ler.nextShort();
							novoValor=(totalGasto/parcelas)*1.03;
							System.out.println("Cada prestação ficará: "+novoValor);
							}
						else {
					System.out.println("Valor acima de 500,00, insira outra forma de pagamento");
				}
					
			}
			System.out.println("\nInsira o total gasto pelo cliente: ");
			totalGasto=ler.nextDouble();
	}
	}
}