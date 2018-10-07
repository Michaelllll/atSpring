# atSpring
Curso formación en Spring, septiembre 2018

Aplicación de gestión de competiciones, donde intervienen corredores que participan en dichas competiciones y obtienen resultados. Los corredores pertenecen a un club y las competiciones se dividirán en tres categorías: master20, master30 y master40.

# Parámetros relevantes
 - Nombre de BD: atspring
 - Puerto de la aplicación: 8080
 
# Rutas más relevantes

*Aclaración*: las dos primeras rutas se asocian al método PUT para realizar única y exclusivamente pruebas, en un entorno de producción haría falta sustituir dicho método.

- **localhost:8080/result/file** a través del método PUT. Dicha ruta genera un fichero txt en el directorio raiz del proyecto con nombre: *clasificacion.txt* El fichero generado a partir de un algortimo contendrá todos los clubes que han participado en una competición junto con sus correspondintes puntuaciones. Puedes encontrar la lógica en ResultServiceImpl.java [writeToFile].

- **localhost:8080/result/age** a través del método PUT. La ruta genera un listado por consola con todos los participantes de una competición divididos en las tres categorías en función de su año de nacimiento, ordenados por puntuación. Puedes ecnontrar la lógica en  ResultServiceImpl.java [getResultsByAge].

- **localhost:8080/club/{idClub}/runner/{idRunner}** a través del método PUT. Actualiza la entidad club añadiendo un nuevo corredor. idClub e idRunner representan números enteros. Puedes encontrar la lógica en ClubServiceImpl.java [addRunner]

- **Otras rutas**: existen otras rutas en las distintas entidades, cuya finalidad son crear una entidad (POST), eliminarla (DELETE) o buscarla por un identificador (GET).
