import javax.swing.JOptionPane;

public class utilizador {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Escreva o seu nome:\n");
        String idadeStr = JOptionPane.showInputDialog("Escreva a sua idade:\n");
        
        int idade = Integer.parseInt(idadeStr);
        
        System.out.println("O seu nome é: " + nome);
        System.out.println("A sua idade é: " + idade);
        
        JOptionPane.showMessageDialog(null, "O seu nome é: " + nome + "\nA sua idade é: " + idade);
        
        System.exit(0);
    }
}
