import java.util.Scanner;
public class Primos {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int j,i,a[],numDivisores=0;
		a = new int[TAM];
		//Leitura do número
		for(j=0;j<TAM;j++) {
			System.out.println("Digite um número:");
			a[j] = ler.nextInt();
		//
			for(i=2;i<=a[j]/2;i++) {
			if(a[j]%i==0) {
				numDivisores++;
			}
		}
		if(numDivisores>=1) {
			System.out.println(a[j]+" Não é primo");
		}else {
			System.out.println(a[j]+" É primo");
	}
	
		}
		
		 ler.close();
		}
	}


