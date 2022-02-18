import java.util.Scanner;

public class Metodos {
    public static void perguntaNome(){
        System.out.println("Digite seu nome: ");
        Scanner nome = new Scanner(System.in);
        Resultado.usuario = nome.next();
    }

    //imprime o resultado na tela
    public static void mostrarResultados(){
        System.out.println("Usuário: " + Resultado.usuario);
        System.out.println("Acertos: " + Resultado.acertos);
        System.out.println("Erros: " + Resultado.erros);
        System.out.println("---------------------");
    }

    //Metodo responsavel por chamar os modulos das perguntas
    public static void fazPergunta(int i){
        switch(i){
            case 1:
                Perguntas.pergunta1();
                break;
            case 2:
                Perguntas.pergunta2();
                break;
            case 3:
                Perguntas.pergunta3();
                break;
            case 4:
                Perguntas.pergunta4();
                break;
            case 5:
                Perguntas.pergunta5();
                break;
            case 6:
                Perguntas.pergunta6();
                break;
        }
    }

    //mostra as opções corretas na tela
    public static void perguntasERespostas(int a, int b){
        System.out.println("Resposta da Pergunta " + a + ": Alternativa " + b);
    }
}
