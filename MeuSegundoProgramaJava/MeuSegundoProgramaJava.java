//salvar o programa como .java
//nome classe, tudo é class
class MeuSegundoProgramaJava
{
	//modulo principal com a entrada pela linha de comando
	public static void main (String entrada[])
	{
		//entrada de variaveis
		int n1, n2, soma;
		n1 = Integer.parseInt(entrada[0]);
		n2 = Integer.parseInt(entrada[1]);
		//processamento
		soma = n1 + n2;
		//saida de resultados
		System.out.println(n1 + " + " + n2 + " = " + soma);
		System.exit(0);
	}
}