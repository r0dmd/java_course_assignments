<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>Tarea 5 - Session HTTP</title>
    </head>
    <body>
        <h1>Tarea 5 - Session HTTP</h1>
        <h2>Hola <%=session.getAttribute("nombre") != null? session.getAttribute("nombre"): "anónimo"%>, bienvenido a la tarea5.</h2>

        <form action="/webapp-session-tarea5/guardar-session" method="post">
            <div>
                <label for="color">Ingresa tu nombre de sesión</label>
                <div>
                    <input type="text" name="nombre">
                </div>

            </div>
            <div>
                <input type="submit" value="Enviar">
            </div>

        </form>
    </body>
</html>
