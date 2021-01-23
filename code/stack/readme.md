

# Get min from stack at any point in O(1)

## very interesting logic by manipulating data in stack 

only works in case of integers.

current code works with positive integers.( but can be imporved to work on neg integers)

Q: Why use composition in this?
 - composition is simpler
 - we are not extending stack Class as our implementation does not support each and every scenario where stack can be used.
 - other reason is that stack<T> is for generic template. but not such in our case.
