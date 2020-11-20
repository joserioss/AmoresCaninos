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
<title>Seleccion de preferencias</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<div class="row my-5">
					<div class="col">
						<h2>Tus preferencias</h2>
					</div>
				</div>
				<div class="row my-5">
					<div class="col">
						<form action="busqueda/raza" method="get">
							<div class="form-row">
								<div class="col">
									<label for="razas_id">Razas</label> <select id="razas_id"
										name="razas_id" class="custom-select">
										<c:forEach var="raza" items="${razas}">
											<option value="${raza.id}">${raza.nombre}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="row my-3">
								<div class="col">
									<button type="submit" class="btn btn-secondary">Buscar
										por raza</button>
								</div>
							</div>
						</form>
					</div>
					
					
					
					
					<div class="col">
						<form>
							<div class="form-row">
								<div class="col">
									<label for="caracteristica_id">Caracteristicas</label> <select
										id="caracteristica_id" name="caracteristica_id"
										class="custom-select">
										<c:forEach var="caracteristica" items="${caracteristicas}">
											<option value="${caracteristica.id}">${caracteristica.nombre}</option>
										</c:forEach>
									</select>
								</div>
							</div>
							<div class="row my-3">
								<div class="col">
									<a class="btn btn-secondary" href="/busqueda" role="button">Buscar
										por caracteristica</a>
								</div>
							</div>
						</form>
					</div>
					<div class="col">
						<form action="busqueda/genero" method="get">
							<div class="form-row">
								<div class="col">
									<label for="genero_id">Genero</label> <select id="genero_id"
										name="genero_id" class="custom-select">
										<option value="1">Hembra</option>
										<option value="2">Macho</option>
									</select>
								</div>
							</div>
							<div class="row my-3">
								<div class="col">
									<button type="submit" class="btn btn-secondary">Buscar
										por genero</button>
								</div>
							</div>
						</form>
					</div>
					<div class="col">
						<form action="busqueda/edad" method="get">
							<div class="form-row">
								<div class="col">
									<label for="edad_id">Edad</label> <input id="edad" name="edad"
										type="number" class="form-control" placeholder="edad">
								</div>
							</div>
							<div class="row my-3">
								<div class="col">
									<button type="submit" class="btn btn-secondary">Buscar
										por edad</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary" data-toggle="modal"
					data-target="#exampleModal">Ver todos los perfiles</button>
				<a href="/">
					<button type="button" class="btn btn-danger">volver</button>
				</a>

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