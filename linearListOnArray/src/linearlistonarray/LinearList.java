package linearlistonarray;

import java.util.Arrays;

/**
 *
 * @author Leu <@leunardosevla at twitter.com>
 */
public class LinearList {

    private int startList;
    private int endList;

    public LinearList() {
    }

    public LinearList(Integer array[], int nodes) {
        startList = (array.length - nodes) / 2 + 1;
        endList = startList + nodes;
    }

    public void createLinearList(Integer array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 1;
        }

        for (int i = startList; i < endList; i++) {
            array[i] = null;
        }
    }

    public void addFirstNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            if (startList != 0) {
                startList--;
                array[startList] = null;
            } else {
                System.out.println("Não é possível adicionar mais nodos ao início.");
            }
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    public void addMiddleNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            int length = endList - startList;
            int middle = length / 2 + 1;
            //verifica se tem espaço a esquerda na LA
            if (startList > 0) { 
                //puxa todos os elementos de LLinicio até LLmeio para um slot à esquerda
                for (int i = startList - 1; i < middle; i++) {                     
                    array[i] = null;
                }
                //adiciona nodo no meio
                array[middle] = null;
                //coloca os nodos no lugar do meio até o final da LA
                for (int i = middle + 1; i < endList; i++) {
                    array[i] = null;
                }
                startList--;
            //verifica se tem espaço a direita na LA    
            } else if (endList <= array.length) {
                //coloca os nodos no lugar até MEIO
                for (int i = startList; i < middle; i++) {
                    array[i] = null;
                }
                //adiciona o nodo no MEIO
                array[middle] = null;
                //empurra o restante para o FINAL
                for (int i = middle + 1; i < endList; i++) {
                    array[i] = null;
                }
                endList++;
            } else {
                System.out.println("Não é possível adicionar mais nodos.");
            }
        }
    }

    public void addLastNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            if (endList <= array.length) {
                array[endList] = null;
                endList++;
            } else {
                System.out.println("Não há mais espaço no final.");
            }
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    public void removeFirstNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            array[startList] = 1;
            startList++;
            System.out.println("Nodo removido.");
        }
    }

    public void removeEndNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            array[endList] = 1;
            endList--;
            System.out.println("Nodo removido.");
        }
    }

    public void removeLinearList(Integer array[]) {
        if (thereIsLinearList(array)) {
            for (int i = startList; i < endList; i++) {
                array[i] = 1;
            }
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    public void showLinearList(Integer array[]) {
        if (thereIsLinearList(array)) {
            Integer array2[] = new Integer[endList - startList];
            for (int i = 0; i < array2.length; i++) {
                for (int x = startList; x < endList; x++) {
                    array2[i] = array[x];
                }
            }
            System.out.println(Arrays.toString(array2));
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    public void showArrayList(Integer array[]) {
        if (thereIsLinearList(array)) {
            System.out.println(Arrays.toString(array));
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    private boolean thereIsLinearList(Integer array[]) {
        for (Integer nodo : array) {
            if (nodo != 0) {
                return true;
            }
        }
        return false;
    }
}
