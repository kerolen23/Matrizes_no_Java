import java.util.Scanner;

public class AulaWhileExercicio {

	public static void main(String[] args) {
		
		int X = 2002;
		
	
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		
		while (Y != X) {
			System.out.println("Senha Invalida");
			 Y = sc.nextInt();
			
		}
		System.out.println("Acesso permitido");
		
		
    sc.close();
	}

	
}

