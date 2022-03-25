public class testaCondicional3True {

        public static void main(String[] args) {
            System.out.println("testando condicionais");
            int idade = 20;
            int quantidadePessoas = 3;
            boolean acompanhado = quantidadePessoas >= 2;
            //No Java, = atribui, enquanto == compara. Em boolean, no caso de acompanhado == true,
            // o próprio acompanhado já é um valor booleano, portanto, == true não é necessário.

            System.out.println("valor de acompanhado = " + acompanhado);

            if (idade >= 18 && acompanhado) {
                System.out.println("seja bem vindo");
            } else {
                System.out.println("infelizmente você não pode entrar");
            }
        }
    }


