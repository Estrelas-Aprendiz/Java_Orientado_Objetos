package Set;

import java.util.Set;
import java.util.HashSet;

class Main {

    public static void main(String[] args) {
        //criando um conjunto usando HashSet
        Set<Integer> set1 = new HashSet<>();

        //adicionando elementos ao conjunto1
        set1.add(2);
        set1.add(3);
        System.out.println("Set1: " + set1);

        //criando outro conjunto usando a classe HashSet
        Set<Integer> set2 = new HashSet<>();

        //adicionando elementos ao conjunto2
        set2.add(1);
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        System.out.println("Set2: " + set2);

        //unindo dois conjuntos
        set2.addAll(set1);
        System.out.println("Union is: " + set2);

        System.out.println(set1);
        System.out.println(set2);
    }
}

