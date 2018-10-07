# atSpring
Curso formación en Spring, septiembre 2018

Aplicación de gestión de competiciones, donde intervienen corredores que participan en dichas competiciones y obtienen resultados. Los corredores pertenecen a un club y las competiciones se dividirán en tres categorías: master20, master30 y master40.

# Rutas más relevantes

Aclaración: las dos primeras rutas se asocian al método PUT para realizar única y exclusivamente pruebas, en un entorno de producción haría falta sustituir dicho método.

- **localhost:8080/result/file** a través del método PUT. Dicha ruta genera un fichero txt en el directorio raiz del proyecto con nombre: *clasificacion.txt* El fichero generado a partir de un algortimo contendrá todos los clubes que han participado en una competición junto con sus correspondintes puntuaciones.

- **localhost:8080/result/age** a través del método PUT. La ruta genera un listado por consola con todos los participantes de una competición divididos en las tres categorías y ordenados por puntuación.
