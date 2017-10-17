/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao3;

/**
 *
 * @author Super i3
 */
class FilaComPilhas implements Fila_IF {

    private PilhaComArray pilha1, pilha2;

    public FilaComPilhas() {
        this.pilha1 = new PilhaComArray();
        this.pilha2 = new PilhaComArray();
    }

    @Override
    public void enqueue(int element) throws Exception {
        if (pilha1.isFull()) {
            throw new Exception("A Fila está cheia.");
        } else {
            pilha1.push(element);
        }
    }

    @Override
    public int dequeue() throws Exception {
        int element;
        if (pilha1.isEmpty()) {
            throw new Exception("A fila está vazia, não pode tirar nada.");
        } else if (this.pilha2.isEmpty()) {
            while (!pilha1.isEmpty()) {
                this.pilha2.push(pilha1.pop());
            }
        }

        element = pilha2.pop();

        if (pilha1.isEmpty()) {
            while (!pilha2.isEmpty()) {
                pilha1.push(pilha2.pop());
            }
        }

        return element;
    }

    @Override
    public int head() throws Exception {
        int element;
        if (pilha1.isEmpty()) {
            throw new Exception("A fila está vazia.");
        } else if (pilha2.isEmpty()) {
            while (!pilha1.isEmpty()) {
                pilha2.push(pilha1.pop());
            }
        }

        element = pilha2.top();

        if (pilha1.isEmpty()) {
            while (!pilha2.isEmpty()) {
                pilha1.push(pilha2.pop());
            }
        }

        return element;
    }

    @Override
    public boolean isEmpty() {
        return pilha1.isEmpty();
    }

    @Override
    public boolean isFull() {
        return pilha1.isFull();
    }

}
