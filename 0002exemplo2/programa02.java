class programa02
{
	public static void main (String entrada[])
	{
		//variaveis
		int n1, n2;
		int mod, div;
		double raiz, pot;
		String msg = "";
		//entrada de dados
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);
		
		//processamento
		mod = n1 % n2;
		div = (int)n1 / (int)n2;
		raiz = Math.sqrt(n1);
		pot = Math.pow(n1, n2);
		//saida de dados
		msg = "n1 = " + n1 + " n2 " + n2 + "\n";
		msg = msg + "resto da divisão de n1 por n2 = "+ mod + "\n";
		msg = msg + "Quociente da divisão de n1 por n2 = "+ div +"\n";
		msg = msg + "raiz quadrada de n1 = "+ raiz + "\n";
		msg = msg + "potencia de n1 e n2 = "+ pot + "\n";
		System.out.println(msg);
		//fim do programa
		System.exit(0);
	}
}
