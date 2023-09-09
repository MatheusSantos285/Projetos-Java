import java.util.Scanner;

public class Contador {
      public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro:");
		int parametroDois = terminal.nextInt();

        terminal.close();

        try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException parametrosInvalidos) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve der maior que o primeiro.");
        }
		
		int contagem = parametroDois - parametroUm;
		
        for(int valor = 1; valor <= contagem; valor++){
            System.out.println("Imprimindo o número " + valor);
        }
	}
}
