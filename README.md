# Unexpected removeIf Behavior in Kotlin Mutable Maps

This repository demonstrates a subtle but important difference in the behavior of the `removeIf` function when used with different Kotlin collection types (Lists, Sets, and Maps).

While `removeIf` works as expected with `MutableList` and `MutableSet`, removing elements based on a condition, its behavior with `MutableMap` might be unexpected for those unfamiliar with its implementation.

The `bug.kt` file showcases this behavior. The `bugSolution.kt` file offers a solution on how to modify the code to remove elements based on values in the map.

## How to Reproduce

1. Clone the repository.
2. Open `bug.kt`.
3. Run the code.  Observe the different outputs for the List, Set, and Map.

## Solution

The solution is provided in `bugSolution.kt`. It uses a different approach using `filter` and `toMap()` to achieve the desired outcome.
