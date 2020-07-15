package Arvore;

import java.util.Arrays;

public class quickSort extends ProjetoArvore{

	
	private static int[] vetor;
	public quickSort () {
		super(vetor);
	}
	
	 public void sort(int[]vetor, int esq, int dir ) {
      this.vetor = vetor;

	    	if(esq < dir) {
	    		int j = separar (vetor, esq, dir);
	    		sort(vetor, esq, j-1);
	    		sort(vetor, j+1, dir);
	    	}
	    	
	    }
	    public int separar (int [] vetor, int esq, int dir) {
	    	int i = esq+1;
	    	int j = dir;
	    	int pivo = vetor[esq];
	    	while (i <= j) {
	    		if(vetor[i] <= pivo) i++;
	    		else if (vetor[j]>pivo) j--;
	    		else if (i <=j) {
	    			trocar(vetor, i , j);
	    			i++;
	    			j--;
	    		}
	    	}
	    	trocar(vetor, esq, j);
			return j;
		}
	    public void trocar (int []vetor, int i, int j) {
	    	int aux = vetor[i];
	    	vetor[i] = vetor[j];
	    	vetor[j] = aux;
	    }
	    
	    public int []getVetor(){
	    	return vetor;
	    }
	
}
