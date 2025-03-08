// Classe Pilha
class Pilha {
    static final int MAX = 10;
    int top;
    int a[] = new int[MAX]; // Define tamanho máximo da pilha

    // Construtor
    Pilha() {
        top = -1;
    }

    // Verifica se a pilha está vazia
    boolean isEmpty() {
        return (top < 0);
    }

    // Empilha um elemento
    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Estouro de Pilha!");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    // Desempilha um elemento
    int pop() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        } else {
            return a[top--];
        }
    }

    // Retorna o elemento no topo da pilha
    int peek() {
        if (top < 0) {
            System.out.println("Pilha Vazia!");
            return 0;
        } else {
            return a[top];
        }
    }
}
