public class Cadastro {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        /*
        * Argumentos de todos os valores a serem setados,
        * Chamada da função para imprimir a mensagem.
         */

        funcionario.setNome("Pedro");
        funcionario.setCargo("Desenvolvedor Backend");
        funcionario.setSalario(4000);

        funcionario.imprimeMensagem();
    }

}
