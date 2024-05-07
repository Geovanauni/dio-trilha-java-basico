import java.util.Scanner;

public class contador {
    public static void main(String[] args) throws Exception {
       Scanner scan = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro ");
		int parametroUm = scan.nextInt();
		System.out.println("Digite o segundo parâmetro ");
		int parametroDois = scan.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			
		}
        scan.close();
	}
    public static class ParametrosInvalidosException extends Exception {
    }  
	
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
		int contagem = parametroDois - parametroUm;
		
        for (int i = 0; i < contagem; i++) {
            System.out.printf("Imprimindo o número: %d%n", i + 1);
	
    }
}
}