public class Personagem{
    String nome;
    String sexo;
    int energia;
    boolean vivo;
    public Personagem(String nome, String sexo, int energia){
      this.nome = nome;
      this.sexo = sexo;
      this.energia = energia;

    }
    public int cansar(){
        energia = (this.energia - 15);
        System.out.println(this.nome + " se cansou e perdeu 15 pontos de energia");
        System.out.println("\nSua energia agora é de " + this.energia + ".\n");
        if (this.energia == 0){
            System.out.println(this.nome + " se cansou de mais e morreu");
            this.vivo = false;
        }
        else if(this.energia < 0){
            this.energia = 0;
            System.out.println("\n"+this.nome + " se cansou de mais e morreu.");
            this.vivo = false;
        }
        return energia;
    }

    public void morrer(){
        this.vivo = false;
        this.energia = 0;
        System.out.println("\n" + this.nome + " morreu. Sua energia agora é " + this.energia); 
    }
}