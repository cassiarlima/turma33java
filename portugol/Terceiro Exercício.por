programa
{
	
	funcao inicio()
	{
	inteiro horas,minutos, dias, tempo,segundos

	//entradas
	escreva("o tempo de duração de um evento em uma fábrica  :")
	leia(tempo)

	//processamentos
	horas = tempo / 3600
	minutos = (tempo % 3600)/60
	segundos =  (tempo % 3600)%60
	//saidas
	escreva("\nHoras  : "+horas)
	escreva("\nminutos : "+minutos)
	escreva("\nsegundos  : "+segundos)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 238; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */