package implementacao4;

/*
 * Interface para implementacao da classe "ListaEncadeada"
 * que deve ser implementada usando metodos iterativos
 * considerando sempre uma lista de numeros inteiros nao negativos
 */
public interface ListaEncadeada_IF {

    public boolean isEmpty();

    public int size();

    public int search(int element) throws Exception; //lancar excecao caso nao encontre

    public void insert(int element); //deve-se inserir no inicio da lista

    public void remove(int element);

    public int[] toArray();
}
