<%@page contentType="text/html" pageEncoding="UTF-8" import="java.time.format.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="layout/header.jsp" />
<h1>${titulo}</h1>
<p><a href="${pageContext.request.contextPath}/cursos/form" class="btn btn-primary m-4">crear [+]</a></p>
<form action="${pageContext.request.contextPath}/cursos/buscar" method="post">
    <div class="row mb-2">
        <div class="col-sm-3">
            <input type="text" name="nombre" class="form-control">
        </div>
        <div class="col-sm-3">
            <input type="submit" value="Buscar" class="btn btn-light">
        </div>
    </div>
</form>
<table class="table table-hover table-striped">
    <tr>
        <th>id</th>
        <th>nombre</th>
        <th>instructor</th>
        <th>duracion</th>
        <th>editar</th>
        <th>eliminar</th>
    </tr>
    <c:forEach items="${cursos}" var="c">
        <tr>
            <td>${c.id}</td>
            <td>${c.nombre}</td>
            <td>${c.instructor}</td>
            <td>${c.duracion}</td>
            <td><a href="${pageContext.request.contextPath}/cursos/form?id=${c.id}" class="btn btn-sm btn-success">Editar</a></td>
            <td><a onclick="return confirm('esta seguro que desea eliminar?');"
                   href="${pageContext.request.contextPath}/cursos/eliminar?id=${c.id}" class="btn btn-sm btn-danger">Eliminar</a></td>
        </tr>
    </c:forEach>
</table>
<jsp:include page="layout/footer.jsp" />