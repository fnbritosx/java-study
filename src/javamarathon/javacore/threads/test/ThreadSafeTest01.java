package javamarathon.javacore.threads.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeName {
    private final List<String> names = Collections.synchronizedList(new ArrayList<>());

    public void add(String name) {
        names.add(name);
    }

    /* ATENÇÃO: Mesmo usando Collections.synchronizedList, este méthod NÃO é seguro.
   Ocorre uma Race Condition (Condição de Corrida) do tipo "Check-then-Act":

   1. Thread A verifica if(!names.isEmpty()) -> true
   2. Thread B verifica if(!names.isEmpty()) -> true (antes de A remover)
   3. Thread A remove o único elemento.
   4. Thread B tenta remover e estoura NoSuchElementException.

   SOLUÇÃO: Envolver o IF e o REMOVE em um bloco 'synchronized(names)'.
*/
    public void removeFirst() {
        synchronized (names) {
            if (!names.isEmpty()) {
                System.out.println(Thread.currentThread().getName());
                System.out.println(names.removeFirst());
            }
        }
    }
}

public class ThreadSafeTest01 {
    public static void main(String[] args) {
        ThreadSafeName threadSafeName = new ThreadSafeName();

        threadSafeName.add("Fernando");
        Runnable runnable = threadSafeName::removeFirst;

        new Thread(runnable).start();
        new Thread(runnable).start();


    }
}
