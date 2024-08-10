package controller;
import javax.swing.JOptionPane;
public class ClasseMetodos {
    // Criar construtor:
    public ClasseMetodos(){
        super();
    }
    // Retorna um valor menor que 100 digitado pelo usuário para o tamanho do vetor:
    public int tamanhoVet(){
        // Definir variaveis:
        int tamanho;
        while(true){
            tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor: "));
            // validação do valor:
            if (tamanho < 101){
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Valor inválido, digite novamente."); 
            }
        }
        // Saída de dados:
        return tamanho;
    }
    // Preenche vetor:
    public int[] preencheVet(int[] vet){
        // Entrada de dados:
        for(int cto = 0 ; cto < vet.length ; cto ++){
            vet[cto] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (cto + 1) + "º valor:"));
        }
        // Saída de dados:
        return vet;
    }
    // Verifica o valor se é ímpar ou par multiplo de 10:
    public void verificaValor(int[] vet){
        for(int num : vet){
            // Processamento + saída de dados
            if (num % 2 != 0) {
                System.out.println("O número: " + num + ", é ímpar.");
            } else if (num % 2 == 0 && num % 10 == 0) {
                System.out.println("O número: " + num + ", é par e múltiplo de 10.");
            }
        }
    }
}
