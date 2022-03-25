public class Conta {
  private double saldo;
    int agencia;
    int numero;
    int destino;
    cliente titular;

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
    //Usar Metodos: GETTERS (Busca informação) e SETTERS (Modifica informação)
    //public double pegaSaldo(){ Para substituir o "pegaSaldo" por getSaldo em todos
    // os campos deve selecionar PegaSaldo ir em Refactor->Rename digitar O GET "getSaldo" e dar Enter.
    //public double pegaSaldo(){
    public double getSaldo(){
        return this.saldo;
    }
}
