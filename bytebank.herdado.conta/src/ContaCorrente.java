//new ContaCorrente()
public class ContaCorrente extends Conta{
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override // significa anotação na configuração do código java.
    public boolean saca(double valor) {
        double valorASaca = valor + 0.2;
        return super.saca(valorASaca);
    }
}
