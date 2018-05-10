>Disclaimer el nombre del repo debería ser fee en lugar de feeds! 

# Cargos

El seller vende su producto luego recibimos una notificación para crear un cargo por venta de producto (Item, Shipping) el fee a cobrar es del % 3,5 del monto de la operación (venta).

El objetivo es saber cuanto debemos cobrarle al seller.

## Casos de uso o cambios de requerimiento
1. El fee se puede calcular por item para ciertos venderoes.
2. El fee dependerá del volumen de productos que venda el vendedor. Si el vendedor vende 2 productos, se le cobra fee por la orden más cara.
3. Finde largo baja el fee de las dos primeras ventas: %5 la primera y %10 la segunda.

## Fase 1 - DONE

Modelar el problema anterior desde la perspectiva de [DDD](https://en.wikipedia.org/wiki/Domain-driven_design)

## Fase 2 

Analizar como impactan los siguientes cambios de requerimiento a los efectos de saber si el problema es representativo.

Posibles cambios de requerimiento:

1. WIP - Dos ventas del seller en n horas => el fee de cada venta %5  

@alvaro: Herramienta para manejo de fechas.

@marcelo: generación de infraestructura para la fase3

## Fase 3

Sumar infraestructura para poder escribir las pruebas del servidor HTTP.

