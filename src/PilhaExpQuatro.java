public class PilhaExpQuatro {
    public static void main(String[] args) {
        String[] names = {
                "Mark", "Berg", "John", "Beni", "Jebb", "June",
                "Mary", "Karl", "Fred", "Hall", "Troy", "Joan"
        };

        filaSimples stack = new filaSimples(10);
        System.out.println("Pilha de " + stack.getCapacity() + " posições criada: " + stack);
        System.out.println("\nPreenchendo a pilha:");

        for (String name : names) {
            System.out.print("\tInserindo o nome \"" + name + "\":\t");
            if (stack.push(name) == null)
                System.out.println("PILHA CHEIA!!! impossível inserir...");
            else
                System.out.println(stack + ". " + (stack.getCapacity() - stack.getSize()) + " posições restantes.");
        }

        System.out.println("\nRemovendo 5 elementos da pilha:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("\t" + i + "ª remoção: \"" + stack.pop() + "\".");
            System.out.println(" A pilha agora está assim: " + stack);
        }

        System.out.println("\nO atual nome no topo da pilha é \"" + stack.peek() + "\".\n");
        System.out.println(stack);

        stack.clear();
        System.out.println("\nLimpando a pilha: " + stack);

        System.out.print("\nConsigo tirar mais algo da pilha? ");
        System.out.println(stack.pop() == null ? "Não consigo..." : "Consigo sim!");
    }
}

class filaSimples {
    private String[] elements;
    private int size;

    public filaSimples(int capacity) {
        elements = new String[Math.abs(capacity)];
        size = 0;
    }

    public String push(String element) {
        if (element == null)
            throw new IllegalArgumentException("O elemento não pode ser nulo!");
        if (size == elements.length)
            return null;
        elements[size++] = element;
        return element;
    }

    public String peek() {
        if (isEmpty())
            return null;
        return elements[size - 1];
    }

    public String pop() {
        if (isEmpty())
            return null;
        String result = elements[--size];
        elements[size] = null;
        return result;
    }

    public void clear() {
        for (int i = 0; i < size; i++)
            elements[i] = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return elements.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1)
                sb.append(" | ");
        }
        sb.append("]");
        return sb.toString();
    }
}
