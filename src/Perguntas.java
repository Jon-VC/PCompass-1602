import java.util.Scanner;

public class Perguntas {

    int opcao = 0;
    Scanner s = new Scanner(System.in);

    public void pergunta1(){
        System.out.println("Qual o nome do grupo que luta contra o Império em Star Wars?");
        System.out.println("1 - Aliança Rebelde");
        System.out.println("2 - Time Rebelde");
        System.out.println("3 - Grupo Rebelde");
        System.out.println("4 - Tropa Rebelde");
        System.out.println("Número da resposta: ");
        opcao = s.nextInt();
        switch(opcao){
            case 1:
                Resultado.acertos++;
                break;
            case 2:
                Resultado.erros++;
                break;
            case 3:
                Resultado.erros++;
                break;
            case 4:
                Resultado.erros++;
                break;
        }
    }

    public void pergunta2(){
        System.out.println("Qual o nome do primeiro jogo da série Souls da From Software?");
        System.out.println("1 - Dark Souls");
        System.out.println("2 - Demon Souls");
        System.out.println("3 - Bloodborne");
        System.out.println("4 - Sekiro");
        System.out.println("Número da resposta: ");
        opcao = s.nextInt();
        switch(opcao){
            case 1:
                Resultado.erros++;
                break;
            case 2:
                Resultado.acertos++;
                break;
            case 3:
                Resultado.erros++;
                break;
            case 4:
                Resultado.erros++;
                break;
        }
    }

    public void pergunta3(){
        System.out.println("Qual o nome do do principal mascote da Nintendo?");
        System.out.println("1 - Pikachu");
        System.out.println("2 - Link");
        System.out.println("3 - Kirby");
        System.out.println("4 - Mario");
        System.out.println("Número da resposta: ");
        opcao = s.nextInt();
        switch(opcao){
            case 1:
                Resultado.erros++;
                break;
            case 2:
                Resultado.erros++;
                break;
            case 3:
                Resultado.erros++;
                break;
            case 4:
                Resultado.acertos++;
                break;
        }
    }

    public void pergunta4(){
        System.out.println("Qual o nome do protagonista de Legend of Zelda?");
        System.out.println("1 - Zelda");
        System.out.println("2 - Ganon");
        System.out.println("3 - Link");
        System.out.println("4 - Navy");
        System.out.println("Número da resposta: ");
        opcao = s.nextInt();
        switch(opcao){
            case 1:
                Resultado.erros++;
                break;
            case 2:
                Resultado.erros++;
                break;
            case 3:
                Resultado.acertos++;
                break;
            case 4:
                Resultado.erros++;
                break;
        }
    }

    public void pergunta5(){
        System.out.println("Qual o jogo do ano de 2018?");
        System.out.println("1 - Sekiro");
        System.out.println("2 - God of War");
        System.out.println("3 - It Takes Two");
        System.out.println("4 - Overwatch");
        System.out.println("Número da resposta: ");
        opcao = s.nextInt();
        switch(opcao){
            case 1:
                Resultado.erros++;
                break;
            case 2:
                Resultado.acertos++;
                break;
            case 3:
                Resultado.erros++;
                break;
            case 4:
                Resultado.erros++;
                break;
        }
    }

    public void pergunta6(){
        System.out.println("Qual o nome civil do Batman?");
        System.out.println("1 - Bruce Wayne");
        System.out.println("2 - Berry Allen");
        System.out.println("3 - Lex Luthor");
        System.out.println("4 - Peter Parker");
        System.out.println("Número da resposta: ");
        opcao = s.nextInt();
        switch(opcao){
            case 1:
                Resultado.acertos++;
                break;
            case 2:
                Resultado.erros++;
                break;
            case 3:
                Resultado.erros++;
                break;
            case 4:
                Resultado.erros++;
                break;
        }
    }
}
