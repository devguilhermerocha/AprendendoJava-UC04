public class ContaBancaria {
    private int NumberConta;
    private String NomeTitular;
    private int Saldo;

    protected ContaBancaria(int NumberConta, String NomeTitular) {
        this.NumberConta = NumberConta;
        this.NomeTitular = NomeTitular;
        this.Saldo = 0;
    }

    public int getNumberConta() {
        return NumberConta;
    }

    public String getNomeTitular() {
        return NomeTitular;
    }

    public void setNomeTitular(String NomeTitular) {
        this.NomeTitular = NomeTitular;
    }

    public int getSaldo() {
        return Saldo;
    }

    protected void Depositar(int Saldo) {
        if (Saldo > 0){
            this.Saldo += Saldo;
        }
        else {
            IO.println("Saldo de deposito inválida!");
            }
        }

    protected void Sacar(int Valor) {
        if (Valor > 0) {
            Saldo -= 2;
            if (Valor <= Saldo) {
                Saldo -= Valor;
            }
            else {
                IO.println("Valor de saque inválido!");
                Saldo += 2;
            }
        }

        else {
            IO.println("Valor de saque inválido!");
        }
    }
}
