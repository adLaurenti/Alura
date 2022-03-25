public class testaFor {
    public static void main(String[] args) {
        for (int contador = 0; contador <= 10; contador++)//explicando: for(contador; condição boleana; o que deve ser executado no final de cada operação ){}
        {
            System.out.println(contador);
        }
//System.out.println(contador); "tente tirar o comentário para ver o erro."

// Diferentemente do while, apesar de int contador = 0 valer no escopo do for inteiro
// em todas as iterações, ele não é zerado, sendo executado apenas uma vez, e por isto sua sintaxe não é
// muito intuitiva. Se quisermos imprimir o último valor que o contador estava lendo, não conseguiremos,
// por conta do escopo.
// O for oferece a possibilidade de haver uma variável que participa de todas as iterações,
// que é o que precisamos, mas depois do for, ela deixa de valer.
    }
}
