import java.util.Scanner;


public class Esprimo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		boolean resultado;
		Scanner	pedir=new Scanner(System.in);
		System.out.print("Introduzca un numero positivo ::");
		numero=pedir.nextInt();
		resultado=Esprimo.esprimo(numero);
		if(resultado=true){
			System.out.print("El número introducido es PRIMO");
			
		}
	
	else{
		System.out.print("El número introducido NO es primo");
	}


	}
	public static boolean esprimo (int num){
		if(num>0){
			boolean primo=true;
			for(int i=2;i<num;i++){
				if(num%i==0){primo=false;}
				
			}
		
		return primo;
		}else{
			Esprimo.error("numero negativo");
			return false;			
		}
		
		
		
	}
	public static void error(String s){
		System.out.print(s);
	}

}
