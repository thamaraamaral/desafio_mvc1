<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edição de Eventos</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<jsp:include page="/WEB-INF/views/components/menu.jsp">
	<jsp:include page="/WEB-INF/views/components/notifications.jsp" />
		<div class="container mt-4">

			<div class="row mb-3">
				<div class="col-md-12">
					<h4>
						<strong>GFT Milhas</strong> Edição de Eventos
					</h4>
					Utilize o formulário para editar um evento:
				</div>
			</div>
			<form class="mb-3">
				<div class="row">
					<div class="col-md-6">
						<label>Nome do evento:</label> <input type="text"
							class="form-control" placeholder="Digite o nome do evento aqui." />
					</div>
					<div class="col-md-3">
						<label>Data Início:</label> <input type="date"
							class="form-control" />
					</div>

					<div class="col-md-3">
						<label>Data Término:</label> <input type="date"
							class="form-control" />
					</div>

					<div class="mb-3">
						<input type="submit" value="Salvar Alterações"
							class="btn btn-success mt-3"> <a
							href="/projeto-milhas/eventos-consulta"
							class="btn btn-primary mt-3">Voltar para a consulta</a>
					</div>
				</div>
			</form>
		</div>
		<!-- JavaScript Bundle with Popper -->
		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
			crossorigin="anonymous"></script></body>
</html>