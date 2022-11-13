# NovoLeilaoSLE 

<h2> Passo a passo </h2>

1 - Clonar o repositório git clone https://github.com/IgorRibeiro-S/NovoLeilaoSLE.git

2 - Rodar mvn clean install para instalar as dependências

3 - Executar o servidor via Command Line com : mvn compile exec:java -Dexec.mainClass="com.fatec.edu.application.Server"

4 - A aplicação estará disponível na porta 8080

<h3> Instalar o POSTMAN para testar a aplicação back-end </h3>

1 - Faça o download do postman em : https://www.postman.com/downloads

2- testar a aplicação utilizando os endpoints abaixo: 

<h3> /api/leilao </h3>

Metódos: 
.POST
.GET
.PUT
.DELETE

Exemplo Body POST:

    {
        "id": 3,
        "dataLeilao": {
            "nano": 768038900,
            "epochSecond": 1668379611
        },
        "estado": "SP",
        "cidade": "Sao Jose dos Campos",
        "endereco": "Rua das andorinhas",
        "data": {
            "year": 2022,
            "month": "NOVEMBER",
            "monthValue": 11,
            "dayOfMonth": 13,
            "dayOfWeek": "SUNDAY",
            "leapYear": false,
            "dayOfYear": 317,
            "era": "CE",
            "chronology": {
                "id": "ISO",
                "calendarType": "iso8601"
            }
        },
        "status": "EM ABERTO",
        "imoveis": [
            {
                "id": 53,
                "registro": "344hc",
                "tipo": "Casa",
                "endereco": "Rua das colméias 44",
                "descricao": "Casa nova",
                "valor": 200000.0,
                "leilao": null,
                "totalComodos": 6,
                "quintal": true,
                "metrosQuadrados": 125.44
            }
        ],
        "veiculos": [
            {
                "id": 44,
                "tipo": "Veiculo",
                "marca": "Bilabong",
                "ano": 2009,
                "modelo": null,
                "descricao": "Skate de qualidade",
                "valor": 50.0,
                "leilao": null,
                "eletrico": false,
                "condicao": "Novo",
                "peso": 5.55
            }
        ],
        "financeira": [
            {
                "id": 78,
                "cnpj": "123124",
                "nome": "Banco Bradesco",
                "agencia": "BRADESCO",
                "conta": "Conta corrente",
                "leilao": null
            }
        ]
    }


<h3> /api/imovel  </h3> 

Metódos: 
.POST
.GET
.PUT
.DELETE

Exemplo Body POST:

    {
        "id": 53,
        "registro": "344hc",
        "tipo": "Casa",
        "endereco": "Rua das colméias 44",
        "descricao": "Casa nova",
        "valor": 200000.0,
        "leilao": null,
        "totalComodos": 6,
        "quintal": true,
        "metrosQuadrados": 125.44
    }
    
<h3> /api/veiculo  </h3> 

Metódos: 
.POST
.GET
.PUT
.DELETE

Exemplo Body POST:

    {
        "id": 19,
        "tipo": "Veiculo",
        "marca": "Nissan",
        "ano": 2012,
        "modelo": "Versa",
        "descricao": "Carro Semi novo",
        "valor": 48000.0,
        "leilao": null,
        "tetoSolar": true,
        "cor": "Prata",
        "anoLicenciamento": 2021,
        "resultadoPericiaCautelar": "APROVADO"
    }
    
<h3> /api/cliente  </h3> 

Metódos: 
.POST
.GET
.PUT
.DELETE

Exemplo Body POST:

    {
        "id": 12,
        "cpf": "123456",
        "nome": "Jorge",
        "telefone": "1231234",
        "cep": "123124",
        "email": "jorge@gmail.com"
    }

<h3> /api/financeira  </h3> 

Metódos: 
.POST
.GET
.PUT
.DELETE

Exemplo Body POST:

    {
        "id": 2,
        "cnpj": "766767",
        "nome": "Banco Bradesco",
        "agencia": "Bradesco",
        "conta": "BR34345",
        "leilao": null
    }
    
<h2> FILTROS COM GET </h2>
<h3> api/imovel/{tipo} </h3> 
exemplo : http://localhost:8080/api/imovel/casa

<h3> api/imovel/valores/{valor} </h3>
exemplo : http://localhost:8080/api/imovel/valores/50000.00?200000.00

<h3> api/imovel/descricao/{palavra} </h3>
exemplo : http://localhost:8080/api/imovel/descricao/entrada

Obs: para VEICULOS são as mesmas urls, apenas alterar "imovel" para "veiculo"

