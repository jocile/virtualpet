
/** Impletar o seguinte algoritmo:
 *classe VIRTUAL_PET			
início			
	OPCAO,ACAO,N,CL,FM :literal
	ANIMAL ANIMALVIRTUAL 
	AVE  AVEVIRTUAL 
	escreva “Você quer cuidar de uma ave ou outro animal?
        * Digite 1 → Ave, 2 → Outro animal  ou 0 → Encerrar”...
        * leia OPCAO
	enquanto (OPCAO <> 0) faça			
		se (OPCAO = 1)			
			então escreva “Qual o nome da sua ave?”
			leia N
			escreva “Qual a classe da sua ave?”
			leia CL
			escreva “Qual a família da ave?”
			leia FM
			escreva “Qual  a cor da pena da ave?”
			leia CP 
			escreva “A sua ave voa?”
			leia V
			AVEVIRTUAL ← novo AVE (N,CL,FM,CP,V)
			escreva “Sua ave “,AVEVIRTUAL.OBTER_NOME( ), “nasceu!”
		senão escreva “Qual o nome do seu animal?”
			leia N
			escreva “Qual a classe do seu animal?”
			leia CL
			escreva “Qual a família do seu animal?”
			leia FM
			ANIMAL VIRTUAL ← ANIMAL(N,CL,FM)
			escreva “Seu animal “,ANIMAL.OBTER_NOME( ), “nasceu!”
		fim-se
		repita
		se (OPCAO = 1)			
			então se (ANIMAL VIRTUAL.OBTER_ESTADO( ) )			
			então escreva “Digite a ação você quer ?”
			escreva “C → Comer, R → correr ou D → Dormir ou E → Encerrar”
			leia ACAO
			senão ACAO ← “MORTO”			
		fim-se
		caso ACAO
			seja “C” faça ANIMAL VIRTUAL.COMER( )
			seja “R” faça ANIMAL VIRTUAL.CORRER( )
			seja “D” faça ANIMAL VIRTUAL.DORMIR( )
			seja “E” faça escreva “Você está abandonando seu animal!”
			seja “MORTO” faça escreva “Seu animal morreu! Não há mais chance!”
			senão escreva “Ação inválida!”			
		fim-caso
		senão se (AVEVIRTUAL.OBTER_ESTADO( ) )
                        então escreva “Digite a ação você quer ?”
			escreva “C ← Comer, R ← correr, V← Voar,  D ← Dormir ou E ← Encerrar”
			leia ACAO
		senão ACAO ← “E”			
		fim-se
		caso ACAO			
			seja “C” faça AVEVIRTUAL.COMER( )
			seja “R” faça AVEVIRTUAL.CORRER( )
			seja “V” faça AVEVIRTUAL.VOAR ( )
			seja “D” faça AVEVIRTUAL.DORMIR ( )
			seja “E” faça escreva “Você está abandonando seu animal!”
			seja “MORTO” faça escreva “Seu animal morreu! Não há mais chance!”
		senão escreva “Ação inválida!”
                fim-caso			
		fim-se
			até que (ACAO = “E”)
			escreva “Você quer cuidar de uma ave ou outro animal? Digite 1 → Ave, 2→ Outro animal  ou 0→ Encerrar”
			leia OPCAO			
		fim-enquanto
	fim
fim-classe
 */
public class Virtualpet {
    
}
