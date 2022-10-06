public class PartidaBrasileiro {

private String local;
private String campeonato;
private String juiz;

public PartidaBrasileiro(String local, String campeonato, String juiz) {
    this.setLocal(local);
    this.setCampeonato(campeonato);
    this.setJuiz(juiz);

}


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(String campeonato) {
        this.campeonato = campeonato;
    }

    public String getJuiz() {
        return juiz;
    }

    public void setJuiz(String juiz) {
        this.juiz = juiz;





        }

    public void exibirPartida() {
        System.out.printf("Local: %s Campeonato: %s Juiz: %s", getLocal(), getCampeonato(), getJuiz());
}
}
