import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Agente agente1 = new Agente("Gabriel", "Karen", "Ativo", "Missão Alfa");
        Agente agente2 = new Agente("Laura", "Bruno", "Inativo", "Missão Beta");
        Agente agente3 = new Agente("Maria", "Ana", "Em missão", "Missão X");

        ArrayList<Agente> listaAgentes = new ArrayList<>();
        listaAgentes.add(agente1);
        listaAgentes.add(agente2);
        listaAgentes.add(agente3);
    
        exibirTodosAgente(listaAgentes);
    }

    public static void exibirTodosAgente(ArrayList<Agente> agentes) {
        for (Agente agente : agentes) {
            agente.exibirDadosAgente();
        }
    }
}
