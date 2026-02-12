void main() {
    Cachorro pepeu = new Cachorro(4, true, "Pelos", "Macho", "vira lata", true,
            "médio", "branco/berge", "Pepeu");
    Tartaruga tar = new Tartaruga(4, true, "Casco", "Macho", "Terrestre", false,
            "grande", "Jagunsa", "Antiga/falecendo");
    Animal jj = new Animal(2, false, "pele", "masculino", "rachudo", false);



    pepeu.locomover();
    pepeu.alimentar();
    pepeu.emitirSom();

    jj.emitirSom();
    jj.alimentar();
    jj.locomover();

    tar.alimentar();
    tar.locomover();
    tar.emitirSom();
}
