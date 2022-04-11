public class testaFuncionario {
    public static void main(String[] args) {
        Funcionario Alex = new Funcionario();
        Alex.setNome("Alexandre");
        Alex.setCpf("222333444-79");
        Alex.setSalario(2000.00);

        System.out.println(Alex.getNome());
        System.out.println(Alex.getCpf());
        System.out.println(Alex.getSalario() );

        //Alex.salario = 2000;

    }
}
