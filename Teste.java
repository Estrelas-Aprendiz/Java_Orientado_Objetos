package List;

import java.util.ArrayList;
import java.util.List;

public class Teste {

    public static void main(String[] args) {

        List<Carro> carros = new ArrayList<Carro>();
        List<Carro> carrosNovos = new ArrayList<Carro>();

        Carro carro = new Carro();

        //adiciona um carro a nossa lista
        carros.add(carro);

        //adiciona um carro a uma posição exata da lista
        carros.add(10, carro);

        //adiciona uma lista a nossa lista
        carros.addAll(carrosNovos);

        //outra forma de adicionar a lista dentro da lista
        for(int i = 0 ; i < carrosNovos.size(); i++){
            carros.add(carrosNovos.get(i));
        }

        //verifica se o carro está na lista de carros. Através do método 'equals' do seu objeto carro.Sendo assim, na implementação do seu 'Carro', é muito importante que você sobreescreva o método 'equals' dizendo como as comparações devem ser realizadas.
        carros.contains(carro);

        //Remove todos os elementos da lista
        carros.clear();

    }

}

