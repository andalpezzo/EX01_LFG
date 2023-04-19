
README - EX01 - Prueba Técnica - LFG

─────────────────────────────────────────────────

En este LFG existen 4 tipos de datos principales [ Usuarios | Parties | Juegos | Mensajes ]<br />
Cada uno de estos datos, contiene mas datos, que serán los tienen toda la informacion a cerca de estos.

─────────────────────────────────────────────────

USUARIOS<br />
De los usuarios podemos consultar o modificar los siguientes datos
- Id
- Contraseña
- Password
- Email
- Telefono
- Usuario de Stream
- Party (grupo) al que esta unido

Rutas para MOSTRAR información de los usuarios<br />
http://localhost:8181/api/usuarios (Para mostrar todos los usuarios)
http://localhost:8181/api/usuarios/usuario/{usuario} (Para mostrar un usuario buscandolo por el user)
http://localhost:8181/api/usuarios/{id} (Para mostrar un usuario buscandolo por la id)
http://localhost:8181/api/usuarios/party/{nombre} (Para mostrar todos los usuarios en una party)

Ruta para AÑADIR un usuario<br />
http://localhost:8181/api/usuarios (Para añadir un usuario con PUT através del body)

Ruta para EDITAR la información de un usuario<br />
http://localhost:8181/api/usuarios/{id} (Con esta ruta podemos editar un usuario con GET através del body) 

Ruta para BORRAR un usuario<br />
http://localhost:8181/api/usuarios/{id} (Con esta ruta podemos borrar un usuario con DELETE) 

─────────────────────────────────────────────────

PARTIES<br />
De las parties podemos consultar o modificar los siguientes datos
- Id
- Nombre
- Juego uqe se esta jugando en esa party

Rutas para MOSTRAR información de las parties<br />
http://localhost:8181/api/parties (Para mostrar todos las parties)
http://localhost:8181/api/parties/nombre/{nombre} (Para mostrar una party buscandola por el nombre)
http://localhost:8181/api/parties/{id} (Para mostrar una party buscandolo por la id)
http://localhost:8181/api//parties/juego/{nombre} (Para mostrar todas las parties en las que se este jugando el juego con el nombre indicado)

Ruta para AÑADIR una party<br />
http://localhost:8181/api/parties (Para añadir una party con PUT através del body)

Ruta para EDITAR la información de una party<br />
http://localhost:8181/api/parties/{id} (Con esta ruta podemos editar una party con PUT através del body) 

Ruta para BORRAR una party<br />
http://localhost:8181/api/parties/{id} (Con esta ruta podemos borrar una party con DELETE) 

─────────────────────────────────────────────────

JUEGOS<br />
De los juegos podemos consultar o modificar los siguientes datos
- Id
- Nombre
- Descripción
- Dificultad

Rutas para MOSTRAR información de los juegos<br />
http://localhost:8181/api/games (Para mostrar todos los juegos)
http://localhost:8181/api/games/nombre/{nombre} (Para mostrar un juego buscandolo por el nombre)
http://localhost:8181/api/games/{id} (Para mostrar un juego buscandolo por la id)

Ruta para AÑADIR un juego<br />
http://localhost:8181/api/juegos (Para añadir un juego con PUT através del body)

Ruta para EDITAR la información de un juego<br />
http://localhost:8181/api/parties/{id} (Con esta ruta podemos editar un juego con GET através del body) 

Ruta para BORRAR un juego<br />
http://localhost:8181/api/games/{id} (Con esta ruta podemos borrar un juego con DELETE) 

─────────────────────────────────────────────────

MENSAJES<br />
De los mensajes podemos consultar o modificar los siguientes datos
- Id
- Texto del mensaje
- Usuario que mando el mensaje

Rutas para MOSTRAR información de los mensajes<br />
http://localhost:8181/api/mensajes (Para mostrar todos los mensajes)
http://localhost:8181/api/mensajes/{id} (Para mostrar un mensaje buscandolo por la id)
http://localhost:8181/api/mensajes/usuario/{username} (Para mostrar todos los mensajes de un usuario)

Ruta para AÑADIR un mensaje<br />
http://localhost:8181/api/mensajes (Para añadir un mensaje con PUT através del body)

Ruta para BORRAR un mensaje<br />
http://localhost:8181/api/games/{id} (Con esta ruta podemos borrar un mensajes con DELETE) 
