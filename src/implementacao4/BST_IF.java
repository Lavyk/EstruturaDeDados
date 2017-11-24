/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao4;

/*
 * Interface para implementação da classe "BST"
 */
public interface BST_IF {
	public void insert(int element);
	public int search(int element) throws Exception; //lançar exceção caso não encontre
	public int[] preOrder();
	public int[] order();
	public int[] postOrder();
	public boolean isComplete();
}