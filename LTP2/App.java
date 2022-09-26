package LTP2;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        Pessoa eu = new Pessoa();
        
        eu.cpf = "176948027-74";
        eu.telefone = "(21)99776-8511";
        eu.nome = "Philippe Henry Marinho de Lagaye de Lanteuil";
       
        Endereço end = new Endereço();
        end.bairro = "Tijuca";
        end.cep = "20530-050";
        end.cidade = "Rio de Janeiro";
        end.complemento = "Apart 604";
        end.numero = 485;
        end.rua = "Rua Dezoito de Outubro";
        eu.endereco = end;

        Animal ani = new Animal();        
        ani.nascimento = "21/08/2021";
        ani.nome = "Thor";
        ani.peso = 6.5;
        ani.raca = "Yorkshire";
        ani.porte = "Pequeno";
        ani.sexo = 'M';
        ani.tipo = "Cachorro";


    }
}
