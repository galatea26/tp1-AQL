# TP1 — Bugs & Corrections
#Nom :Benmahammed Radia

## Exercice 1 — Palindrome
Bug: `j++` et `i--` inversés → `StringIndexOutOfBoundsException`
Correction : `i++` et `j--`

## Exercice 2 — Anagram
Bug: `i <= s1.length()` → `StringIndexOutOfBoundsException`
Correction : `i < s1.length()`

## Exercice 3 — BinarySearch
Bug : `low < high` → l'élément à l'indice `high` n'est jamais trouvé
Correction : `low <= high`
Remarque: `array[mid] <= element` devrait être `array[mid] < element`

## Exercice 4 — QuadraticEquation
Remarque 1 : `delta == 0` risqué avec des `double`, préférer `Math.abs(delta) < 1e-10`
Remarque 2 : retourner `new double[0]` plutôt que `null` est plus sûr
Note : Branch Coverage ≡ Condition Coverage (mêmes tests utilisés)

## Exercice 5 — RomanNumeral
Bug 1 : `i <= symbols.length` → `ArrayIndexOutOfBoundsException`
Bug 2: `n > values[i]` → boucle infinie pour valeurs exactes (ex: 1000)
Correction : `i < symbols.length` et `n >= values[i]`

## Exercice 6 — FizzBuzz
Bug: `n <= 1` → `fizzBuzz(1)` lève une exception au lieu de retourner `"1"`
Correction : `n <= 0`
Note: Branch Coverage ≡ Condition Coverage (mêmes tests utilisés)