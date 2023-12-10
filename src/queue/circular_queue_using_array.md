# Circular queue using array in JAVA:

- Important formula: (rear + 1) % MAX_SIZE;      // To add into queue

Same as Queue using array but to check whether its full or not, the following code is added:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/b21ac088-0741-4bbf-a0c4-2c6ca88463fd)


To add elements into the circular queue:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/f76698ae-fa2f-4d52-8422-d3ef880b46c2)

- rear = (rear + 1) % MAX_SIZE;  is used to increase rear

- and, if(front == -1){ front = 0 } is used to increase front along with rear

We dont have to move our elements in a circular queue, therefor the code to remove is: 

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/2cb27cff-7875-4325-a7e6-f0a824e8b3fa)

- the if statement works to check whether there is only A SINGLE ELEMENT present in the queue, if true it will remove the element and then front and rear will be equal to -1.
- 
- otherwise, the else statement will change the front by using the formula: front = (front + 1) % MAX_SIZE;


Now, peeking is same as queue using array:

![image](https://github.com/smolsuryansh/DS_in_Java/assets/144353958/db791d02-e161-4e3e-a227-63097c590c1b)

- only we will return array[front]; to see what in the front.
