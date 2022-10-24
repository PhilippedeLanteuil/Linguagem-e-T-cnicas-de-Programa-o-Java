package LTP2;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        
        
        
        /*eu.setCpf("17694802774");
        eu.setTelefone("(21)99776-8511");
        eu.setNome("Philippe Henry Marinho de Lagaye de Lanteuil");*/
        

        Endereço end = new Endereço("Rua Dezoito de Outubro", "Apart 604", "Tijuca", "Rio de Janeiro", "20530-050", 485);
        /*end.setBairro("Tijuca");
        end.setCep("20530-050");
        end.setCidade("Rio de Janeiro");
        end.setComplemento("Apart 604");
        end.setNumero(485);
        end.setRua( "Rua Dezoito de Outubro");
        eu.setEndereco(end); */
    



        Animal ani = new Animal("Thor", "Yorkshire","Pequeno", "Cachorro", 6.5, "21/08/2020", 'M');        
        /*ani.setNascimento("21/08/2021");
        ani.setNome ("Thor");
        ani.setPeso(6.5);
        ani.setRaca("Yorkshire");
        ani.setPorte("Pequeno");
        ani.setSexo('M');
        ani.setTipo("Cachorro");
        eu.setAnimal(ani);
        eu.info();

        eu.valida();*/

        Pessoa eu = new Pessoa("Philippe Henry Marinho de Lagaye de Lanteuil","(21)99667-8511", "176948027-74", end, ani);
        eu.info();
    }


}
