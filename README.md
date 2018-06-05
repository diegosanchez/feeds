# Cargos

El seller vende su producto luego recibimos una notificación para crear un cargo por venta de producto (Item, Shipping) el fee a cobrar es del % 3,5 del monto de la operación (venta).

El objetivo es saber cuanto debemos cobrarle al seller en las siguientes situaciones:

1. El vendedor vendió una Item 100 con Shipping 100 y el cargo es sobre item + shipping. 
2. El vendedor vendió una Item de más de 1000 pesos y el cargo es %2 sobre item.
3. El vendedor vendió durante el black friday y el cargo de la primera unidad es % 5 del fee (%3.5), de la segunda unidad % 10 del fee, etc.

Buscamos evaluar cuales son los resultados de aplicar TDD vs Testing relevando ventajas e impedimentos impuestos por ambas técnicas.

























































































###### Cambio req

>> - El vendedor vendió un item cuyo precio es mayor a 1000 y el cargo es del %2.
>> - El vendedor vendió n items y el cargo se calcula sobre el % 95 de la orden.  
>> - El vendedor vendió 2 productos, se le cobra fee por la orden más cara.
