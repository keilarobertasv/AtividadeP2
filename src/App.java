import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        //Printando informações sobre o "Livro jogo"

        System.out.println("SEJA BEM-VINDO!"+"\n Não utilize acentuação"+
        " e nem pontuação para responder às opções."+
        " Dica: Tome todas as decisões com cuidado, elas determinarão como sua"+
        " história chegará ao fim."+"\n Essa história foi inspirada na Saga dos instrumentos"+
        " mortais, de Cassandra Clare \n DIVIRTA-SE!");
        System.out.println("\nClary é uma jovem artista talentosa que vive em Nova York."+
        " Um dia, enquanto visitava uma exposição de arte, Clary testemunhou uma cena"+
        " estranha: um grupo de jovens lutando contra criaturas sobrenaturais que são"+
        " invisíveis a olhos humanos, mas que ela, por algum motivo, estava vendo."+
        "\n-----------VOCÊ DECIDE------------\n O QUE CLARY DEVE FAZER?" );
        System.out.println(" a) Interferir \n b) Aguardar a luta acabar");

      

        String escolha1 = ("Interferir");
        String escolha2 =("Aguardar a luta acabar");
        String resposta = scanner.nextLine();
        if(resposta.equalsIgnoreCase(escolha1)){
        interferir(args);}
        else if(resposta.equalsIgnoreCase(escolha2)){
        NaoInterferir(args);}
        else{
            System.out.println("Desculpe, não entendi. Responda utilizando apenas"+
            " as opções disponibilizadas nas alternativas.");
        }
        

        String escolha3 = ("Acreditar");
        String escolha4 = ("Nao acreditar");
        String resposta1 = scanner.nextLine();
        if(resposta1.equalsIgnoreCase(escolha3)){
        acreditar1(args);}
        else if(resposta1.equalsIgnoreCase(escolha4)){
        NaoAcreditar(args);}
        else{
            System.out.println("Desculpe, não entendi. Responda utilizando apenas"+
            " as opções disponibilizadas nas alternativas.");
        }

       String escolha5 = ("Lutar mesmo insegura");
       String escolha6 = ("Nao lutar");
       String resposta2 = scanner.nextLine();
       if(resposta2.equalsIgnoreCase(escolha5)){
        final1(args);}
       else if(resposta2.equalsIgnoreCase(escolha6)){
        final2(args);}
       else{
        System.out.println("Desculpe, não entendi. Responda utilizando apenas"+
        " as opções disponibilizadas nas alternativas.");
       }

        String escolha7 = ("Lutar ao lado dos cacadores das sombras");
        String escolha8 = ("Deixar que eles lutem sozinhos");
        String resposta3 = scanner.nextLine();
        if(resposta3.equalsIgnoreCase(escolha7)){
        final1(args);}
        else if(resposta3.equalsIgnoreCase(escolha8)){
        final2(args);} 
        else{
        System.out.println("Desculpe, não entendi. Responda utilizando apenas"+
        " as opções disponibilizadas nas alternativas.");
       }       

       
        scanner.close();
    


 
    }
    //Criando os métodos pra usar na lógica
    public static void interferir(String[] args){
     System.out.println("Clary interferiu na briga e quase foi ferida mortalmente, mas um dos jovens"+
     " a salvou antes que isso acontecesse. Ele se chama Jace e prometeu explicar o que estava acontecendo.");
     System.out.println("Jace contou que eles eram Caçadores das Sombras, uma antiga linhagem"+
        " de guerreiros nephlim que protegiam o mundo humano dos demônios, mantendo a paz entre as"+
        " criaturas sobrenaturais.");
        System.out.println("O QUE ELA DEVE FAZER? \n a) Acreditar \n b) Não acreditar");

    }

    public static void NaoInterferir(String[] args){
      System.out.println("Clary aguardou até que a briga acabasse e depois foi ao encontro"+
      " do grupo de jovens que havia acabado de lutar. Ao exigir uma explicação"+
      " um deles, chamado Jace, resolveu falar: Jace contou que eles eram CaÇadores das Sombras,"+
      " uma antiga linhagem de guerreiros nephlim que protegiam o mundo humano dos demônios,"+
      " mantendo a paz entre as criaturas sobrenaturais");
      System.out.println("O QUE ELA DEVE FAZER? \n a) Acreditar \n b) Não acreditar");


    }
    public static void acreditar1(String[] args){
        
     System.out.println("Clary ouviu atentamente o que Jace lhe dissera, e, por algum"+
     " motivo, pareceu fazer sentido.");
     System.out.println("Depois daquele dia, Clary descobriu que também era uma caçadora"+
     " das sombras, mas que sua mãe havia escondido dela sua verdadeira identidade por anos"+
     "Agora tudo fazia sentido, inclusive o fato de ela conseguir enxergar as criaturas"+
     " sobrenaturais. Em meio a uma guerra iminente entre Caçadores de Sombras e demônios,"+
     "Clary se juntou a seus novos aliados para enfrentar os desafios que surgiram.");
     System.out.println("Clary e Jace se apaixonaram quando ele passou a treiná-la e prepará-la"
     + "para ser a Caçadora das sombras que sua mãe tentou impedir que ela fosse."
     +"Atualmente, a grande batalha está se aproximando, Clary está"+
     " indecisa e não sabe se está preparada para enfrentar uma batalha dessa magnitude"+
     " O QUE ELA DEVE FAZER? \n a) Lutar mesmo insegura \n b) Não lutar");


    }
    
    public static void NaoAcreditar(String[] args){

        System.out.println("Clary deixou que Jace se explicasse, mas não acreditou"+
        " no que o rapaz lhe dissera. Jace até insistiu, mas ela não quis conversa.");
        System.out.println("O tempo passou, e Clary acabou descobrindo que tudo era verdade e que"+
        " ela também era Caçadora das sombras. Esse era um segredo que sua mãe guardou por muito"+
        " tempo, na esperança de mantê-la afastada do submundo. Clary e Jace se apaixonaram"+
        " e começaram a namorar, mesmo com a vontade que Clary" 
        +" tinha de permanecer longe desse mundo de criaturas sobrenaturais. Agora, a grande batalha"+
        " está se aproximando: O QUE CLARY DEVE FAZER?\n a) Lutar ao lado dos Caçadores"+
        " das sombras \n b) Deixar que eles lutem sozinhos");
    }
    

    public static void final1(String[] args){
          System.out.println("No Clímax da batalha contra os demônios, Clary e Jace lutaram juntos"+
        " ao lado de outros caçadores das sombras. Com coragem e determinação, derrotaram"+
        " as forças das trevas, e os mundos natual e sobrenatural ficaram em paz e harmonia.");
        System.out.println("Com a guerra terminada, Clary e Jace finalmente puderam se entregar ao"+
     " amor que sentiam um pelo outro. Eles construíram uma vida feliz juntos, usando seus talentos"+
      " artísticos para inspirar e trazer beleza ao mundo. Clary continuou pintando, e Jace se tornou"+
      " um habilidoso escultor. Juntos, eles formaram uma dupla dinâmica, celebrando o amor,"+ 
     " a amizade e a aventura em cada momento.");


    }
    public static void final2(String[] args){
      System.out.println("No clímax da batalha contra os demônios, Clary escolheu não"+
      " lutar, apesar de amar muito Jace. O rapaz lutou sozinho ao lado de seus amigos"+
      "Caçadores das sombras e acabou não resistindo aos ferimentos de guerra. Jace"+
      " morreu golpeado em lugar de um amigo, e Clary se arrependeu amargamente de não"+
      " estar também lutando ao seu lado. Clary teve que continuar a vida sem o seu grande amor");

    }

}
