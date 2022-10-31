<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GFT Milhas - Recuperar Senha</title>

<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
	
<style>
label.error {
	color: #d9534f;
}
input.error {
	border: 1px solid #d9534f;
}
</style>

</head>
<body class="bg-secondary">
	<div class="row">
		<div class="col-md-4 offset-md-4">
			<div class="card mt-5">
				<div class="card-body">
					<div class="text-center">
						<h3 class="mt-2">
							GFT Milhas <br>Recuperar senha
						</h3>
						<p>Informe o seu e-mail para cadastrar uma nova senha</p>
						<hr />
					</div>
					<form id="formPassword" action="recuperar-senha" method="post"
						autocomplete="off">
						<div class="mb-3">
							<label>Email de acesso:</label>
							<form:input path="model.email" name="email" id="email"
								type="text" class="form-control"
								placeholder="Digite seu email aqui"></form:input>
						</div>
						<div class="mb-3">
							<div class="d-grid">
								<input type="submit" value="Recuperar Senha"
									class="btn btn-primary" />
							</div>
						</div>
						<div class="mb-3">
							<div class="d-grid">
								<a href="/projeto-milhas/" class="btn btn-light"> <strong>Voltar</strong></a>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- JavaScript Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>

	<!-- JS do jquery -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>

	<!-- JS do jquery validation (posicionados após a referencia do JQuery JS) -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/jquery.validate.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.3/additional-methods.min.js"></script>

	<script>
		$(document).ready(function() {

			$("#formPassword").validate({

				rules : {
					'email' : {
						required : true,
						email : true
					}
				},

				messages : {
					email : {
						required : 'Por favor, informe o email do usuário.',
						email : 'Entre com um endereço de email válido.'
					}
				}
			});
		})
	</script>
</body>
</html>