package Arvore;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		ProjetoArvore arvore = new ProjetoArvore (null);
		arvore.inserir();
		int[] dadosInseridosOrdenacaoQuick = arvore.getVetor().clone();
		int[] dadosInseridosOrdenacaoMerge = dadosInseridosOrdenacaoQuick.clone();
		int[] dadosInseridosOrdenacaoBubble = dadosInseridosOrdenacaoQuick.clone();

		System.out.println(">>>>>>>> Fim inserção - Inicio ordenação <<<<<<<<<");
		
    	quickSort qck = new quickSort();
		int v[]= new int [9];
		qck.sort(dadosInseridosOrdenacaoQuick, 0, dadosInseridosOrdenacaoQuick.length -1);  
		System.out.println("Quick");
		System.out.println(Arrays.toString(dadosInseridosOrdenacaoQuick));

		MergSort merg = new MergSort ();
		int vv[] = new int [v.length];
		merg.msort(dadosInseridosOrdenacaoMerge,vv,0, dadosInseridosOrdenacaoMerge.length-1);
    
		System.out.println("Merge");
		System.out.println(Arrays.toString(dadosInseridosOrdenacaoMerge));
		
		BubbleSort bubble = new BubbleSort ();    
		bubble.bsort(dadosInseridosOrdenacaoBubble);

		System.out.println("Bubble");
		System.out.println(Arrays.toString(dadosInseridosOrdenacaoBubble));
		
		
		
		
		
	}

}
