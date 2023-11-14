public class Funcionario {
    private String nome;

    private String cargo;

    private int salario;


    //A seguir: criação de todos os sets a serem executados.
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void imprimeMensagem() {

        /**
         * Deverá pegar todos os valores setados,
         * @return tudo em apenas uma mensagem.
         */

        System.out.println("O funcionário " + this.nome +
                " recebe um salário de " + this.salario +
                " trabalhando como " + this.cargo
        );
    }
}
