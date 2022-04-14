import javax.swing.JOptionPane;

public class binario {
    public static void main(String [] args) {
       //Variável com atribuição
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: "));
       ConverterBinario converter = new ConverterBinario();
        
       JOptionPane.showMessageDialog(null, "Binário: " + converter.binario(numero));
   }

        
    }
    

