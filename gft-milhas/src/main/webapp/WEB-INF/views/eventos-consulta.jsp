<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
		
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta de Eventos</title>

	<link
		href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
		rel="stylesheet" />

	<link 
		href="//cdn.datatables.net/1.11.5/css/jquery.dataTables.min.css"
		rel="stylesheet" />
	
	<style>
		label.error { color: #d9534f; }
		input.error { border: 1px solid #d9534f; }
	</style>

</head>
<body>

	<jsp:include page="/WEB-INF/views/components/menu.jsp"/>
	<jsp:include page="/WEB-INF/views/components/notifications.jsp"/>

	<div class="container mt-4">
		
		<div class="row mb-3">
			<div class="col-md-6">
				<h4><strong>GFT Milhas</strong> Consulta de Eventos</h4>
				Pesquise os eventos desejados:
			</div>
		</div>
		
		<form id="formConsulta" action="consultar-eventos" method="get" class="mb-3">
		
			<div class="row">
				<div class="col-md-3">
					<form:input path="model.dataMin" id="dataMin" name="dataMin" type="date" class="form-control"/>
				</div>
				<div class="col-md-3">
					<form:input path="model.dataMax" id="dataMax" name="dataMax" type="date" class="form-control"/>
				</div>
				<div class="col-md-6">
				
					<input type="submit" class="btn btn-primary" value="Pesquisar Eventos"/>
					
					<a href="/gft-milhas/eventos-cadastro" class="btn btn-success">
						Cadastrar Evento
					</a>
				</div>
			</div>
		
		</form>
		
		<c:if test="${eventos.size() > 0}">
		
			<table id="tabela-eventos" class="table table-hover table-striped">
			<thead>
				<tr>
					<th>Nome do evento</th>
					<th>Data início</th>
					<th>Data término</th>
					<th></th>
					<th></th>
					<th>Operações</th>
				</tr>
			</thead>
			<tbody>
				
				<c:forEach items="${eventos}" var="t">
					
					<tr>
						<td>${t.nome}</td>
						<td><fmt:formatDate value="${t.dataInicio}" pattern="dd/MM/yyyy"/></td>
						<td><fmt:formatDate value="${t.dataFinal}" pattern="dd/MM/yyyy"/></td>
						<td></td>
						<td></td>
						<td>
							<a href="/gft-milhas/eventos-edicao?id=${t.idEvento}" 
							   class="btn btn-primary btn-sm">
								Editar
							</a>
							<a href="/gft-milhas/eventos-exclusao?id=${t.idEvento}" 
							   onclick="return confirm('Deseja realmente excluir o evento: ${t.nome}?');"
							   class="btn btn-danger btn-sm">
								Excluir
							</a>
						</td>
					</tr>
					
				</c:forEach>
				
			</tbody>
			<tfoot>
				<tr>
					<td colspan="6">
						Quantidade de eventos: <strong>${eventos.size()}</strong>
					</td>
				</tr>
			</tfoot>
			</table>	
		
		</c:if>
		
	</div>
	
	<!-- JS do bootstrap -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	
	<!-- JS do jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
	
	<!-- JS do jquery validation (posicionados após a referencia do JQuery JS) -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/additional-methods.min.js"></script>
	
	<!-- JS do jquery data tables -->
	<script src="//cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js"></script>
	
	<script>
	
	$(document).ready(function(){
		
		//aplicando o datatables
		$('#tabela-eventos').DataTable({
			language : {
				url : "//cdn.datatables.net/plug-ins/1.11.5/i18n/pt-BR.json"
			}
		});
		
		//aplicando o jquery validate
		$("#formConsulta").validate({
			
			//Regras de validação dos campos
			rules: {									
				'dataMin' : {
					required : true
				},				
				'dataMax' : {
					required : true
				}
			},
			
			//Mensagens de validação dos campos
			messages: {				
				dataMin : {
					required : 'Por favor, informe a data de início do período.'
				},				
				dataMax : {
					required : 'Por favor, informe a data de fim do período.'
				}
			}
			
		});
		
	})
	
	</script>
	
</body>
</html>
