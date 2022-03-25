public class Conta {
    double saldo;
    int agencia;
    int numero;
    int destino;
    String titular;

//deposita
    public void deposita(double valor) {
       this.saldo = this.saldo + valor;
    }

//saca
    public boolean saca(double valor){
        if (this.saldo >= valor) {
         this.saldo = this.saldo -= valor;
         return true;
    } else {
            return false;
        }

        }
  //transfere
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }else {
            return false;
        }
    }
}
