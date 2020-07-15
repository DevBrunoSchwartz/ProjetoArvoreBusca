package Arvore;

public class BubbleSort extends ProjetoArvore{
		
	private static int[] vetor;
	public BubbleSort () {
		super(vetor);
	}
	
	public void bsort (int vetor[]) {
		
		int aux;
		boolean controle;
		
		for(int i=0; i<vetor.length-1; i++) {
			controle = true;
			for(int j=0; j<(vetor.length -1); j++) {
				if(vetor [j] > vetor [j+1]) {
					aux= vetor[j];
					vetor[j] = vetor[j+1];
					vetor [j+1] = aux;
					controle = false;
				}
			}
			if(controle) {
				break;
			}
		}
		
		}
		
	
	
	
}
