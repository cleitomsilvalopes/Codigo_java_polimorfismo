package Polomorfismo;

public class Vidio {
    private String nome; 

    public void play(){
        System.out.println("Play vidio qualquer");
    }
    
    public Vidio(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
