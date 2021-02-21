import java.util.Scanner;

public class Retangulo {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		System.out.println("Digite a Altura e a Largura de um Retangulo :");
		double Width = sc.nextDouble();		
		double Height = sc.nextDouble();
		
		double Area = Width * Height;
		
		double Perimeter = Width * 2 + Height * 2;  
		
		double Diagonal = (Width * Width) + (Height * Height) ; 
		System.out.println("Area: " + Area);	
		System.out.println("Perimetro: " + Perimeter);
		System.out.println("Diagonal: " + Math.sqrt(Diagonal) );
	
		
		
		
		sc.close();
	}

}
