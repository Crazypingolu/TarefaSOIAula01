package controller;
public class ClasseMetodos {
    public void percorreVet(int[] vetor){
        // definir variáveis:
         double tempIni, tempFinal, tempTotal;
        // Entrada de dados:
        tempIni = System.nanoTime();
        for(int cto = 0;cto < vetor.length;cto++){
            vetor[cto] = 0;
        }
        tempFinal = System.nanoTime();
        // Processamento de dados:
        tempTotal = (tempFinal - tempIni) / (Math.pow(10, 9));
        // Saída de dados:
        System.out.println(" ");
        System.out.println(tempTotal);
    } // Fim - percorreVet 
}
