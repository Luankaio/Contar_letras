import java.util.Scanner;

public class ContarLetras{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		texto = sc.nextLine();
		texto = texto.replace(" ", "");
		Teste2 t = new Teste2();
		t.selec(texto);
		sc.close();
		//fds
	}

}
