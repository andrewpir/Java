//salvar o programa como .java
//nome classe, tudo é class
class MeuPrimeiroProgramaJava
{
	//modulo principal com a entrada pela linha de comando
	public static void main (String entrada[])
	{
		//entrada de variaveis
		int inteiro = 32;
		char caracter = 'M';
		double real = 1.80;
		String frase = "Andrew P Almeida";
		boolean VF = true;

		if (VF == true)
		{
			System.out.println("Eu sou o "+ frase + " tenho " + inteiro + " Anos e tenho " + real + " metros de altura");
		}
		System.exit(0);
	}
}