public class Main {

    public static void main(String[] args) {
        int[] v = {1, 2, 4, 3, 2, 1};

        Metodos.perguntaNome();

        for (int i = 1; i < 7; i++){
            Metodos.fazPergunta(i);
        }

        Metodos.mostrarResultados();

        for (int i = 0; i < 6; i++){
            int a = i + 1;
            int b = v[i];
            Metodos.perguntasERespostas(a, b);
        }
    }
}
