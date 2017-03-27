
package linearlistonarray;
import java.util.Scanner;
/**
 *
 * @author Leu <@leunardosevla at twitter.com>
 */
public class LinearListOnArray {
   
    public static void main(String[] args) {
        menu();
    }    
    public static int menu () {        
        Scanner input = new Scanner(System.in);
        int x;
        do {
        System.out.println(
                "1. Criar Lista\n" +
                "2. Inserir Nodo no Inicio\n" +
                "3. Inserir  Nodo no Meio\n" +
                "4. Inserir  Nodo no Fim\n" +
                "5. Remover Nodo Inicio\n" +
                "6. Remover Nodo Fim\n" +
                "7. Remover Lista [LL]\n" +
                "8. Imprimir Lista [LL]\n" +
                "9. Imprimir Lista [LA]\n" +
                "10. Fim");
        x = input.nextInt();
        } while(x > 10 || x < 1);
        return x;
    }
    
    
}
