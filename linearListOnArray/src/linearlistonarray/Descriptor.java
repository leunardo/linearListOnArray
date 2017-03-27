
package linearlistonarray;
/**
 *
 * @author Leu <@leunardosevla at twitter.com>
 */
public class Descriptor {
    /* 
        1. First node
        2. Last node
        3. Length of List
        4. Smaller node
        5. Higher node
    */
    private int [] descriptor = new int [5];
    
    public  Descriptor (LinearList list) {
        descriptor [0] = list.getStartList();
        descriptor [1] = list.getEndList();
        descriptor [2] = list.getLengthList();
        descriptor [3] = list.getLowList();
        descriptor [4] = list.getHighList();
    }

    public int[] getDescriptor() {
        return descriptor;
    }   
}
