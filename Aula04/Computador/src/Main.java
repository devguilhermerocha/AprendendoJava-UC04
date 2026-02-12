//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Computador computador1 = new Computador("Aorus Elite AM4", "Ryzen 5 5500", "ARC B70", 16, 1024, 550, "Windows");
    computador1.setUser("admin", "adm1234");
    computador1.power();
    IO.println(computador1.login("admin", "adm1234"));
}
