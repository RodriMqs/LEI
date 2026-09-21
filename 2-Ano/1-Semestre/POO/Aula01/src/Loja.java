import javax.swing.JOptionPane;
public class Loja {

	public static void main(String[] args) {
		String valortotalstr = JOptionPane.showInputDialog("Escreva o preço total da sua compra:");
		
		float valortotal = Float.parseFloat(valortotalstr);
		float desconto = 0.0f;
			
		if(valortotal < 10) desconto= 0.0f;
		if (valortotal >= 10 && valortotal<100) desconto = 0.05f;
		if (valortotal >=100 && valortotal < 1000) desconto = 0.10f;
		if(valortotal >= 1000 && valortotal< 10000) desconto = 0.20f;
		if(valortotal >= 10000) desconto = 0.25f;
		float precodescontado = valortotal * desconto;
		float precoapagar = valortotal  - precodescontado;
		
		JOptionPane.showMessageDialog(null, "O valor a pagar é: " + precoapagar + " euros");
		System.exit(0);
	}

}
