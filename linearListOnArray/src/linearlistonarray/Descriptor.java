package linearlistonarray;

import java.util.Arrays;

/**
 *
 * @author Leu <@leunardosevla at twitter.com>
 * 
 * Estrutura descritor:
 * [DIL,DNR,DMA,DME,DFL]
 * DIL inicio lista
 * DNR numero elementos
 * DMA maior elemento
 * DME menor elemento
 * DFL final lista
 */
public class Descriptor {
    private final int [] descriptor = new int [5];
    private final int length;
    private final int highNode;
    private final int lowNode;
    private final int firstNode;
    private final int lastNode;    

    public Descriptor (LinearList ll) {       
        length = ll.getLength();
        highNode = ll.getHighList();
        lowNode = ll.getLowList();
        firstNode = ll.getStartList();
        lastNode = ll.getEndList();
        setDescriptor();
    }
    
    private void setDescriptor() {
        descriptor[0] = firstNode;
        descriptor[4] = lastNode;
        descriptor[1] = length;
        descriptor[2] = lowNode;
        descriptor[3] = highNode;
    }
    
    public void printDescriptor() {
        System.out.println(Arrays.toString(descriptor));
    }
}
