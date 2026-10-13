# Sistema de Pulsera Inteligente

## Descripción

Este proyecto consiste en un sistema que simula el funcionamiento de una pulsera inteligente para registrar los pasos diarios de un usuario. Permite acumular los pasos realizados, controlar el cumplimiento de una meta diaria y otorgar insignias como recompensa cuando se alcanza el objetivo.

El sistema utiliza dos clases principales: `PerfilUsuario` y `PulseraInteligente`, que trabajan en conjunto para registrar la actividad física y almacenar los logros del usuario.

## Funcionamiento

1. Se crea el perfil de la usuaria Lucía.
2. Se configura una pulsera inteligente con una meta diaria de 10.000 pasos.
3. Se registran diferentes cantidades de pasos durante el día.
4. La pulsera actualiza el contador diario y el total histórico del perfil.
5. Cuando Lucía alcanza o supera los 10.000 pasos, la pulsera informa que se cumplió la meta y otorga la insignia `"Caminante Diario"`.
6. Si se registran más pasos después de alcanzar la meta, no se repite la notificación durante ese día.
7. Al finalizar, se muestran el nombre de la usuaria, los pasos acumulados y las insignias obtenidas.

## Clase `PerfilUsuario`

Representa el perfil de un usuario y almacena su información y sus logros.

### Atributos

* `nombre`: nombre del usuario.
* `pasosAcumulados`: cantidad total de pasos registrados históricamente.
* `insigniasObtenidas`: lista de insignias conseguidas.

### Métodos principales

* `getNombre()`: devuelve el nombre del usuario.
* `getPasosAcumulados()`: devuelve el total histórico de pasos.
* `getInsigniasObtenidas()`: devuelve la lista de insignias obtenidas.
* `sumarPasos(int cantidad)`: incrementa el total histórico de pasos.
* `otorgarInsignia(String nombreInsignia)`: agrega una insignia si el usuario todavía no la tiene. Utiliza `contains()` para evitar duplicados.

## Clase `PulseraInteligente`

Representa una pulsera que registra los pasos diarios y controla el cumplimiento de una meta.

### Atributos

* `perfil`: referencia al perfil del usuario asociado.
* `metaDiaria`: cantidad de pasos necesaria para cumplir el objetivo diario.
* `pasosDelDia`: cantidad de pasos registrados durante el día actual.
* `metaNotificada`: indica si ya se notificó el cumplimiento de la meta durante ese día.

### Métodos principales

* `registrarPasos(int cantidad)`: valida la cantidad ingresada, actualiza los pasos diarios y los acumulados, e informa el progreso.
* Cuando se alcanza la meta, muestra una notificación y solicita al perfil que otorgue la insignia `"Caminante Diario"`.
* `reiniciarDia()`: reinicia el contador diario y permite que la meta vuelva a notificarse durante el nuevo día.

La pulsera mantiene separados los pasos diarios de los pasos acumulados. De esta manera, el contador diario puede reiniciarse sin perder el historial del usuario.

## Ejemplo de funcionamiento

La usuaria Lucía tiene una meta diaria de 10.000 pasos.

| Registro | Pasos agregados | Total del día |
| -------- | --------------: | ------------: |
| Primero  |           4.000 |         4.000 |
| Segundo  |           3.500 |         7.500 |
| Tercero  |           5.000 |        12.500 |
| Cuarto   |           1.000 |        13.500 |

Al registrar los terceros 5.000 pasos, Lucía supera la meta diaria y obtiene la insignia `"Caminante Diario"`.

El último registro incrementa el total, pero no vuelve a mostrar la notificación de la meta.

**Estado final del perfil:**

* Usuario: Lucía.
* Pasos acumulados: 13.500.
* Insignias obtenidas: Caminante Diario.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** utilización de clases y objetos para representar el perfil y la pulsera.
* **Encapsulamiento:** atributos privados y métodos públicos para acceder y modificar la información.
* **Asociación entre clases:** la pulsera mantiene una referencia a un objeto `PerfilUsuario`.
* **Colecciones:** uso de `ArrayList` y `List` para almacenar las insignias.
* **Condicionales `if`:** validación de pasos y detección del cumplimiento de la meta.
* **Método `contains()`:** comprobación de la existencia de una insignia para evitar duplicados.
* **Variable booleana:** `metaNotificada` evita que se repita el aviso durante el mismo día.
* **Separación de responsabilidades:** la pulsera controla la actividad diaria y el perfil administra los pasos acumulados y las insignias.

## Tecnologías utilizadas

* Lenguaje: Java.
* Entorno de desarrollo recomendado: IntelliJ IDEA.

## Ejecución

<img width="507" height="321" alt="image" src="https://github.com/user-attachments/assets/128f6ca7-d278-4ee3-b131-d49b8c0814df" />
