void main() {
    Personagem Alexandre = new Personagem("Alex");
    Personagem Ygor = new Personagem("Ygor");

    Ygor.tomedano(Alexandre);
    Ygor.tomelvl(20000);
    IO.println(Ygor.getLvl());
}
