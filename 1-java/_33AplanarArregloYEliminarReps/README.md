## Tarea 32 - Aplanar arreglo y eliminar repetidos

El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos usando el api stream.

Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el arreglo de primer nivel.

Por ejemplo, para el arreglo:

String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"}, {"java", "javascript", "kotlin"}, {"javascript"}, {}};

debería quedar:

{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
