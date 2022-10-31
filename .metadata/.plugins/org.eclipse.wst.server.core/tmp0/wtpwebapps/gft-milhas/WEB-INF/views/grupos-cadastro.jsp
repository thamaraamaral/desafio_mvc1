<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Grupos</title>

	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet" />
	
	<!-- estilo para os campos e mensagens de erro de validação -->
	<style>
		label.error { color: #d9534f; }
		input.error, select.error, textarea.error { border: 1px solid #d9534f; }
	</style>

</head>
<body>

	<!-- Menu do sistema -->
	<jsp:include page="/WEB-INF/views/components/menu.jsp"/>	
	<!-- notificações -->
	<jsp:include page="/WEB-INF/views/components/notifications.jsp"/>

	<div class="container mt-4">
		
		<div class="row mb-3">
			<div class="col-md-12">
				<h4><strong>GFT Milhas</strong> Cadastro de Grupos</h4>
				Preencha o formulário para incluir um grupo:
			</div>
		</div>
		
		<form id="formCadastro" action="cadastrar-grupo" method="post" class="mb-3">
		
			<div class="row mb-3">
				<div class="col-md-6">
					<label>Nome do grupo:</label>
					<form:input path="model.nome" id="nome" name="nome" type="text" class="form-control" placeholder="Digite o nome do grupo aqui."/>
				</div>
				<div class="col-md-3">
					<label>Quantidade de participantes</label>
					<form:input path="model.quantidadeParticipantes" id="quantidadeParticipantes" name="quantidadeParticipantes" type="text" class="form-control"/>
				</div>
				
				<div class="col-md-2">
					<label>Nome do evento:</label>
					<form:select path="model.evento" id="evento" name="evento" class="form-select">
						
						<!-- opção default -->
						<option value="">Selecione o evento</option>
						
						<!-- opções do campo -->
						<form:options items="${listaEventos}"/>
						
					</form:select>
				</div>
				
			
			</div>
			
			
			<div class="mb-3">
			
				<input type="submit" value="Realizar Cadastro" class="btn btn-success"/>
				
				<a href="/gft-milhas/grupos-consulta" class="btn btn-secondary">
					Voltar para a consulta
				</a>
			
			</div>
		
		</form>
		
	</div>
	
	<!-- JS do bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	
	<!-- JS do jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	
	<!-- JS do jquery validation (posicionados após a referencia do JQuery JS) -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/additional-methods.min.js"></script>
	
	<script>
	
	$(document).ready(function(){
		
		$("#formCadastro").validate({
			
			//Regras de validação dos campos
			rules: {
									
				'nome' : {
					required : true
				},				
				'quantidadeParticipantes' : {
					required : true
				}
			},
			
			//Mensagens de validação dos campos
			messages: {				
				nome : {
					required : 'Por favor, informe o nome da tarefa.'
				},				
				quantidadeParticipantes : {
					required: 'Por favor, selecione a quantidade de participantes.'
				}
			}
			
		});
		
	})
	
	</script>
	
</body>
</html>