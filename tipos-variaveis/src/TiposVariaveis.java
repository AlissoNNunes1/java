public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        byte idade = 123;
        short ano  = 2021;
        int cep = 49100000; // se começar com zero,talvez tenha que ser outro tipo
        long cpf = 374620652L; // se começar com zero,talvez tenha que ser outro tipo
        float pi = 3.14F; // float 
        double preco = 8.9;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;


        final double VALOR_PI = 3.14;

        //VALOR_PI = 23.14; // não podemos alterar o valor de constante
        System.out.println("Idade: " + idade);
    }
}
