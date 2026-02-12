public class Cachorro extends Animal {
    private String porte;
    private String corDoPelo;
    private String nome;

    public Cachorro(int patas, boolean rabo, String pelagem, String sexo, String raca, boolean domestico, String porte, String corDoPelo, String nome) {
        super(patas, rabo, pelagem, sexo, raca, domestico);
        this.porte = porte;
        this.corDoPelo = corDoPelo;
        this.nome = nome;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void alimentar(){
        IO.println("korkorkork!");
    }

    @Override
    public void locomover(){
        IO.println("Cachorro: Andando!");
    }

    @Override
    public void emitirSom(){
        IO.println("AU! AU! AU!");
    }
}
