import javax.swing.*;

class atividadepratica
{
	public static void main (String entrada[])
	{
		//variaveis
		int n1, n2;
		double divisao, potencia;
		String msg = "";
		//entrada de dados
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero Inteiro"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
		
		//processamento
		divisao = n1 / n2;
		potencia = Math.pow(n1 , n2);
		
		
		//saida de dados
		msg = msg + "resto da divisão de "+ n1 + " por " + n2 + " = " + divisao + "\n";
		msg = msg + "a potencia de "+ n1 + " por " + n2 + " = " + potencia + "\n";
		JOptionPane.showMessageDialog(null, msg);
		
		//fim do programa
		System.exit(0);
	}
}
