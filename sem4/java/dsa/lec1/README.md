### What I Leaned

    - Functional Interface = There are those type of interface in which there is only one method.
    - Lembda Operator = By which we can access the methods of FunctionalInterface without implements.
        - Introduced to make JAVA little bit Functinal like C and Python languages.
    - Generics = Give the custom data types inside from outside the definition.
        - Type security
        - Dynamic Data types

        
        `
            interface GetValue<T, R>{
                R run ( T n);
            }
        `
        In this code the T is Type of the parameters and R is the return type we can specity the T and R while making reference variable of the Interfaace
        `
            GetValue<Int, Double> obj = new ChildClass();
        `
        Here Int is T and Double is R so specified at this line.
        
    - Theory of collection frameworks.
        - Collections[I]
            - List[I]
                - ArrayList[C]
                - LinkedList[C]
            - Set[I]
                - HashSet[C]
                - LinkedHashSet[C]
                - SortedSet[I]
                    - NavigationSet[I]
                        - TreeSet[C]
            - Queue[I]
                - PriorityQueue[C]
                - Blocking[I]
                    - PriorityBlockingQueue[C]
                    - LinkedBlockingQueue[C]
                
