package view;
import controller.ClasseMetodos;
import javax.swing.JOptionPane;
public class ClassePrincipal {
    public static void main(String[] args) {
        // Instanciar a classe de metodos:
        ClasseMetodos metodos = new ClasseMetodos();
        // Criar variáveis:
        String texto;
        int cont;
        // Entrada de dados:
        while (true){
            // Entrada de dados:
             cont = 0; // Reset de opção de saída
             texto = JOptionPane.showInputDialog("Digite seu texto: ");
            // Processamento + saída de dados:
             JOptionPane.showMessageDialog(null, "Quantidade de partes do texto: " + metodos.countPalavras(texto));;
            // Saída do programa
            while (cont != 1 && cont != 2){ // validação de opção no loop
                // Entrada de opção de saída
                cont = Integer.parseInt(JOptionPane.showInputDialog("Continuar? \n[1] - Sim \n[2] - Não \nDigite: " ));
                // Condição para mensagem de opção inválida:
                if (cont != 1 && cont != 2){
                    JOptionPane.showMessageDialog(null, "Opção inválida, digite novamente.");
                }
            }
            // Condição de termino de programa:
            if (cont == 2){
                break;
            }
        } 
    }
}
