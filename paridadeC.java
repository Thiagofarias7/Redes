import java.util.Scanner;

public class Calculo_Paridade {

	public static void main(String[] args) {
		int v1, v2, v3, v4, v5, v6, v7;
		Scanner ler = new Scanner(System.in);
		System.out.println("Cálculo de paridade par (1) ou ímpar(2)?");
		int opcao = ler.nextInt();
		int bitParidade = 0;
		System.out.println("Digite a sequência de bits");
		v1 = ler.nextInt();
		v2 = ler.nextInt();
		v3 = ler.nextInt();
		v4 = ler.nextInt();
		v5 = ler.nextInt();
		v6 = ler.nextInt();
		v7 = ler.nextInt();
		int sigma = v1+v2+v3+v4+v5+v6+v7;
		switch(opcao){
		case 1:
			if(sigma%2 == 0){
				System.out.println("Paridade é 0");
				bitParidade = 0;
			}else if(sigma%2 == 1) {
				bitParidade = 1;
				System.out.println("Paridade 1");
			}
			break;
		case 2:
			if(sigma%2 == 0){
				bitParidade = 1;	
			System.out.println("Paridade é 1");
		}else if(sigma%2 == 1) {
			bitParidade = 0;
			System.out.println("Paridade 0");
		}
			break;
		}
		System.out.println("Dado sendo enviado...");
		if (opcao == 1) System.out.println("O dado foi transimitido utilizando bit de paridade par.");
		else System.out.println("O dado foi transimitido utilizando bit de paridade par.");
		System.out.println("Insira o dado recebido:");
		int d1, d2, d3, d4, d5, d6, d7, d8;
		d1 = ler.nextInt();
		d2 = ler.nextInt();
		d3 = ler.nextInt();
		d4 = ler.nextInt();
		d5 = ler.nextInt();
		d6 = ler.nextInt();
		d7 = ler.nextInt();
		d8 = ler.nextInt();
		if (d8 == bitParidade) System.out.println("O dado foi enviado corretamente. (Sucesfuly transmission)");
		else System.out.println("O dado foi enviado incorretamente.");
	}

}
