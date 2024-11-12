package exc3;
import java.util.Scanner;
public class repapex {
	public static void main(String[] args) {
		double n1, n2, media;
		Scanner leia = new Scanner (System.in);
		System.out.println("Informe a 1ª nota");
		n1 = leia.nextDouble();
		System.out.println("Informe a 2ª nota");
		n2 = leia.nextDouble();
		media = (n1+n2)/2;
		if (media >=7) { System.out.println("Aprovado!");
		
	}if (media <=4) {System.out.println("Reprovado!");}
	else {System.out.println("Exame");}
}
}
