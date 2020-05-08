<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Serviços de Logistica</title>
</head>
<body>
<h1>File index.html ok!</h1>
<br/>
<p>Serviços disponíveis:</p>

<p><b>Entregador</b></p>
<a href="http://localhost:8080/LogisticaDM112/api/logistica/entregador/{cpf}">Busca entregador por CPF em Logistica</a>
<p><b>GET - http://localhost:8080/LogisticaDM112/api/logistica/entregador/{cpf}</b></p>
<br/>

<a href="http://localhost:8080/LogisticaDM112/api/logistica/entregador">Busca todos entregadores cadastrados em Logistica</a>
<p><b>GET - http://localhost:8080/LogisticaDM112/api/logistica/entregador</b></p>
<br/>

<a href="http://localhost:8080/LogisticaDM112/api/logistica/entregador">Insere novo Entregador em Logistica</a>
<p><b>POST - http://localhost:8080/LogisticaDM112/api/logistica/entregador</b></p>
<br/>

<p><b>Entrega</b></p>
<a href="http://localhost:8080/LogisticaDM112/api/logistica/entrega/{numeroPedido}">Busca entrega por numero do pedido em Logistica</a>
<p><b>GET - http://localhost:8080/LogisticaDM112/api/logistica/entrega/{numeroPedido}</b></p>
<br/>

<a href="http://localhost:8080/LogisticaDM112/api/logistica/entreg">Busca todas entregas cadastradas em Logistica</a>
<p><b>GET - http://localhost:8080/LogisticaDM112/api/logistica/entrega</b></p>
<br/>

<a href="http://localhost:8080/LogisticaDM112/api/logistica/entrega">Registra nova Entrega em Logistica</a>
<p><b>POST - http://localhost:8080/LogisticaDM112/api/logistica/entrega</b></p>
<br/>

<p><b>payloads</b></p>
Criar Entregador
<p>
<b>
<code>
{
	"cpf": "111.111.111-11",
	"name": "Entregador01",
	"description" : "Entegador o melhor"
}
</code>
</b>
</p>

Registrar Entrega
<p>
<b>
<code>
{
	"numeroPedido": "pedido01",
	"cpfEntrega": "999.999.999-99",
	"description": "successo na entrega",
	"dataEntrega": "2020-01-01T12:12:12.999"
}
</code>
</b>
</p>
</body>
</html>