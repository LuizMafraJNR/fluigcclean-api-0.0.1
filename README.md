# fluigcclean-api-0.0.1 - Primeira vez fazendo uma API REST

### Primeiramente gostaria de agradecer pela oportunidade que eu tive de chegar até essa etapa do processo, foi realmente algo muito importante para mim chegar até esse momento de fazer essa entrega para vocês. 

Antes de explicar como que deve ser usada a API, gostaria de falar que esse desafio foi um baita desafio para mim, primeiramente pelo simples de eu não saber fazer uma API, eu ainda estava chegando nessa parte do estudo, mas quando eu vi o desafio na quarta, desde esse dia eu dei aquele gás enorme para tentar chegar até a parte do curso em que ensina em si, a fazer uma API. NÃO IREI NEGAR QUE, como eu estudei muita coisa em pouco tempo, as informações pasasram muito rapidas pela minha cabeça e ficaram meias vagas, tive varias dificuldades em desenvolver essa minha primeira API. Vale ressaltar que eu não completei API inteira, faltou a segunda parte dela que era de fazer o calculo dos gastos, eu tinha até criado o método que calcula os gastos, porem eu não consegui implementar esse metodo na API, fui atras de informações no google mas não consegui tirar minha dúvida e por conta disso não consegui concluir 100% API, faltou apenas esse detalhe infelizmente!

## Vamos para o que interessa, como a API deve ser usada?

1. Baixe o arquivo `fluigcclean-api-0.0.1-SNAPSHOT`(DOWNLOAD: https://univillebr-my.sharepoint.com/:u:/g/personal/luiz_sesna_univille_br/ESAr2_dPGoNGtV8C2xI3g-4Bytlw3ADOglZT5MY5bzQl8Q?e=pLqHSu).
2. Execute o arquivo no seu cmd atraves do comando `java -jar fluigcclean-api-0.0.1-SNAPSHOT`
3. Em seguida começará aparecer algumas informações no cmd.

## Vai ser preciso utilizar o Postman para testar nossa API
1. Abra o postman.
2. No link HTTP use esse link `http://localhost:8080/carros`.
3. Logo após ao lado vai estar GET, mude para POST.
4. Em seguida clique em Body.
5. Onde estiver `none` mude para `raw`.
6. Dentro do espaço para escrever cole esse JSON `{
    "nome":"Jetta",
    "marca":"Volkswagen",
    "modelo":"GLI",
    "dataFabricacao":"12/12/2021",
    "consumoMedioCidade":10.9,
    "consumoMedioRodovia":14.7,
    "precoLitro":6.78,
    "consumoCidade":10,
    "consumoRodovia":0
}`
7. Caso queira mudar as informações fique a vontade.
8. Clique em `SEND` para cadastrarmos o veiculo.


Logo após ter cadastrado alguns veiculos, será possivel visualizar todos, da seguinte forma:
1. Mude de POST para GET.
2. Clique em `SEND`.
3. Logo em seguida irá aparecer uma lista com todos os veículos cadastrados.

INFELIZMENTE a parte de calcular os gastos eu não consegui implementar na nossa API, eu realmente me esforcei muito para tentar implementar, eu queria de verdade ter conseguido, eu me sentiria bem realizado se eu conseguisse para minha primeira API, mas peço desculpas por não ter alcançado a meta, vou tentar tirar umas duvidas com meus professores e tentar repostar essa API com esse metodo para calcular os gastos.
