# fluigcclean-api-0.0.1 - Primeira vez fazendo uma API REST



## Como a API deve ser usada?

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

