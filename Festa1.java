import java.util.Scanner;

public class Festa1 {
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in);
		int h, m, doce, salgado;
		double bebida, bolo;
		//leia(m)
		System.out.println("Digite o n�mero de mulheres:");
		m = ler.nextInt();
		//leia(h)
		System.out.println("Digite o n�mero de homens:");
		h = ler.nextInt();
		//Calcule(salgado)
		salgado = h*15 + m * 10;
		//Calcule(doce)
		doce = h*6 + m*8;
		//Calcule(bolo)
		bolo = ((h+m)*100)/1000;
		//Calcule(bebida)
		bebida = (h*600 + m*500)/1000;
		//Escreva(salgado, doce, bolo, bebida)
		System.out.println("A quantidade de salgados necess�rio:" +salgado);
		System.out.println("A quantidade de doces necess�rio:" +doce);
		System.out.println("A quantidade de bolo necess�rio:" +bolo);
		System.out.println("A quantidade de bebida necess�rio:" +bebida);
		ler.close();
	}

}
