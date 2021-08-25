programa
{
	
	funcao inicio()
	{
		//7) Receber valores de base e altura de um triângulo e verificar se são valores válidos
		//(positivos maiores que zero). Em caso afirmativo, calcular a área do triângulo.

		real base, altura, area

		escreva ("digite a base do triângulo: ")
		leia(base)
		escreva ("digite a altura do triângulo: ")
		leia(altura)

		se (base <=0){
			escreva ("Não foi possível calcular, informe números positivos e maiores que zero na base.")
		}
		senao se (altura <=0){
			escreva("Não foi possível calcular, informe números positivos e maiores que zero na altura.")
		}
		senao {
			area = ((altura*base)/2)
			escreva ("O valor do triângulo é " +area+ ".")
			
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 675; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */