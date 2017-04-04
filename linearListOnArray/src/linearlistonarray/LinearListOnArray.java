package linearlistonarray;

import java.util.Scanner;

/**
 * @author Leu <@leunardosevla at twitter.com>
 *
 * Instituto Federal Campus Sapucaia do Sul 
 * Técnico Em Informática 
 * Aluno: Leonardo Alves 
 * Turma: 3I 
 * 
 * valores considerados: 
 * A LA tem o tamanho de 50; 
 * A LA é inicializada com 0 para representar a inexistência de LL; 
 * Todos os valores de uma LL são definidos como NULL; 
 */
public class LinearListOnArray {

    static Scanner input = new Scanner(System.in);
    static int nodes;
    static Integer array[]
        = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
            0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                0, 0, 0, 0, 0, 0, 0};

    public static void main(String[] args) {
        LinearList ll = new LinearList();
        Descriptor descriptor = null;
        boolean backmenu = false;
        do {
            switch (menu()) {
                case 1:
                    do {
                        System.out.println("Informe a quantidade de nodos: (min 1, max 25)");
                        nodes = input.nextInt();
                    } while (nodes > 25 || nodes < 1);
                    ll = new LinearList(array, nodes);
                    ll.createLinearList(array);
                    descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;
                case 2:
                    ll.addFirstNode(array);
                    if(ll.getHighList() != null) descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;
                case 3:
                    ll.addMiddleNode(array);
                    if(ll.getHighList() != null) descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;

                case 4:
                    ll.addLastNode(array);
                    if(ll.getHighList() != null) descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;
                case 5:
                    ll.removeFirstNode(array);
                    if(ll.getHighList() != null) descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;
                case 6:
                    ll.removeEndNode(array);
                    if(ll.getHighList() != null) descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;
                case 7:
                    ll.removeLinearList(array);
                    if(ll.getHighList() != null) descriptor = new Descriptor(ll);
                    backmenu = true;
                    break;
                case 8:
                    if(descriptor == null){
                        System.out.println("Não há lista linear.");
                    } else {
                        descriptor.printDescriptor();
                    }
                    ll.showLinearList(array);
                    backmenu = true;
                    break;
                case 9:
                    if(descriptor == null){
                        System.out.println("Não há lista linear.");
                    } else {
                        descriptor.printDescriptor();
                    }
                    ll.showArrayList(array);
                    backmenu = true;
                    break;
                case 10:
                    if(descriptor == null){
                        System.out.println("Não há lista linear.");
                    } else {
                        descriptor.printDescriptor();
                    }
                    
                    backmenu = true;
                    break;
                case 11:                     
                    backmenu = false;
                    break;
            }
        } while (backmenu);
    }

    public static int menu() {
        int x;
        do {
            System.out.println(
                    "\n1. Criar Lista\n"
                    + "2. Inserir Nodo no Inicio\n"
                    + "3. Inserir  Nodo no Meio\n"
                    + "4. Inserir  Nodo no Fim\n"
                    + "5. Remover Nodo Inicio\n"
                    + "6. Remover Nodo Fim\n"
                    + "7. Remover Lista [LL]\n"
                    + "8. Imprimir Lista [LL]\n"
                    + "9. Imprimir Lista [LA]\n"
                    + "10. Imprimir Descriptor[DL]\n"
                    + "11. Fim");
            x = input.nextInt();
        } while (x > 11 || x < 1);
        return x;
    }
}
