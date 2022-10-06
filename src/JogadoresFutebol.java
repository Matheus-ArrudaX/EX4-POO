public class JogadoresFutebol {

    private String nome;
    private int numero;
    private String time;

    public JogadoresFutebol(String nome, int numero, String time) {
        this.setNome(nome);
        this.setNumero(numero);
        this.setTime(time);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }



    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
public void exibirMensagem() {
    System.out.printf("Nome: %s Número: %d Time: %s",
            getNome(), getNumero(), getTime());
}

}
