import java.util.Scanner;

public class Capitulo {
    private String nome;
    private String texto;
    private String [] escolhas;
    private Personagem personagem;
    private Scanner scanner;

    public Capitulo(String nome, String texto, String[] escolhas, Personagem personagem, Scanner scanner) {
        this.nome = nome;
        this.texto = texto;
        this.escolhas = escolhas;
        this.personagem = personagem;
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println("-------------------");
        System.out.println(nome);
        System.out.println(texto);
        if (escolhas[0] != null){
            System.out.println(escolhas[0]);
        }
        if (escolhas[1] != null){
            System.out.println(escolhas[1]);
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

            if (input.equalsIgnoreCase(escolhas[0])) {
                resposta = 1;
                escolhaValida = true;
            } else if (input.equalsIgnoreCase(escolhas[1])) {
                resposta = 2;
                escolhaValida = true;
            } else {
                System.out.println("Escolha inválida. Digite uma escolha válida.");
            }
        } while (!escolhaValida);

        return resposta;
    }

    
    
}
