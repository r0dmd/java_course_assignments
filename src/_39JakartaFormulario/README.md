# Tarea 39 - Formulario

Para este nuevo desafío se requerirá el uso formulario en el Api Servlet, el objetivo consiste en crear un formulario para registros de productos.

## Requerimientos
- Crear un proyecto llamado webapp-form-tarea2
- Crear nuevo servlet llamado RegistroProductoServlet mapeado a la ruta /crear, con el método doGet() el cual debe despachar (forward) a la vista form.jsp que contiene el formulario html y el doPost() que se encargará de validar los datos y una vez validado correctamente debe mostrar los datos en el navegador.

- El formulario de registro debe contener los siguientes campos y validaciones:
	- nombre (no vacío)
	- precio (no vacío y entero)
	- fabricante (no vacío, entre 4 y 10 caracteres)

- En caso de error de validación mostrar los mensajes de error a la derecha de cada campo.

- Opcional: el campo select categorias para seleccionar una categoría al producto, pero no es requisito.
- Opcional: usar estilos bootstrap.

---

Una vez terminada y probada la tarea deberán publicar el código fuente de todos los archivos involucrados, además de las imágenes screenshot (imprimir pantalla).

NO subir el proyecto completo, sólo los archivos involucrados, que son los siguientes:
· Clase servlet RegistroProductoServlet.
· Vistas jsp involucradas.
· pom.xml.
· Imágenes screenshot del programa funcionando en el navegador.