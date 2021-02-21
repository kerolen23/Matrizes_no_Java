import java.util.Scanner;

public class DadosFuncionario {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println( "Digite os dados Nome Salário e Taxa:");
		String name = sc.nextLine();
		double GrossSaraly = sc.nextDouble();
		double tax = sc.nextDouble();
		
		double NetSalary = GrossSaraly - tax;
		
		System.out.println( "Funcionario: " + name  + "\nSalario: " +  GrossSaraly + "\ntax: " + tax );
		System.out.printf("Employee:" + name + ", $ %.2f " , NetSalary );
        System.out.println();
        System.out.println();
		System.out.println("Which  percentagem to increase salary?");
		double IncreaseSalary = sc.nextDouble();
		       IncreaseSalary = GrossSaraly -  IncreaseSalary - 390 ;
		
						
        
        System.out.printf("Updated  data: " + name + ", $ %.2f", IncreaseSalary  );
        
		sc.close();
	}

}
