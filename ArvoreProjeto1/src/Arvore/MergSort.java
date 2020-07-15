package Arvore;
import java.util.Arrays;

public class MergSort extends ProjetoArvore  {
	
	
	private static int[] vetor;
	public MergSort() {
		super(vetor);
	}
	
	public void msort (int []vetor, int []vv, int ini, int fim){
        if(ini < fim){
          int meio = (ini + fim) / 2;
          msort(vetor, vv, ini, meio);
          msort(vetor, vv, meio+1, fim);
          intercalar(vetor, vv, ini, meio, fim);
        }
      }
      public void intercalar(int []vetor, int []vv, int ini, int meio, int fim ){
        for(int k = ini; k <= fim; k++)
          vv[k] = vetor[k];

          int i = ini;
          int j = meio + 1;

          for(int k=ini; k<= fim; k++ ){
            if( i > meio ) vetor[k] = vv[j++];
            else if (j > fim) vetor[k] = vv[i++];
            else if (vv[i] < vv[j]) vetor[k] = vv[i++];
            else vetor[k] = vv[j++];
          }
        
      }
    
    

}
