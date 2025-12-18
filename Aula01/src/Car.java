public class Car {
    String marca;
    String modelo;
    String cor;
    int portas;
    int anoFabricacao;
    double motor;
    boolean estaligado = false;

    void ligar() {
        if (estaligado == false) {
            IO.println("ligando o carro!");
            estaligado = true;
        }
        else {
            IO.println("Carro já está ligado!");
        }
    }

    void acelerar() {
        if (estaligado == true) {
            IO.println("Acelerando!");
        }
        else {
            IO.println("Não Acelerar! Carro desligado.");
        }

    }

    void brekar() {
        if (estaligado == true) {
            IO.println("Freando!");
        }
        else {
            IO.println("Carro desligado! Freio Não eficaz");
        }
    }

    void desligando () {
        if (estaligado == true) {
            IO.println("Desligando!");
            estaligado = false;
        }
        else {
            IO.println("O carro já está desligado!");
        }
    }

    void mostrar () {
        IO.println(marca+" "+modelo+" Cor:"+cor+" "+portas+" portas, Ano de Frabricação:"+anoFabricacao+" Motor:"+motor+"L");
    }

    void pintar (String novacor) {
        IO.println("Pintando!");
        cor = novacor;
        mostrar();
    }

    void buzina () {
        if (estaligado == true) {
            IO.println("Brihhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh!");
        }
        else {
            IO.println("Carro não está ligado! Logo não buzina.");
        }
    }
}