import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
      
        Personagem Clary = new Personagem("Clary", "F", 100);
        Personagem Jace = new Personagem("Jace", "M", 100);
        
        System.out.println("SEJA BEM-VINDO!"+"\n Não utilize acentuação"+
        " e nem pontuação para responder às opções."+
        " Dica: Tome todas as decisões com cuidado, elas determinarão como sua"+
        " história chegará ao fim."+"\n Essa história foi inspirada na Saga dos instrumentos"+
        " mortais, de Cassandra Clare \n DIVIRTA-SE!");
        
        Capitulo cap1 = new Capitulo(
            "O INÍCIO", 
            "Clary é uma jovem artista talentosa que vive em Nova York." +
            " Um dia, enquanto visitava uma exposição de arte, Clary testemunhou uma cena" +
            " estranha: um grupo de jovens lutando contra criaturas sobrenaturais que são" +
            " invisíveis aos olhos humanos, mas que ela, por algum motivo, estava vendo." +
            " \n-----------VOCÊ DECIDE------------\n O QUE CLARY DEVE FAZER?", 
            new String[]{"Interferir", "Ficar quieta"},
            Clary, scanner
        );

        Capitulo cap2 = new Capitulo(
            "REVELAÇÃO", 
            "Clary interferiu na briga e quase foi ferida mortalmente, mas um dos jovens," +
            " Jace, contou que eles eram Caçadores das Sombras, uma antiga linhagem" +
            " de guerreiros nephilim que protegiam o mundo humano dos demônios, mantendo a paz entre as" +
            " criaturas sobrenaturais." +
            " \n O QUE ELA DEVE FAZER?",
            new String[]{"Acreditar", "Desacreditar"},
            Clary, scanner
        );

        Capitulo cap3 = new Capitulo(
            "REVELAÇÃO", 
            "Clary aguardou até que a briga acabasse e depois foi ao encontro" +
            " do grupo de jovens que havia acabado de lutar. Ao exigir uma explicação" +
            " um deles, chamado Jace, resolveu falar: Jace contou que eles eram Caçadores das Sombras," +
            " uma antiga linhagem de guerreiros nephilim que protegiam o mundo humano dos demônios," +
            " mantendo a paz entre as criaturas sobrenaturais. Isso exigiu um pouco de energia mental.",
            new String[]{"Acreditar", "Desacreditar"},
            Clary, scanner
        );

        Capitulo cap4 = new Capitulo(
            "DECISÃO",
            "Clary ouviu atentamente o que Jace lhe dissera, e, por algum" +
            " motivo, pareceu fazer sentido. Depois daquele dia, Clary descobriu que também era uma caçadora" +
            " das sombras, mas que sua mãe havia escondido dela sua verdadeira identidade por anos." +
            " Agora tudo fazia sentido, inclusive o fato de ela conseguir enxergar as criaturas" +
            " sobrenaturais. Em meio a uma guerra iminente entre Caçadores de Sombras e demônios," +
            " Clary se juntou a seus novos aliados para enfrentar os desafios que surgiram." +
            " Clary e Jace se apaixonaram quando ele passou a treiná-la e prepará-la" +
            " para ser a Caçadora das sombras que sua mãe tentou impedir que ela fosse." +
            " Atualmente, a grande batalha está se aproximando, Clary está" +
            " indecisa e não sabe se está preparada para enfrentar uma batalha dessa magnitude." +
            " O QUE ELA DEVE FAZER?",
            new String[]{"Evitar a batalha", "Lutar mesmo insegura"},
            Clary, scanner
        );

        Capitulo cap5 = new Capitulo(
            "A GRANDE BATALHA",
            "No clímax da batalha contra os demônios, Clary escolheu não lutar, apesar de amar" +
            " muito Jace. O rapaz lutou sem a ajuda da namorada ao lado de seus amigos Caçadores" +
            " das Sombras e acabou não resistindo aos ferimentos de batalha. Jace morreu golpeado no" +
            " peito em lugar de um amigo, e Clary se arrependeu amargamente de não ter estado com ele para" +
            " lutar ao seu lado. A mocinha teve que viver o resto de sua vida sem o seu amor e convivendo" +
            " diariamente com a culpa que sentia por não ter optado por lutar.",
            null,
            Jace, scanner
        );

        Capitulo cap6 = new Capitulo(
            "DECISÃO",
            "Clary deixou que Jace se explicasse, mas não acreditou" +
            " no que o rapaz lhe dissera. Jace até insistiu, mas ela não quis conversa." +
            " O tempo passou, e Clary acabou descobrindo que tudo era verdade e que" +
            " ela também era Caçadora das Sombras. Esse era um segredo que sua mãe guardou por muito" +
            " tempo, na esperança de mantê-la afastada do submundo. Clary e Jace se apaixonaram" +
            " e começaram a namorar, mesmo com a vontade que Clary" +
            " tinha de permanecer longe desse mundo de criaturas sobrenaturais. Agora, a grande batalha" +
            " está se aproximando:",
            new String[]{"Lutar ao lado dos cacadores das sombras", "Deixar que eles lutem sozinhos"},
            Clary, scanner
        );

        Capitulo cap7 = new Capitulo(
            "A GRANDE BATALHA",
            "No clímax da batalha contra os demônios, Clary e Jace lutaram juntos" +
            " ao lado de outros caçadores das sombras. Com coragem e determinação derrotaram"+
        " as forças das trevas, e os mundos natual e sobrenatural ficaram em paz e harmonia."+
        " Com a guerra terminada, Clary e Jace finalmente puderam se entregar ao"+
        " amor que sentiam um pelo outro. Eles construíram uma vida feliz juntos, usando seus talentos"+
        " artísticos para inspirar e trazer beleza ao mundo. Clary continuou pintando, e Jace se tornou"+
        " um habilidoso escultor. Juntos, eles formaram uma dupla dinâmica, celebrando o amor,"+ 
        " a amizade e a aventura em cada momento.",
         new String[]{null}, Clary, scanner);

         
         
        Clary.vivo = true;
        cap1.mostrar();
        int escolhacap1 = cap1.escolher();
        if (escolhacap1 ==1){
          Clary.vivo = true;
          cap2.mostrar();
          int escolhacap2 = cap2.escolher();
           if (escolhacap2 == 1){
            Clary.vivo = true;
            cap4.mostrar();
            int escolhacap4 = cap4.escolher();
            if (escolhacap4 == 1){
              Jace.vivo = false;
              cap5.mostrar();
            }
            else if(escolhacap4 == 2){
              Clary.vivo = true;
              cap7.mostrar();
            }
           }
           else if(escolhacap2 == 2){
            Clary.vivo = true;
            cap6.mostrar();
            int escolhacap6 = cap6.escolher();
            if (escolhacap6 == 1){
              Clary.vivo = true;
              cap7.mostrar();
            }
            else if (escolhacap6 == 2){
              Jace.vivo = false;
              cap5.mostrar();
              
            }
           }
        }
        else if(escolhacap1 ==2){
          Clary.vivo = true;
          cap3.mostrar();
          int escolhacap3 = cap3.escolher();
          if (escolhacap3 ==1){
            Clary.vivo = true;
            cap4.mostrar();
            int escolhacap4 = cap4.escolher();
            if (escolhacap4 == 1){
              Jace.vivo = false;
              cap5.mostrar();}
            
            else if(escolhacap4 == 2){
              Clary.vivo = true;
              cap7.mostrar();}}  
         else if (escolhacap3 == 2){
            Clary.vivo = true;
            cap6.mostrar();
            int escolhacap6 = cap6.escolher();
            if (escolhacap6 == 1){
              Clary.vivo = true;
              cap7.mostrar();
            }
            else if (escolhacap6 == 2){
              Jace.vivo = false;
              cap5.mostrar();
            }
          
          }
            

         }}   
        }
       
        
      
        
         

        

        
        

       


 

    
  

    
   
  
      