void main(){
    ContaBancaria jose = new ContaBancaria(1000001, "José nascimento");
    jose.Depositar(1000);
    IO.println(jose.getSaldo());
    jose.Sacar(998);
    IO.println(jose.getSaldo());
    IO.println();
}