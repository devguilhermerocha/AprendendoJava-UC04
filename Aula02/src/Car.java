public class Car {
    private String marca;
    private String modelo;
    private String cor;
    private int portas;
    private int anoFabricacao;
    private double motor;
    protected boolean estaligado;

    protected Car (String marca, String modelo, String cor, int portas, int anoFabricacao, double motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.portas = portas;
        this.anoFabricacao = anoFabricacao;
        this.motor = motor;
        estaligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    protected void ligar() {

        if (estaligado == false) {
            IO.println("ligando o carro!");
            estaligado = true;
        }
        else {
            IO.println("Carro já está ligado!");
        }
    }

    protected void acelerar() {
        if (estaligado == true) {
            IO.println("Acelerando!");
        }
        else {
            IO.println("Não Acelerar! Carro desligado.");
        }

    }

    protected void brekar() {
        if (estaligado == true) {
            IO.println("Freando!");
        }
        else {
            IO.println("Carro desligado! Freio Não eficaz");
        }
    }

    protected void desligando () {
        if (estaligado == true) {
            IO.println("Desligando!");
            estaligado = false;
        }
        else {
            IO.println("O carro já está desligado!");
        }
    }

    protected void mostrar () {
        IO.println(marca+" "+modelo+" Cor:"+cor+" "+portas+" portas, Ano de Fabricação:"+anoFabricacao+" Motor:"+motor+"L");
    }

    protected void pintar (String novacor) {
        IO.println("Pintando!");
        cor = novacor;
        mostrar();
    }

    protected void buzina () {
        if (estaligado == true) {
            IO.println("Brihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!");
        }
        else {
            IO.println("Carro não está ligado! Logo não buzina.");
        }
    }
}