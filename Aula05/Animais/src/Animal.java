public class Animal {
    private int patas;
    private boolean rabo;
    private String pelagem;
    private String sexo;
    private String raca;
    private boolean domestico;

    public Animal(int patas, boolean rabo, String pelagem, String sexo, String raca, boolean domestico) {
        this.patas = patas;
        this.rabo = rabo;
        this.pelagem = pelagem;
        this.sexo = sexo;
        this.raca = raca;
        this.domestico = domestico;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public boolean isRabo() {
        return rabo;
    }

    public void setRabo(boolean rabo) {
        this.rabo = rabo;
    }

    public String getPelagem() {
        return pelagem;
    }

    public void setPelagem(String pelagem) {
        this.pelagem = pelagem;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public boolean isDomestico() {
        return domestico;
    }

    public void setDomestico(boolean domestico) {
        this.domestico = domestico;
    }

    public void alimentar(){
        IO.println("kome kome!");
    }

    public void locomover(){
        IO.println("Deslocando!");
    }

    public void emitirSom(){
        IO.println("Grrrrrrrr!");
    }
}
