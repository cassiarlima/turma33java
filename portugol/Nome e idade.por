programa
{
	
	funcao inicio()
	{
		//aqui começa as variaveis
		cadeia nome
		inteiro idade //camelcase
		inteiro anoNascimento, ano
		ano = 2021

		escreva("Bom dia, qual é o seu nome completo? ")
		leia(nome)
		escreva("Qual ano você nasceu ?")
		leia(anoNascimento)
		idade=ano-anoNascimento

		escreva ("Bom dia, " +nome+ " sua idade é " +idade+ " anos. "   )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */