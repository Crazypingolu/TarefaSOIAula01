package view;
import controller.ClasseMetodos;
public class ClassePrincipal {
    public static void main(String[] args) {
        // Instancia de classe:
        ClasseMetodos metodos = new ClasseMetodos();
        // Definir variáveis:
        int[] vetor = new int[metodos.tamanhoVet()];
        // Entrada de dados:
        metodos.preencheVet(vetor);
        // Processamento + saída de dados:
        metodos.verificaValor(vetor);
    }
}