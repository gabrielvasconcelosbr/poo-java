public class Agente {
    String nome;
    String parceiro;
    String status;
    String missao;

    public Agente (String nome, String parceiro, String status, String missao) {
        this.nome = nome;
        this.parceiro = parceiro;
        this.status = status;
        this.missao = missao;
    }

    public void exibirDadosAgente() {
        System.out.println("Nome: " + nome);
        System.out.println("Parceiro: " + parceiro);
        System.out.println("Status: " + status);
        System.out.println("Missão: " + missao);
        System.out.println("-----------------------");
    }
}