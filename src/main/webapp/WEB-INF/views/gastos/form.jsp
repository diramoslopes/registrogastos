<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro Seus Gastos</title>
</head>
<body>
	
	<form action="/registrogastos/gastos" method="post">
		<div>
			<label>Descrição</label>
			<input type="text" name="descricao">
		</div>
		<div>
			<label>Valor</label>
			<input type="text" name="valor">
		</div>
		<div>
			<label>Data</label>
			<input type="text" name="data">
		</div>
		<button type=submit>Registrar</button>
	</form>
	
	
</body>
</html>