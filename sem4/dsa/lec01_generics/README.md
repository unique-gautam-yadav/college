### What I Leaned

1. Functional Interface = There are those type of interface in which there is only one method.
2. Lembda Operator = By which we can access the methods of FunctionalInterface without implements.
    a. Introduced to make JAVA little bit Functinal like C and Python languages.
3. Generics = Give the custom data types inside from outside the definition.
     a. Type security
     b. Dynamic Data types
   
       interface GetValue<T, R>{
            R run ( T n);
       }
   
In this code the T is Type of the parameters and R is the return type we can specity the T and R while making reference variable of the Interfaace

    GetValue<Int, Double> obj = new ChildClass();
        
Here Int is T and Double is R so specified at this line.
        
4. Theory of collection frameworks.
5. Collections [I]
       i. List[I]
           1. ArrayList[C]
           2. LinkedList[C]
       ii. Set[I]
           1. HashSet[C]
           2. LinkedHashSet[C]
           3. SortedSet[I]
                a. NavigationSet[I]
                        i. TreeSet[C]
       iii. Queue[I]
            1. PriorityQueue[C]
             2. Blocking[I]
                   a. PriorityBlockingQueue[C]
                   b. LinkedBlockingQueue[C]
