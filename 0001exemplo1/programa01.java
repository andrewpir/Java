class programa01
{
	public static void main (String entrada[])
	{
		//variaveis
		int NumInt;
		double NumReal, soma;
		char caracter;
		//entrada de dados
		NumInt = Integer.parseInt(entrada[0]);
		NumReal = Double.parseDouble(entrada[1]);
		caracter = (entrada[2]).charAt(0);
		//processamento
		soma = (double)NumInt + NumReal;
		//saida de dados
		System.out.println((double)NumInt + " + " + NumReal + " = " + soma + " sinal " + caracter);
		//fim do programa
		System.exit(0);
	}
}
