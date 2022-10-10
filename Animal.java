package LTP2;

public class Animal {
    private String nome;
    private String raca;
    private String porte;
    private String tipo;
    private double peso;
    private String nascimento;
    private char sexo;

    public void info() {
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getnome() {
        return this.nome;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }

    public String getraca() {
        return this.raca;
    }

    public void setporte(String porte) {
        this.porte = porte;
    }

    public String getporte() {
        return this.porte;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public String gettipo() {
        return this.tipo;
    }

    public void setpeso(double peso) {
        this.peso = peso;
    }

    public String getpeso() {
        return this.peso;
    }

    public void setnascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getnascimento() {
        return this.nascimento;
    }

    public void setsexo(char sexo) {
        this.sexo = sexo;
    }

    public String getsexo() {
        return this.sexo;
    }
}
