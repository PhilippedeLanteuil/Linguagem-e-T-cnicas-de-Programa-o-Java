package LTP2;

public class Animal {
    private String nome;
    private String raca;
    private String porte;
    private String tipo;
    private double peso;
    private String nascimento;
    private char sexo;

    public Animal(){}

    public Animal(String nome, String raca, String porte, String tipo, double peso, String nascimento, char sexo) {
        this.nome = nome;
        this.raca = raca;
        this.porte = porte;
        this.tipo = tipo;
        this.peso = peso;
        this.nascimento = nascimento;
        this.sexo = sexo;
    }

    public void info() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

   
}

    