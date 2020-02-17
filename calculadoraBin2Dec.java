import java.util.Scanner;

public class calculadoraBin2Dec {
	public static void main(String[] args) {
		System.out.println("Digite o número binário que deseja converter:");
		
		Scanner leitor = new Scanner(System.in); {
		
		String entrada = leitor.next();
		
		int potencia = 0;
		int decimal = 0;
		
		for(int i = entrada.length() -1; i >=0; i--) {
			decimal += Math.pow(2,  potencia) *	Character.getNumericValue(entrada.charAt(i));
			potencia++;
		}
		
		System.out.println("O número convertido para base 10 é: " + decimal);
		
		}
	}

}


//User can enter up to 8 binary digits in one input field
//User must be notified if anything other than a 0 or 1 was entered
//User views the results in a single output field containing the decimal (base 10) equivalent of the binary number that was entered
