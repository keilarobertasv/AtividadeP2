import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private String escolha1;
    private String escolha2;
    private Personagem personagem;
    private Scanner scanner;

    public Capitulo(String nome, String texto, String escolha1, String escolha2, Personagem personagem, Scanner scanner) {
        this.nome = nome;
        this.texto = texto;
        this.escolha1 = escolha1;
        this.escolha2 = escolha2;
        this.personagem = personagem;
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println("-------------------");
        System.out.println(nome);
        System.out.println(texto);
        if (this.escolha1 != null){
         System.out.println(escolha1);
        }
        if (this.escolha2 != null){
         System.out.println(escolha2);
        }
        
        
        System.out.println("-------------------");
        
        if (this.personagem.vivo){
          personagem.cansar();
        }
        else{this.personagem.morrer();}
        

        
        
    }

    public int escolher() {
        int resposta = 0;
        boolean escolhaValida = false;

        do {
            System.out.print("Digite sua escolha: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase(escolha1)) {
                resposta = 1;
                escolhaValida = true;
            } else if (input.equalsIgnoreCase(escolha2)) {
                resposta = 2;
                escolhaValida = true;
            } else {
                System.out.println("Escolha inválida. Digite uma escolha válida.");
            }
        } while (!escolhaValida);

        return resposta;
    }

    
    
}
