public class TimeBrasileiro {

private String nome;
private String estadio;
private String craque;


    public TimeBrasileiro(String nome, String estadio, String craque) {
        this.setNome(nome);
        this.setEstadio(estadio);
        this.setCraque(craque);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getCraque() {
        return craque;
    }

    public void setCraque(String craque) {
        this.craque = craque;


        }
    public void exibirTimes() {
        System.out.printf("Nome: %s Estádio: %s Craque: %s", getNome(), getEstadio(), getCraque());
    }

}

