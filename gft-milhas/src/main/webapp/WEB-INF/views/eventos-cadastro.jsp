<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de Eventos</title>

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

	<div class="container mt-4">
		
		<div class="row mb-3">
			<div class="col-md-12">
				<h4><strong>GFT Milhas</strong> Cadastro de Eventos</h4>
				Preencha o formulário para incluir um evento:
			</div>
		</div>
		
		<form id="formCadastro" action="cadastrar-evento" method="post" class="mb-3">
		
			<div class="row mb-3">
				<div class="col-md-6">
					<label>Nome da tarefa:</label>
					<form:input path="model.nome" id="nome" name="nome" type="text" class="form-control" placeholder="Digite o nome do evento aqui."/>
				</div>
				<div class="col-md-2">
					<label>Data início:</label>
					<form:input path="model.dataInicio" id="dataInicio" name="dataInicio" type="date" class="form-control"/>
				</div>
				<div class="col-md-2">
					<label>Data final:</label>
					<form:input path="model.dataFinal" id="dataFinal" name="dataFinal" type="date" class="form-control"/>
				</div>
				
			</div>
			
						
			<div class="mb-3">
			
				<input type="submit" value="Realizar Cadastro" class="btn btn-success"/>
				
				<a href="/gft-milhas/eventos-consulta" class="btn btn-secondary">
					Voltar para a consulta
				</a>
			
			</div>
		
		</form>
		
		<div>
			<strong>${mensagem}</strong>
		</div>
				
	</div>
	
		<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js">
	</script>
	
	<!-- JS do jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	
	<!-- JS do jquery validation  -->
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
				'dataInicio' : {
					required : true
				},
				'dataFinal' : {
					required : true
				}	
			},
			
			//Mensagens de validação dos campos
			messages: {				
				nome : {
					required : 'Por favor, informe o nome da tarefa.'
				},				
				dataInicio : {
					required: 'Por favor, selecione a data da tarefa.'
				},
				dataFinal : {
					required: 'Por favor, selecione a hora da tarefa.'
				}
			}
			
		});
		
	})
	
	</script>
	
</body>
</html>