package primeiroprojeto;

public class terceiroexercicio {

	class Main {
		  public static void main(String[] args) {

		 

				

		 

		    int number = 5;

		 

				System.out.println("The factorial of " + number + "is:");

		 

				System.out.println(factorial(number));

		 

		 

			}

		 

		  public static int factorial(int value) {

		 

				int resultado = 1;

		 

		    for(int i = 1; i <= value; i++ ){
		      resultado = resultado * i;
		    }
		    return resultado;
		    //!5 = 4 *3 *2 *1 =120

		 

			}
		}
	

}
