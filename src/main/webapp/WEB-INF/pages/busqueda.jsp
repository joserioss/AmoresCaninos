<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z"
	crossorigin="anonymous">
<title>Resultado de la busqueda</title>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col">
				<div class="row my-5">
					<div class="col">
						<h2>Tu busqueda:</h2>
					</div>
				</div>
				<div>
					<div class="row row-cols-1 row-cols-md-2">
						<c:forEach var="perfil" items="${perfiles}">
							<div class="col mb-4">
								<div class="card">
									<img src="${perfil.urlImagen}" class="card-img-top" alt="${perfil.nombre}">
									<div class="card-body">
										<h5 class="card-title">${perfil.nombre}</h5>
										<ul class="list-group list-group-flush">
											<li class="list-group-item">Edad: ${perfil.edad} años</li>
											<li class="list-group-item">Genero: ${perfil.genero}</li>
											<li class="list-group-item">Frase: ${perfil.frase}</li>
										</ul>
									</div>
								</div>
							</div>
						</c:forEach>
					</div>
				</div>
				<div class="row my-5">
					<div class="col">
						<a href="/preferencias">
							<button type="button" class="btn btn-danger">volver</button>
						</a>
					</div>
				</div>

				<!-- Modal -->
				<div class="modal fade" id="exampleModal" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h5 class="modal-title" id="exampleModalLabel">Perfiles</h5>
								<button type="button" class="close" data-dismiss="modal"
									aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
							</div>
							<div class="modal-body">
								<table class="table">
									<thead>
										<tr>
											<th scope="col">#</th>
											<th scope="col">Nombre</th>
											<th scope="col">Genero</th>
											<th scope="col">Edad</th>
											<th scope="col">Frase</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="perfil" items="${perfiles}">
											<tr>
												<th scope="row">${perfil.id}</th>
												<td>${perfil.nombre}</td>
												<td>${perfil.genero}</td>
												<td>${perfil.edad}</td>
												<td>${perfil.frase}</td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary"
									data-dismiss="modal">Close</button>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>



	<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
		integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
		integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
		integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
		crossorigin="anonymous"></script>
</body>
</html>