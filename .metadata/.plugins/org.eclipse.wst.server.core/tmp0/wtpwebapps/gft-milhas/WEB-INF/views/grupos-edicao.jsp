<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edição de Eventos</title>

<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet" />


<style>
label.error {
	color: #d9534f;
}

input.error, select.error, textarea.error {
	border: 1px solid #d9534f;
}
</style>

</head>
<body>

	<!-- Menu do sistema -->
	<jsp:include page="/WEB-INF/views/components/menu.jsp" />
	<!-- notificações -->
	<jsp:include page="/WEB-INF/views/components/notifications.jsp" />

	<div class="container mt-4">

		<div class="row mb-3">
			<div class="col-md-12">
				<h4>
					<strong>GFT Milhas</strong> Edição de Eventos
				</h4>
				Utilize o formulário para editar um grupo:
			</div>
		</div>

		<form id="formEdicao" action="editar-grupo" method="post" class="mb-3">

			<!-- campo oculto -->
			<form:input path="model.idGrupo" type="hidden" />

			<div class="row mb-3">
				<div class="col-md-6">
					<label>Nome do evento:</label>
					<form:input path="model.nome" id="nome" name="nome" type="text"
						class="form-control" placeholder="Digite o nome do grupo aqui." />
				</div>
				<div class="col-md-2">
					<label>Quantidade de participantes:</label>
					<form:input path="model.quantidadeParticipantes"
						id="quantidadeParticipantes" name="quantidadeParticipantes"
						type="text" class="form-control" />
				</div>

			</div>

			<div class="mb-3">

				<input type="submit" value="Salvar Alterações"
					class="btn btn-primary" /> <a href="/gft-milhas/grupos-consulta"
					class="btn btn-secondary"> Voltar para a consulta </a>

			</div>

		</form>

	</div>

	<!-- JS do bootstrap -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

	<!-- JS do jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<!-- JS do jquery validation (posicionados após a referencia do JQuery JS) -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/additional-methods.min.js"></script>

	<script>
		$(document)
				.ready(
						function() {

							$("#formEdicao")
									.validate(
											{

												//Regras de validação dos campos
												rules : {

													'nome' : {
														required : true
													},
													'quantidadePessoas' : {
														required : true
													}
												},

												//Mensagens de validação dos campos
												messages : {
													nome : {
														required : 'Por favor, informe o nome do grupo.'
													},
													quantidadePessoas : {
														required : 'Por favor, selecione a quantidade de pessoas.'
													}
												}
											});
						})
	</script>

</body>
</html>