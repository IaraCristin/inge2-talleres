# Taller #2 - Random Testing

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Generación de Tests con Randoop

1. ¿Cuántos casos de test produjo Randoop?
   - Respuesta: 286

2. ¿Hay casos de test que fallan?
   - Respuesta: No, no hay casos que fallen

3. ¿Cuál es el instruction coverage alcanzado por los tests generados para la clase StackAr?
   - Respuesta: 86%

---

## Ejercicio 2: Validación de StackAr y detección de fallas

1. Ejecutar Randoop por 1 minuto sobre StackAr y correr los tests generados:
   - ¿Hay casos de test que fallan? ¿Cuántos?
     - Respuesta: Sí, fallan 135 de 1320 test generados.
   - Si hay tests que fallan, analizar y explicar por qué fallan.
     - Respuesta: Fallan porque los test generados son de situaciones donde el invariante de representación de la clase no se cumple.
2. Reparar StackAr si es necesario, volver a ejecutar Randoop y confirmar que no haya tests fallando.
   - Descripción de las modificaciones realizadas:
     - Respuesta: Modificamos el método pop, porque no actualizaba los valores de elems, o sea no ponía en null la posición de la que acababa de quitar un elemento.

3. Reportar el instruction coverage alcanzado por los últimos casos de tests generados por Randoop para la clase StackAr.
   - Respuesta: 86%

---

## Ejercicio 3: Análisis de Mutantes con Pitest

1. Ejecutar Pitest sobre el último test suite generado por Randoop:
   - ¿Cuántos mutantes construye Pitest? ¿Cuál es el mutation score?
     - Respuesta: Construye 36 mutantes con un mutation score de 78%

2. Extender manualmente el test suite para mejorar el mutation score con Pitest:
   - ¿Cuál es el mejor mutation score que se pudo obtener?
     - Respuesta: 97%
   - Si hay mutantes equivalentes, explicar cuáles son y justificar por qué son equivalentes.
     - Respuesta: 
       - En la linea 96 es lo mismo multiplicar o dividir "prime" por "result", ya que en esa linea "result" es siempre 1, por lo tanto es un mutante equivalente.