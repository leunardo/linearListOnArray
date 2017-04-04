package linearlistonarray;

import java.util.Arrays;

/**
 *
 * @author Leu <@leunardosevla at twitter.com>
 */
public class LinearList {

    private int startList;
    private int endList;
    private int length;
    private Integer highList;
    private Integer lowList;
    
    public LinearList() {
    }

    public LinearList(Integer array[], int nodes) {
        startList = (array.length - nodes) / 2 + 1;
        endList = startList + nodes;        
        isHighNode(array);
        isLowNode(array);
        setLength();
    }

    public void createLinearList(Integer array[]) {
        for (int i = getStartList(); i < getEndList(); i++) {
            array[i] = null;
        }
    }
    
    private void setLength() {
        length = getEndList() - getStartList();
    }
    
    private void isHighNode (Integer array []) {
        for(int i = getStartList(); i < getEndList(); i++){
            highList = array[i];
            if(array[i] != null){
                 if(array[i] > getHighList()) highList = array[i];
            }           
        }       
    }
    
    private void isLowNode (Integer array []) {
        for(int i = getStartList(); i < getEndList(); i++){
            lowList = array[i];
            if(array[i] != null) {
                if(array[i] < getLowList()) lowList = array[i];
            }
        }
    }

    public void addFirstNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            if (getStartList() != 0) {
                startList--;
                array[getStartList()] = null;
            } else {
                System.out.println("Não é possível adicionar mais nodos ao início.");
            }
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    public void addMiddleNode(Integer array[]) {
        if (thereIsLinearList(array)) {            
            int middle = getLength() / 2 + 1;
            //verifica se tem espaço a esquerda na LA
            if (getStartList() > 0) { 
                //puxa todos os elementos de LLinicio até LLmeio para um slot à esquerda
                for (int i = getStartList() - 1; i < middle + getStartList(); i++) {                     
                    array[i] = null;
                }
                //adiciona nodo no meio
                array[middle + getStartList()] = null;
                //coloca os nodos no lugar do meio até o final da LA
                for (int i = middle + getStartList() + 1; i < getEndList(); i++) {
                    array[i] = null;
                }
                startList--;
            //verifica se tem espaço a direita na LA    
            } else if (getEndList() <= array.length) {
                //coloca os nodos no lugar até MEIO
                for (int i = getStartList(); i < middle + getStartList(); i++) {
                    array[i] = null;
                }
                //adiciona o nodo no MEIO
                array[middle + getStartList()] = null;
                //empurra o restante para o FINAL
                for (int i = middle + getStartList()  + 1; i < getEndList(); i++) {
                    array[i] = null;
                }
                endList++;
            } else {
                System.out.println("Não é possível adicionar mais nodos.");
            }
        } else {
            System.out.println("Não há lista linear");
        }
    }

    public void addLastNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            if (getEndList() <= array.length) {
                array[getEndList()] = null;
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
            array[getStartList()] = 0;
            startList++;
            System.out.println("Nodo removido.");
        } else {
            System.out.println("Não há lista linear");
        }
    }

    public void removeEndNode(Integer array[]) {
        if (thereIsLinearList(array)) {
            array[getEndList() - 1] = 0;
            endList--;
            System.out.println("Nodo removido.");
        } else {
            System.out.println("Não há lista linear");
        }
    }

    public void removeLinearList(Integer array[]) {
        if (thereIsLinearList(array)) {
            for (int i = getStartList(); i < getEndList(); i++) {
                array[i] = 0;
            }
        } else {
            System.out.println("Não há lista linear.");
        }
    }

    public void showLinearList(Integer array[]) {
        if (thereIsLinearList(array)) {
            Integer array2[] = new Integer[getEndList() - getStartList()];
            for (int i = 0; i < array2.length; i++) {
                for (int x = getStartList(); x < getEndList(); x++) {
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
            if (nodo == null) {
                return true;
            }
        }
        return false;
    }

    public int getStartList() {
        return startList;
    }

    public int getEndList() {
        return endList;
    }

    public int getLength() {
        return length;
    }

    public Integer getHighList() {
        return highList;
    }

    public Integer getLowList() {
        return lowList;
    }
}
