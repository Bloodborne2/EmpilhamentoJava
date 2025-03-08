public class PilhaExmDois {
    private Object[] pilha;
    private int posicaoPilha;

    public PilhaExmDois() {
        this.posicaoPilha = -1; // Indica que a pilha está vazia
        this.pilha = new Object[10]; // Criação da pilha com 10 posições
    }

    public boolean pilhaVazia() {
        return this.posicaoPilha == -1;
    }

    public int tamanho() {
        return this.pilhaVazia() ? 0 : this.posicaoPilha + 1;
    }

    public Object exibeUltimoValor() {
        return this.pilhaVazia() ? null : this.pilha[this.posicaoPilha];
    }

    public Object desempilhar() {
        return this.pilhaVazia() ? null : this.pilha[this.posicaoPilha--];
    }

    public void empilhar(Object valor) {
        if (this.posicaoPilha < this.pilha.length - 1) {
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public static void main(String[] args) {
        PilhaExmDois p = new PilhaExmDois();
        p.empilhar("Portuguesa");
        p.empilhar("Frango com catupiry");
        p.empilhar("Calabresa");
        p.empilhar("Quatro queijos");
        p.empilhar(10);

        while (!p.pilhaVazia()) {
            System.out.println(p.desempilhar());
        }
    }
}
