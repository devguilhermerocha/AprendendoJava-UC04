void main() {
    IO.println("Hello World!");
    //Criando um carro!
    Car carro1 = new Car();
    carro1.marca = "Fiat";
    carro1.modelo = "Uno";
    carro1.cor = "Branco";
    carro1.anoFabricacao = 1998;
    carro1.portas = 2;
    carro1.motor = 1.6;
    carro1.mostrar();
    carro1.ligar();
    carro1.acelerar();
    carro1.brekar();
    carro1.desligando();
    IO.println();

    Car carro2 = new Car();
    carro2.marca = "Koenigsegg";
    carro2.modelo = "Gemera";
    carro2.cor = "Azul";
    carro2.anoFabricacao = 2020;
    carro2.portas = 2;
    carro2.motor = 0.0;
    carro2.mostrar();
    carro2.ligar();
    carro2.acelerar();
    carro2.brekar();
    carro2.desligando();
    IO.println();

    Car carro3 = new Car();
    carro3.marca = "Fiat";
    carro3.modelo = "Grand Siena";
    carro3.cor = "Cinza";
    carro3.anoFabricacao = 2021;
    carro3.portas = 4;
    carro3.motor = 1.8;
    carro3.mostrar();
    carro3.ligar();
    carro3.acelerar();
    carro3.brekar();
    carro3.buzina();
    carro3.desligando();
    carro3.pintar("Preto");
    IO.println();
}