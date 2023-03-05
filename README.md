## Tamagochi (Mascota virtual)
#### by Enzo Valverde

1 -Al Ejecutar el Main se crea un Objeto de la clase Tamagochi
con Estado(Contenta) y toma la hora actual como ultimaComida y ultimoJuego

2- El estado de animo (humor) es un atributo tipo ENUM que tiene 4 estados
(CONTENTO, HAMBRIENTO, TRISTE, ABURRIDO)

3- Cuando pasaron mas de 60 seg desde la ultimaComida el estado es Hambriento. Cuando pasaron mas de 30 seg desde el ultimoJuego el estado es Aburrido.  

4- El en Menu principal se puede ver el estado de la mascota(Emoticon) y el nivel y se puede elegir 2 acciones Jugar y Comer

** Cuando una mascota come, pasa lo siguiente:
- Si está hambrienta, se pone contenta.
- Si está contenta, su nivel se incrementa en una unidad.
- Si está aburrida, y hace más de 80 minutos(cambio a 30 seg) que está aburrida, entonces se pone contenta.
- Si está aburrida desde hace 80 minutos(cambio a 30 Seg) o menos, entonces no le pasa nada, no cambia nada.

** Cuando una mascota juega, pasa lo siguiente:
- Si está contenta, su nivel se incrementa en dos unidades.
- Si está aburrida, se pone contenta.
- No produce ningún efecto jugar con la mascota si esta hambrienta.
- Una mascota puede jugar si está contenta o aburrida, si está hambrienta no.

*********
+ En las opciones del Menu debe ser un int entre 1 y 3 (Comer, Jugar, dormir)
+ Dormir finaliza el programa
+ Si el int del Menu es mayor a 3 muestra un estado actual de la mascota comparando el tiempo de ultimaComida y de ultimoJuego con respecto al tiempo actual
+ la entrada del menu es distinto de int se produce un error
*******
+ posibles Mejoras: guardar la mascota en un archivo (puede ser Json)

