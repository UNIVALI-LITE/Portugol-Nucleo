package programas;

import br.univali.portugol.nucleo.mensagens.ErroExecucao;
import br.univali.portugol.nucleo.Programa;

public class testeCodigoParaVariaveisInspecionadas extends Programa
{
    
    
    public testeCodigoParaVariaveisInspecionadas() throws ErroExecucao, InterruptedException
    {
        variaveisInspecionadas = new Object[4];
        vetoresInspecionados = new Vetor[2];
        matrizesInspecionadas = new Matriz[2];
    }

    @Override
    protected void executar(String[] parametros) throws ErroExecucao, InterruptedException
    {
        int x = 1;
        if (variaveisInspecionadas[0] != null) 
        {
            variaveisInspecionadas[0] = x; 
        }
        
        x = 2;
        if (variaveisInspecionadas[0] != null) 
        {
            variaveisInspecionadas[0] = x; 
        }
        
        
        int y;
        y = 10;
        if (variaveisInspecionadas[1] != null)
        {
            variaveisInspecionadas[1] = y;
        }
        
        int vetor[] = new int[]{1, 2, 3};
        
        if (vetoresInspecionados[0] != null)
        {
            for (int i_1010 = 0; i_1010 < vetoresInspecionados[0].tamanho; i_1010++)
            {
                vetoresInspecionados[0].setValor(vetor[i_1010], i_1010);
            }
        }

        
        vetor[1] = 45;
        
        if (vetoresInspecionados[0] != null)
        {
            vetoresInspecionados[0].setValor(vetor[1], 1);
        }
        
        int matriz[][] = new int[][]{{1, 2}, {3, 4}};
        if (matrizesInspecionadas[0] != null)
        {
            for (int i_1010 = 0; i_1010 < matrizesInspecionadas[0].linhas; i_1010++)
            {
                for (int j_1010 = 0; j_1010 < matrizesInspecionadas[0].colunas; j_1010++)
                {
                    matrizesInspecionadas[0].setValor(matriz[i_1010][j_1010], i_1010, j_1010);
                }
            }
        }
        
        matriz[0][1] = 100;
        if (matrizesInspecionadas[0] != null)
        {
            matrizesInspecionadas[0].setValor(matriz[0][1], 0, 1);
        }
        
        teste(x, vetor, matriz);
        
        for(int i=0; i < 10; i=i+1)
        {
            if (variaveisInspecionadas[2] != null)
            {
                variaveisInspecionadas[2] = i;
            }
        }

    }
    
    private void teste(int a, int v[], int m[][]) throws ErroExecucao, InterruptedException
    {
        
        if (variaveisInspecionadas[3] != null)
        {
            variaveisInspecionadas[3] = a;
        }
        
        if (vetoresInspecionados[1] != null)
        {
            if (vetoresInspecionados[1].tamanho != v.length)
            {
                inspecionaVetor(1, v.length);
            }
            for (int i_1010 = 0; i_1010 < vetoresInspecionados[1].tamanho; i_1010++)
            {
                vetoresInspecionados[1].setValor(v[i_1010], i_1010);
            }
        }
        
        if (matrizesInspecionadas[1] != null)
        {
            if (matrizesInspecionadas[1].linhas != m.length)
            {
                inspecionaMatriz(1, m.length, m[0].length);
            }
            for (int i_1010 = 0; i_1010 < matrizesInspecionadas[1].linhas; i_1010++)
            {
                for (int j_1010 = 0; j_1010 < matrizesInspecionadas[1].colunas; j_1010++)
                {
                    matrizesInspecionadas[1].setValor(m[i_1010][j_1010], i_1010, j_1010);
                }
            }
        }
        
        a = a + 1;
        if (variaveisInspecionadas[3] != null)
        {
            variaveisInspecionadas[3] = a;
        }
        
        v[0] = 1;
        if (vetoresInspecionados[1] != null)
        {
            vetoresInspecionados[1].setValor(v[0], 0);
        }
        
        m[0][0] = 1;
        if (matrizesInspecionadas[1] != null)
        {
            matrizesInspecionadas[1].setValor(m[0][0], 0, 0);
        }
    }
}
