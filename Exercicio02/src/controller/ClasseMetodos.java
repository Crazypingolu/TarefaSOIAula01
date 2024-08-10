package controller;

public class ClasseMetodos {
    public ClasseMetodos(){
        super();
    }
    // Método countPalavras:
    public int countPalavras(String lista){
        // definir variáveis:
         int partes = 0;
         String[] listaSeparada;
        // Entrada de dados:
         listaSeparada = lista.split(";");
        for (String palavras : listaSeparada) { // for each
            System.out.println(palavras); // mostrar a palavra no console (verifica se tudo está saíndo)
            partes ++;            
        }
        // Saída de dados
         return partes;
    }
}
