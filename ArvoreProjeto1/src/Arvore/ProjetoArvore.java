package Arvore;

import java.util.Arrays;
import java.util.Scanner;

public class ProjetoArvore {
	
	public int vetor[];
	
	public ProjetoArvore (int [] vetor) {
		this.vetor= new int [9];
	}
	
	 public int [] inserir () {
		 quickSort qck = new quickSort ();
		 MergSort merg = new MergSort();
		 BubbleSort bubble= new BubbleSort();
		  Scanner input = new Scanner (System.in);
		  for(int i =0; i < vetor.length; i++) {
			  System.out.println("Digite o valor desejado: ");
			  vetor[i] = input.nextInt();
		  }
		  System.out.println(Arrays.toString(vetor));
		  
		  return vetor;
	  }
	 
	 public int [] getVetor () {
		 return this.vetor;
	 }
	 
	 
	
}
