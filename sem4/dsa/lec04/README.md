## What I learnt

### Types of datatypes in JAVA

1. Primitive
    1. Byte
    2. Short
    3. int
    4. long
    5. float
    6. double
    7. char
    9. boolean
2. Non Primitive
    1. Linear Data structure
        1. Array
        1. LinkedList
        1. Stack
        1. Queue
    2. Non Linear Data Structure
        1. Tree
        2. Graph
        3. Trie
        4. HashTable

### Abstract Datatypes(used for security)
Datatypes which are abstract e.g List.

### Understanding Time complexity

```
System.out.println("Hello World");
```
O(1)

this will give constant complexity


```
int n = 5;

for(int i = 1; i <= 5; i++){
    System.out.println("Hello");
}
```
O(5)

This has constant complexity, because this has final value 5 which will not change so this will run only in 5 so constant.

```
int n = 8;

for(int i = 1; i <= 5; i *= 2){
    System.out.println("Hello");
}
```

This has log2(n) complexity.

```
int n = 8;

for(int i = 1; i <= 5; i=(int) Math.pow(i,2)){
    System.out.println("Hello");
}
```
This has log(log(n))

```
int n = 2;
int m = 2;
int sum = 0;
int arr = { { 1, 2 }, { 3, 4 } }

for(int i = 0; i < n; i++){
    for(int j = 0; j < m; j++){
        sum += arr[i][j];
    }
}
```
This has O(n * m)
