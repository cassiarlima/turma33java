programa
{
	
	funcao inicio()
	{
		cadeia nome
		real temperatura, conversao
		

		escreva ("Bom dia, qual seu nome? ")
		leia(nome)
		escreva ("Quantos graus celsius está na sua região? ")
		leia(temperatura)

		conversao = ((temperatura * 9) /5) + 32

		escreva("Olá," + nome + " a temperatura na sua região em fareinheit está em: "  + conversao)
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 282; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */