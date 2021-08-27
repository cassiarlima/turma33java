programa
{
	
	funcao inicio()
	{
	
	inteiro valores[5]
	inteiro maiorPontuacao = 0.0
	inteiro x=0.0

	para (x=0; x<=4; x++){
		escreva ("Escreva a pontuação: ")
		leia(valores[x])
	}

	para (x=0; x<=4; x++){
		escreva ("\nOs valores imprimidos são: " +valores[x])

		se (valores[x] > maiorPontuacao){
			maiorPontuacao = valores[x]
		}
	}

	escreva ("\nA maior pontuação é: " +maiorPontuacao)
		

		
			
	}
    
	
	
	}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 358; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */