package linearlistonarray;

import java.util.Arrays;

/**
 *
 * @author Leu <@leunardosevla at twitter.com>
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
        descriptor[1] = lastNode;
        descriptor[2] = length;
        descriptor[3] = lowNode;
        descriptor[4] = highNode;
    }
    
    public void printDescriptor() {
        System.out.println(Arrays.toString(descriptor));
    }
}
