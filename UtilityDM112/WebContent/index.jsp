<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servi�os de Utilidade</title>
</head>
<body>
<h1>File index.jsp ok!</h1>
<br/>
<h2>Servi�os dispon�veis:</h2>
<br/>
POST: <a href="http://localhost:8080/UtilityDM112/api/generateBillet/{order}/{cpf}">Gera��o de boletos</a>
<br/>
<br/>
POST: <a href="http://localhost:8080/UtilityDM112/api/sendMail/">Envio de email</a>
<br/>
O corpo do request deve possuir um JSON
<br/>
{
<br/>
	"from": "robertorr9@gmail.com",
<br/>
	"password": "robertodm112",
<br/>
	"to": "rrocha.roberto@gmail.com",
<br/>
	"content": "conte�do do pdf"
<br/>
}
<br>

<br/>
POST: <a href="http://localhost:8080/UtilityDM112/api/sendTextMail/">Envio de email com texto</a>
<br/>
O corpo do request deve possuir um JSON
<br/>
{
<br/>
	"from": "robertorr9@gmail.com",
<br/>
	"password": "robertodm112",
<br/>
	"to": "otavio.ses@gmail.com",
<br/>
	"subject": "Assunto do email",
<br/>
	"text": "Texto do email"
<br/>
}
<br>

</body>
</html>
