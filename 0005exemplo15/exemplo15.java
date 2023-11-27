import javax.swing.*;

class exemplo15
{
	public static void main (String entrada[])
	{
		//variaveis
		int tabuada;
		char op = 0;
		String msg = "" , msgEntr = "Digite 1 para repetição for \n Digite 2 para repetição while \n Digite 3 para repetição do while ";
		//entrada de dados
		tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero Inteiro "));
		op = (JOptionPane.showInputDialog(msgEntr)).charAt(0);
		
		//processamento
		switch(op){
			case '1':
			{
				msg = msg + "Tabuada do " + tabuada + " pelo for: \n\n";
				for(int i=1; i<=10; i=i+1)
				{
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
				}
				break;
			}
			case '2':
			{
				msg = msg + "Tabuada do " + tabuada + " pelo while: \n\n";
				int i = 1;
				while(i <= 10)
				{
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
					i=i+1;
				}
				break;
			}
			case '3':
			{
				msg = msg + "Tabuada do " + tabuada + " pelo do/while: \n\n";
				int i = 1;
				do
				{
					msg = msg + tabuada + " x " + i + " = " + tabuada*i + "\n";
					i=i+1;
				} while (i<=10);
				break;
			}
			case '4':
			{
				JOptionPane.showMessageDialog(null, "Não é possível calcular com números negativos", "Erro", JOptionPane.ERROR_MESSAGE);
				//JOptionPane.showMessageDialog(null , "Essa tela de erro é o JOptionPane");
			}
			//default: JOptionPane.showMessageDialog(null , "Essa tela de erro é o JOptionPane");
			default: JOptionPane.showMessageDialog(null , "opção invalida, calculos não realizados");
		}
		//saida de dados
		if (op >= '1' && op <= '4' )
		{
			JOptionPane.showMessageDialog(null, msg);
		}
		//fim do programa
		System.exit(0);
	}
}
