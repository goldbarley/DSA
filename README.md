# Data structures and Algorithms

This repository is a collection of various data structures and their implementation along with important algorithms which can be really useful while solving problems.

## Installation
If you dont already have [Git](https://en.wikipedia.org/wiki/Git) installed, you can do so [here](https://git-scm.com/downloads).

To clone this repository, you can run the following command in `bash`, `PowerShell`, or `Command Prompt`
```bash
git clone https://github.com/goldbarley/DSA.git
```

## Usage
All algorithms are segregated in different packages, these packages help it easier to navigate through the project.

To import a package into your main file, you add the following import statement to the top of your Java code:
```java
import pkg_dir.file_name;

// Or alternatively

import pkg_dir.*;
// * is a wildcard operator which will include all the files present in the "pkg_dir"
```
**Some important things to keep in mind:**
1. For *generic classes*, while creating an object of the class, you will need to mention the datatype that is supposed to be used, it's a good practice, else you can store any value of any data type within those data structures, which *sometimes* may lead to unwanted behaviours. 
2. `Graph.java` in package `dataStructs` will generate a random graph for a given number of nodes and uses an *adjacency matrix*.
3. `Strings.java` and `Integers.java` in package `recursion` includes some extra strings and integer functionality. *Note: that recursion might not be the best method to solve the required problems within the `Strings.java` and `Integers.java` file, but it is to better understand the concept of recursion which some pople might find confusing, I have written the functions in these classes recursively.*

## Time and space complexities
**Time complexity** measures how the execution time of an algorithm changes with the size of the input, often expressed in Big O notation (e.g., O(n), O(log n)). If an algorithm runs in constant time, no matter the size of the input, it is denoted as O(1).

**Space complexity** measures how the memory usage of an algorithm changes with the input size, also expressed in Big O notation. Both complexities help in evaluating the efficiency and scalability of algorithms.

The following table contains the time complexities of commonly used algorithms (mostly ones that are included in the repository):

|Algorithm|Upper-bound time complexity|Average time complexity|Space complexity|
|:-------:|:-------------------------:|:-------------------------:|:--------------:|
|Bubble sort|O(n<sup>2</sup>)|O(n<sup>2</sup>)|O(1)|
|Insertion sort|O(n<sup>2</sup>)|O(n<sup>2</sup>)|O(1)|
|Merge sort|O(n log n)|O(n log n)|O(n)|
|Quick sort|O(n<sup>2</sup>)|O(n log n)|O(log n)|
|Selection sort|O(n<sup>2</sup>)|O(n<sup>2</sup>)|O(1)|
|Binary search|O(log n)|O(log n)|O(1)|
|Interpolation search|O(n)|O(log log n)|O(1)|
|Linear search|O(n)|O(n)|O(1)|

## Socials
- [Discord](https://discord.com/) : goldbarley
- [X](https://x.com/) : @nilabhr0
- [YouTube](https://www.youtube.com/) : @goldbarley44