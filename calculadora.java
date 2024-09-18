
import java.util.Scanner;

import javax.swing.JOptionPane;

public class calculadora {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String altura, peso;
	double fAltura, fPeso, IMC;
	
altura = JOptionPane.showInputDialog("Digite sua altura: ");
fAltura = Double.parseDouble(altura);
peso = JOptionPane.showInputDialog("Digite seu peso: ");
fPeso = Double.parseDouble(peso);

//processamento de dados
IMC = fPeso / Math.pow(fAltura, 2);	

System.out.println(IMC);
// decisão
if(IMC<18.5) {
	JOptionPane.showMessageDialog(null, String.format("%.2f" , IMC) + " Você está muito magro(a) ");
}else if (IMC >= 18.5 && IMC < 25) {
	JOptionPane.showMessageDialog(null, String.format("%.2f" , IMC) + " Você está saudavel");
}else if (IMC > 25 && IMC < 30) {
	JOptionPane.showMessageDialog(null, String.format("%.2f" , IMC) + " Você está pré obeso(a)");
}else if (IMC > 30 && IMC < 35) {
	JOptionPane.showMessageDialog(null, String.format("%.2f" , IMC) + " Você está com obesidade grau 1 ");
}else if (IMC > 35 && IMC <40) {
	JOptionPane.showMessageDialog(null, String.format("%.2f" , IMC) + " Você está com obesidade grau 2");
}else if (IMC >= 40) {
	JOptionPane.showMessageDialog(null, String.format("%.2f" , IMC) + " Você está com obesidade grau 3");
}
	
	
}
	
	

	}
		
	
	


