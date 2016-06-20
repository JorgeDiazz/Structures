package Applications;
 
import Queue.*;
import Stack.*;

/**
 * 
 * Ejemplos de aplicacion de la estructura de datos tipo cola 
 * 
 * @author Wilson Soto
 * @since 15.09.15
 * 
 */

public class Queues {

    public static void main(String[] args) {
        
        Queues q = new Queues();
        q.unknown1 (3,12);
        q.unknown2 (12);
        q.unknown3 (12);
    }
    
/**
 * Esta clase tiene la implementación del algoritmo para solucionar el problema de Josefo
 * <p>
 * http://progra.usm.cl/apunte/ejercicios/2/josefo.html
 * 
 * @param m integer
 * @param n integer
 * 
 */
    public void unknown1 (int m, int n) {
        
        LinkedQueue q = new LinkedQueue();
        
        for (int i = 1; i <= n; i++) 
            q.put(i);

        while (!q.isEmpty()) {
            for (int i = 0; i < m - 1; i++) {
                q.put(q.remove());
            }
            System.out.print(q.remove()+ " ");
        }
        System.out.println();

    }
    
    /**
     * 
     * @param n integer
     */
    public void unknown2 (int n) {

        ArrayQueue q = new ArrayQueue();
        
        q.put(0);
        q.put(1);
        for (int i = 0; i < n; i++) {
            int a = (int) q.remove();
            int b = (int) q.remove();
            q.put(b);
            q.put(a + b);
            System.out.print(a+" ");
        }

    }
    
    /**
     * 
     * @param n integer
     * 
     */
    public void unknown3 (int n) {

        LinkedStack i = new LinkedStack();
        LinkedStack o = new LinkedStack();
        
        System.out.println();
        
        for (int index=0; index<n; index+=2)
            i.push(index%5);
        
        if (o.empty()) {
            while (!i.empty()) {
               o.push(i.pop());
            }
        }
                
        while (!o.empty()) 
            System.out.print(o.pop()+" ");
        
    }
    
}
