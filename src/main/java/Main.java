

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int i = Integer.parseInt(JOptionPane.showInputDialog("Digite o número inicial: "));
        int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o número final: "));
        int soma = 0;
        int qtde = 0;
        while (i <= fim) {
            soma += i;
            qtde++;
            i++;
        }
        double media = (double) soma / qtde;
        JOptionPane.showMessageDialog(null, "A média é: " + media);
    }
}
