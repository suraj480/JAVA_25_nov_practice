# lambda expression is implementation of single abstract method
# Predicate
boolean test(T t);
             (T t)->{retrun true/false}
# Function
     R apply(T t)
                (T t)->{retrun R;}

# Consumer
         void accept(T t);
                     (T t)->{...}                 

# Stream
stream is used to process data in the collection.A strem pipeline consists of a source, followed by zero or more intermidiate operations; and a terminal operation.

.Stream source
->Streams can be creared from Collection, List ,Set, Arrays, lines of file
.Stream operations are either intermidiate or terminal.
.intermidiate operations returns a stream ,so that we can chain multiple intermidiate operations
.Terminal operations return either void or non-stream result.

## Intermediate operations
1.Zero or more intermediate operaions allowed.
2.Order matters for large darasets. Filter first and then map or sort etc.
3.For very large datasets use parallel streams to enable multiple threads.


colection array        filter      transformation     distinct     sorting

Source----Stream-------->op1-----------op2------------>op3----------op4-----terminal operation

