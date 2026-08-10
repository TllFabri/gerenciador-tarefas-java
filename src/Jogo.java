public class Jogo {
    private String nome;
    private String plataforma;
    private String dataZerado;
    private int nota;
    private String dificuldade;
    public Jogo(String nome, String plataforma, String dataZerado, int nota, String dificuldade) {
        this.nome = nome;
        this.plataforma = plataforma;
        this.dataZerado = dataZerado;
        this.nota = nota;
        this.dificuldade = dificuldade;
    }
    public String getNome() {
        return nome;
    }
    public String getPlataforma() {
        return plataforma;
    }
    public String getDataZerado () {
        return dataZerado;
    }
    public int getNota () {
        return nota;
    }
    public String getDificuldade () {
        return dificuldade;
    }

}
