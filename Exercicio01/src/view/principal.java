package view;
import controller.ClasseMetodos;
public class principal {
    public static void main(String[] args) {
        // intância de classe:
         ClasseMetodos met = new ClasseMetodos();
        // Criar vetores:
         int[] vetorMil = new int[1000];
         int[] vetorDezMil = new int[10000];
         int[] vetorCemMil = new int[100000];
        // Chamada de operação com retorno de tempo:
         met.percorreVet(vetorMil);
         met.percorreVet(vetorDezMil);
         met.percorreVet(vetorCemMil);
    }// Fim
}
