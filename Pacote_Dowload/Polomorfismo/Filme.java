package Polomorfismo;

public class Filme extends Vidio{
    private String audio;
    private String legenda;

    public Filme(String nome) {
        super(nome);
        this.audio = "portugues";
        this.legenda = "nenhuma";
    }

    @Override
    public void play(){
      System.out.println("play: filme " + getNome());  
    }

    public void play(String audio){
        this.audio = audio;
        System.out.println("play: " + toString());
         
    }
    public void play(String audio, String legenda){
        this.audio = audio;
        this.legenda = legenda;
        System.out.println("play: " + toString());
    }

    public String toString(String legenda, String qualidade){
       String informação = String.format("filme: %s (audio %s, legenda %s)", getNome(), audio, legenda); 
        return informação;
    }
}