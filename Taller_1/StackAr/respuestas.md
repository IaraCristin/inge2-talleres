# Taller #1 - Mutation Analysis

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Resultados de generación de mutantes

1. ¿Cuántos mutantes se generaron en total?
   - Respuesta: 76

2. ¿Qué operador de mutación generó más mutantes? ¿Cuántos y por qué?
   - Respuesta: Los operadores de mutación que más mutantes generaron fueron TrueConditionalMutators y FalseConditionalMutators con 10 mutantes cada uno.
   Esto debido a que estos mutantes pueden modificar todas las guardas presentes en el codigo (que en el caso de StackAr son 10), y que en ningun caso la aplicación de la mutación lleva a un codigo identico al que teniamos, es decir, reemplazar "true" por "true" o "false" por "false".
   

3. ¿Qué operador de mutación generó menos mutantes? ¿Cuántos y por qué?
   - Respuesta: En este caso es un empate entre EmptyReturnsMutator, IncrementsMutator y ConditionalsBoundaryMutator con 3 mutantes cada uno.
   En el caso de EmptyReturnsMutator, solo cambia valores de retorno, lo cual limita mucho los cambios que puede producir en un código, ya que se limita directamente al número de funciones presentes.
   A eso hay que agregarle que únicamente cambia aquellos valores de tipo String o int, lo cual limita aún más los mutantes que pueda generar.
   En el caso de IncrementsMutator, también son muy limitados los casos donde produce cambios porque solo reemplaza los operadores de incremento y decremento de variables locales, o sea en operadores unarios.
   Particularmente en el código que queremos modificar no hay tantas instancias de operaciones unarias por lo que no se pueden generar muchos mutantes.
   Y por último, en el caso de ConditionalsBoundaryMutator, si bien es similar a NegateConditionsMutator en que cambia cualquier condicional sin importar su contexto,
   los casos donde aplica cambios son menos, y en particular en el código que queremos mutar no aparecen tanto estos casos.

---

## Ejercicio 2: Evaluación de test suites

1. ¿Cuántos mutantes vivos y muertos encontraron cada uno de los test suites?
   - **StackTests1**:
     - Mutantes vivos: 56
     - Mutantes muertos: 20
   - **StackTests2**:
     - Mutantes vivos: 38
     - Mutantes muertos: 38

2. ¿Cuál es el mutation score de cada test suite?
   - **StackTests1**: 26%
   - **StackTests2**: 50%

---

## Ejercicio 3: Mejora del test suite

1. ¿Cuál es el mutation score logrado para los tests de StackTests3?
   - Respuesta: 96%

2. ¿Cuántos mutantes vivos y muertos encontraron?
   - Mutantes vivos: 3
   - Mutantes muertos: 73

3. Comente cuáles son todos los mutantes vivos que quedaron y por qué son equivalentes al programa original (si no lo fueran, todavía es posible mejorar el mutation score).
   - Respuesta:
      - StackArMutated2084 (FalseConditionalsMutator: Se reemplazó this == obj por false en la línea 72.): se trata de un mutante equivalente. Al querer comparar un stack consigo mismo y poner dicha guarda en false, se saltea el paso de chequear si es el mismo stack en memoria. Pero luego, al poseer los mismos elementos, el metodo igual sigue respondiendo de la misma manera. 
      - StackArMutated1357 (FalseConditionalsMutator: Se reemplazó isEmpty() por false en la línea 45.): en este caso se esperar que se pueda realizar un pop de un stack vacio sin hacer saltar la exception programada en el metodo pop. Pero el metodo pop a su vez llama al metodo top que tiene la misma condicion (esta vez, sin modificar por el mutante), que hace que salte la misma excepcion. Por lo tanto, a pesar de la modificacion del mutante, como la condicion que hace saltar la excepcion se chequea dos veces, esta siempre salta.
      - StackArMutated4625 (MathMutator: Se reemplazó * por / en la línea 65.): se trata de un mutante equivalente, ya que se cambia una multiplicación por 1 (el valor de result), por una division por 1.
4. ¿Cuál es el instruction coverage promedio que lograron para las clases mutadas?
   - Respuesta: 61%

5. ¿Cuál es el peor instruction coverage que lograron para una clase mutada? ¿Por qué creen que sucede esto?
   - Respuesta: 5% 
   Esto sucede porque el test determina que debe matar al mutante muy rápidamente, por lo que no necesita ejecutar demasiadas instrucciones.
