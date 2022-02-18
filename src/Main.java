public class Main {

    public static void main(String[] args) {
        int[] v = {1, 2, 4, 3, 2, 1};

        //Metodo que cadastra o nome do usuário
        Metodos.perguntaNome();

        //Inicia varias vezes o metodo que faz a pergunta, percorrendo uma lista delas
        for (int i = 1; i < 7; i++){
            Metodos.fazPergunta(i);
        }

        //inicia o metodo que imprime o resultado na tela
        Metodos.mostrarResultados();

        //inicia o metodo que mostra as opções corretas na tela
        for (int i = 0; i < 6; i++){
            int a = i + 1;
            int b = v[i];
            Metodos.perguntasERespostas(a, b);
        }
    }
}
