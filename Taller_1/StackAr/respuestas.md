# Taller #1 - Mutation Analysis

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Resultados de generación de mutantes

1. ¿Cuántos mutantes se generaron en total?
   - Respuesta: 70

2. ¿Qué operador de mutación generó más mutantes? ¿Cuántos y por qué?
   - Respuesta: El operador de mutación que más mutantes generó fue NegateConditionsMutator con 9 mutantes.
   Esto debido a que abarca varios casos para aplicar cambios sin importar tanto el contexto. 
   Por ejemplo en el caso de TrueConditionalsMutator, este depende de que el contexto del operador que queremos cambiar sea un If,
   mientras que NegateConditionsMutator cambia todos los condicionales sin importar si están en un If, un While, o si son un valor de retorno, 
   siempre y cuando el condicional tenga un opuesto.

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
     - Mutantes vivos: 48
     - Mutantes muertos: 16
   - **StackTests2**:
     - Mutantes vivos: 34
     - Mutantes muertos: 30

2. ¿Cuál es el mutation score de cada test suite?
   - **StackTests1**: 25%
   - **StackTests2**: 46%

---

## Ejercicio 3: Mejora del test suite

1. ¿Cuál es el mutation score logrado para los tests de StackTests3?
   - Respuesta:

2. ¿Cuántos mutantes vivos y muertos encontraron?
   - Mutantes vivos:
   - Mutantes muertos:

3. Comente cuáles son todos los mutantes vivos que quedaron y por qué son equivalentes al programa original (si no lo fueran, todavía es posible mejorar el mutation score).
   - Respuesta:

4. ¿Cuál es el instruction coverage promedio que lograron para las clases mutadas?
   - Respuesta:

5. ¿Cuál es el peor instruction coverage que lograron para una clase mutada? ¿Por qué creen que sucede esto?
   - Respuesta:
