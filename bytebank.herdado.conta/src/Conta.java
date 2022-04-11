public class Conta { //objeto Conta instanciado do class tipo Cliente
  private double saldo;
    private int agencia;
    private int numero;
    private int destino;
    private cliente titular;
    private static int total = 0;

    //contrutor
    public Conta(int agencia, int numero) {
        Conta.total++;
        System.out.println("O total de contas é: " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
     //   this.saldo = 100;
      //  System.out.println("Estou criando uma conta " + this.numero);
    }

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
        if (this.saca(valor)){
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
    public int getNumero(){
        return this.numero;
    }
public void setNumero (int novoNumero){
        this.numero = novoNumero;
}

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public cliente getTitular() {
        return titular;
    }

    public void setTitular(cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() { // this não é usado no metodo static
        return Conta.total;
    }
}

