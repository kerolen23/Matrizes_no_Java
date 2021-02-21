import java.util.Scanner;
public class DiadaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		String dia;
		
		switch (X){
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3: 
				dia = "Terça";
		     	break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
			case 7:
				dia = "Sabado";
				break;
				default:
				dia = "Valor invalido";
				break;
				
               	

				
}
		System.out.println("Dia da semana: " + dia);
        
        
        sc.close();
			
	}
}
