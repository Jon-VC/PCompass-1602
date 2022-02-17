import java.util.Scanner;

public class Metodos {
    public void perguntaNome(){
        System.out.println("Digite seu nome: ");
        Scanner nome = new Scanner(System.in);
        Resultado.usuario = nome.findInLine(String.valueOf(System.in));
    }

    public void mostrarResultados(){
        System.out.println("Usuário: " + Resultado.usuario);
        System.out.println("Acertos: " + Resultado.acertos);
        System.out.println("Erros: " + Resultado.erros);
    }
}
