# Algorithms Project

A Java-based collection of fundamental algorithms including sorting, selection, and computational geometry implementations.

## Project Structure

Algorithms/ ├── pom.xml ├── src/ │ ├── main/ │ │ ├── java/ │ │ │ ├── Main.java │ │ │ ├── interfaces/ │ │ │ │ ├── Find.java │ │ │ │ ├── Select.java │ │ │ │ └── Sort.java │ │ │ └── usecases/ │ │ │ ├── ClosestPair.java │ │ │ ├── DeterministicSelect.java │ │ │ ├── MergeSort.java │ │ │ └── QuickSort.java │ │ └── resources/ │ └── test/ │ └── java/ │ └── AlgorithmTests.java └── target/

## Implemented Algorithms

### Sorting Algorithms
- **Merge Sort**: Divide-and-conquer sorting algorithm with O(n log n) time complexity
- **Quick Sort**: Efficient sorting algorithm with average O(n log n) time complexity

### Selection Algorithm
- **Deterministic Select**: Algorithm to find the k-th smallest element in an array

### Computational Geometry
- **Closest Pair**: Algorithm to find the minimum distance between any two points in a 2D plane

## Interfaces

The project uses a clean architecture with interfaces:
- `Sort`: Interface for sorting algorithms
- `Select`: Interface for selection algorithms  
- `Find`: Interface for search/find algorithms

