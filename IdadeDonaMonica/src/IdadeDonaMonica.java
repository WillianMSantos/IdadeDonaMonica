import java.util.Scanner;

public class IdadeDonaMonica {
	public static void main(String[] args){
	@SuppressWarnings("resource")
	Scanner input = new Scanner(System.in);
	
	int M = input.nextInt(); //Entrada da idade de dona Monica
	int A = input.nextInt();  //Entada da idade do filho A
	int B = input.nextInt();   //ENtrando com a idade do filho B
	
	int C = M - (A+B); //Calculando a idade do filho C, basta pegar a idade de dona Monica e subtrair
	                   //pela soma das idades dos filhos A e B.
	
	int res = Math.max(A, Math.max(B, C));
	 //Ele pega o maximo de A e compara com o maximo de B C, retornando assim o Maximo das 3 idades.
	 
	System.out.printf("%d", res); //mostrando a idade do filho mais velho.
   }
}