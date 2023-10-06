package primeiroprojeto;

public class primeiroexercico {

	public static void main(String[] args) {
		float values [] = {2,8,5,9,6};
		float media = 0; 
		float soma = 0;
		
		for(int i=0; i < values.length; i++) {
			soma = soma + values[i]; 
		}
		
		
		media = soma / values.length;
		
		System.out.println(media);
		
	}

}
