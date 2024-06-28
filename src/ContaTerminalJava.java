import java.util.Scanner;

public class ContaTerminalJava {

    int numero;
    String agencia = "11000";
    String nomeCliente;
    float saldo = 5000.10F;

  public void login(){
        Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o número da conta");
		int numero = terminal.nextInt();

		System.out.println("Digite o seu nome");
		String nomeCliente = terminal.next();

        System.out.println(" Olá "+ nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " , conta " + numero + " e seu saldo é " + saldo + " já está disponivel para saque" );
        
    }


}


