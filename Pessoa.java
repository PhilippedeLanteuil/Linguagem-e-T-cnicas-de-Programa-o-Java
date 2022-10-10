package LTP2;

public class Pessoa {
    private String nome;
    private String telefone;
    private String cpf;
    private Endereço endereco;
    Animal animal; 
    
    public void info(){
        System.out.println("Nome :  " + nome);
        System.out.println("Telefone :  " + telefone);
        System.out.println("CPF :  " + cpf);
        System.out.println("Endereço: " + endereco.rua);
        System.out.println("Número :  " + endereco.numero);
        System.out.println("Complemento :  " + endereco.complemento);
        System.out.println("Bairro :  " + endereco.bairro);
        System.out.println("Cidade :  " + endereco.cidade);
        System.out.println("CEP :  " + endereco.cep);
        System.out.println("Nome do Animal :" + animal.nome); 
        System.out.println("Nascimento do Animal :" + animal.nascimento);
        System.out.println("Peso do Animal :" + animal.peso);
        System.out.println("Porte do Animal :" + animal.porte);
        System.out.println("Raça do Animal :" + animal.raca);
        System.out.println("Sexo do Animal :" + animal.sexo);
        System.out.println("Tipo de Animal :" + animal.tipo);     
    }

    private boolean validarCPF(String cpf){
        char verifica[] = this.cpf.toCharArray();
        int resultado = (10*Character.getNumericValue(verifica[0]))+
            (9*Character.getNumericValue(verifica[1]))+
            (8*Character.getNumericValue(verifica[2]))+
            (7*Character.getNumericValue(verifica[3]))+
            (6*Character.getNumericValue(verifica[4]))+
            (5*Character.getNumericValue(verifica[5]))+
            (4*Character.getNumericValue(verifica[6]))+
            (3*Character.getNumericValue(verifica[7]))+
            (2*Character.getNumericValue(verifica[8]));
        int verificador1 = 11 - (resultado % 11);
        resultado = (11*Character.getNumericValue(verifica[0]))+
            (10*Character.getNumericValue(verifica[1]))+
            (9*Character.getNumericValue(verifica[2]))+
            (8*Character.getNumericValue(verifica[3]))+
            (7*Character.getNumericValue(verifica[4]))+
            (6*Character.getNumericValue(verifica[5]))+
            (5*Character.getNumericValue(verifica[6]))+
            (4*Character.getNumericValue(verifica[7]))+
            (3*Character.getNumericValue(verifica[8]))+
            (2*Character.getNumericValue(verifica[9]));
        int verificador2 = 11 - (resultado % 11);
        if(verificador1>=10){verificador1 = 0;}
        if(verificador2>=10){verificador2 = 0;}
        if(verificador1==Character.getNumericValue(verifica[9])&&verificador2==Character.getNumericValue(verifica[10])){
            return true;
        }else{
            return false;
        }
    }

    public void valida(){
        if(this.validarCPF(cpf)){
            System.out.println("CPF válido.");
        }else{
            System.out.println("CPF inválido.");
        }
    }
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereço getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereço endereco) {
        this.endereco = endereco;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    
}



