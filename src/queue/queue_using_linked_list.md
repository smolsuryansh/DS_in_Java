# Queue using Linked list in JAVA:

Storing our data and create a constructor: 

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/b5c73317-ce9d-49c8-9c74-9b9a4ebaba37)

- the head and tail equals to null since they both have no elements in the nodes in the beginning.

Empty condition:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/74d10618-f8a0-4b42-9b5e-e95a596918d5)

- the queue will be empty when both the head and tail will be null.


Adding into the queue:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/03fe5e1f-0e2a-4766-b4ef-ea0dc135fdce)

- elements will be added to our tail as a new node.
- but if we are adding our first element then, tail == null, in that case tail = head = newNode;


Removing from the queue:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/52a450a0-d3da-47ce-a750-92c53f55ad47)

- if there is only one element in the queue, that means head == tail, after removing the element tail = null.
- otherwise, we will remove from the front, front = head.data.
- and make the next element the next head, head = head.next.


Peeking:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/2888c421-0b55-4945-a674-60643770d964)

- same as queue using arrays, we will just make it return head.data.
