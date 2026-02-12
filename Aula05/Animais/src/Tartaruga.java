public class Tartaruga extends Animal {
    private String tamanho;
    private String nome;
    private String idade;

    public Tartaruga(int patas, boolean rabo, String pelagem, String sexo, String raca, boolean domestico, String tamanho, String nome, String idade) {
        super(patas, rabo, pelagem, sexo, raca, domestico);
        this.tamanho = tamanho;
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public void emitirSom() {
        IO.println("IAhhhh!");
    }

    @Override
    public void locomover() {
        IO.println("Andando!");
    }

    @Override
    public void alimentar() {
        IO.println("Ihnak Ihnak!");
    }
}
