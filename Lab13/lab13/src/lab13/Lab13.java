/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author Kevin Brenneman
 */
public class Lab13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates neq queues
       Queue<Double> doubleQueue = new Queue<>(); 
       Queue<Integer> intQueue = new Queue<>();
       Queue<String> stringQueue = new Queue<>();
       
       
       //test the queue with doubles
       doubleQueue.enqueue(1.0);
       doubleQueue.enqueue(2.0);
       doubleQueue.printContents();
       //try catch for dequeueing
        try {
            double test = 0;
            for(int i =0; i <3; i++){
                test = doubleQueue.dequeue();
                System.out.printf("%.2f dequeued ", test);
            }
        }
       catch(EmptyQueueException emptyQueueException){
           System.out.println("Queue Empty");
       }
        //try catch for printing
        try{
       doubleQueue.printContents();
        }
        catch(EmptyQueueException emptyQueueException){
            System.out.println("Queue Empty");
           
        }
       doubleQueue.enqueue(3.0);
       doubleQueue.enqueue(4.0);
       doubleQueue.printContents();
       System.out.printf("Front element %s \n\n",doubleQueue.front().toString());
      
       
       //test queue with integers
       intQueue.enqueue(1);
       intQueue.enqueue(2);
       intQueue.printContents();
       //try catch for dequeueing
        try {
            int test = 0;
            for(int i =0; i <3; i++){
                test = intQueue.dequeue();
                System.out.printf("%d dequeued ", test);
            }
        }
       catch(EmptyQueueException emptyQueueException){
           System.out.println("Queue Empty");
       }
        //try catch for printing
        try{
       intQueue.printContents();
        }
        catch(EmptyQueueException emptyQueueException){
            System.out.println("Queue Empty");
           
        }
       intQueue.enqueue(3);
       intQueue.enqueue(4);
       intQueue.printContents();
       System.out.printf("Front element %s \n",intQueue.front().toString());
       
       
       //try queue with strings
       stringQueue.enqueue("One");
       stringQueue.enqueue("Two");
       stringQueue.printContents();
       //try catch for dequeueing
        try {
            String test = null;
            for(int i =0; i <3; i++){
                test = stringQueue.dequeue();
                System.out.printf("%s dequeued ", test);
            }
        }
       catch(EmptyQueueException emptyQueueException){
           System.out.println("Queue Empty");
       }
        //try catch for printing
        try{
       stringQueue.printContents();
        }
        catch(EmptyQueueException emptyQueueException){
            System.out.println("Queue Empty");
           
        }
       stringQueue.enqueue("Three");
       stringQueue.enqueue("Four");
       stringQueue.printContents();
       System.out.printf("Front element %s \n",stringQueue.front());
       
    }
    
}
