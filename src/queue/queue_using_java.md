# Queue using Array in JAVA:

Initializing few variables:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/b675c9da-2ed2-4038-80f5-e28dbc7a6df4)

- In a queue, the rear is always -1.


We create a constructor for initializing size of our queue:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/79342a8e-739d-4bef-b9b6-62fb8dfbf4c9)


Now, we will check if our queue is EMPTY or not:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/6c159ee0-5740-4f81-ba46-09a165c6f1ac)

Adding elements into the queue:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/f40e5772-9ecf-4a88-af82-b3963b855e43)

- if the rear is equals to MAX_SIZE - 1, then our queue is full
- otherwise, we will increment our rear and add the element n into the queue.

Removing elements from the queue:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/25e75009-7b11-487d-8909-040b93f308d9)

- the loop is used to shift our elements in the queue after removing an element from the front.
