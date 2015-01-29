calleslp
========

Calculadora de calles de La Plata. Dada una determinada dirección de la ciudad (y algunos alrededores), calcula entre qué calles se encuentra. Esto resulta útil porque la nomenclatura de las calles está compuesta únicamente de números, y en la práctica los platenses utilizan este sistema para ubicarse. Por ejemplo: sabiendo que vamos a 7 e/ 56 y 57, y que nos encontramos en 6 y 45, es fácil deducir que estamos a una cuadra en un sentido (desde 6 hasta 7) y a 11 en otro (desde 45 hasta 56).

En el mismo repositorio se encuentran dos versiones del programa: un script en bourne shell y una aplicación para Android.

## Bourne shell
Debería correr sin modificaciones en cualquier sistema POSIX compatible (siendo específicos, en cualquier sistema que tenga una implementación de la shell POSIX). Esto incluye a todos los GNU/Linux, MacOSX, todos los BSD, sistemas embebidos en routers, Windows (si tiene Cygwin instalado), etc. Se trata únicamente del archivo **calleslp**, en la raíz del repositorio.

## Android
Versión en desarrollo, que tiene como principal objetivo que yo aprenda -de a poco- Android. Debería correr en cualquier dispositivo con Android 2.3.3 (API 10) o superior. 
