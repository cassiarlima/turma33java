programa
{
	
	funcao inicio()
	{
		inteiro anos,meses,dias,idade

		escreva ("Quantos anos você tem ?")
		leia(anos)
		escreva ("Quantos meses você tem?")
		leia(meses)
		escreva ("Quantos dias você tem ?")
		leia(dias)

		//idade em dias
		idade= (anos/365)+(meses/30)+(dias/1)
		escreva (" Você tem " +idade+ "anos" +meses "meses" +dias " dias. ")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 294; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */