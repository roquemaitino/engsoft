import java.util.Scanner;
public class Maior {
	public static void main (String args[]) {
		Scanner entrada = new Scanner(System.in);
	    int i, x=0, valor;
	    for (i=1;i<9;i++) {
	       System.out.printf("\nDigite o %d valor: ",i);
	       valor = entrada.nextInt();
	       if(valor > x) x = valor;
	     }
	     System.out.printf("%d\n",x);
	}
}
