/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

import java.util.ArrayList;

/**
 *
 * @author Kevin Brenneman
 */
public class Queue <T> {
    
    private final ArrayList <T> elements;
    
    public Queue(){
        this(10);
    }
    
    public Queue(int capacity){
        int initCapacity = capacity > 0 ? capacity : 10; //ensure this is greater than 0
        elements = new ArrayList<T>(initCapacity);
    }
    
    public void enqueue(T object){
        elements.add(0, object);
    }
    
    public T dequeue() {
        if (elements.isEmpty()) {
            throw new EmptyQueueException("Queue is empty, cannot dequeue");
        }
        return elements.remove(0);
    }
    public int size(){
        return elements.size();
    }
    
    public boolean isEmpty(){
        return elements.isEmpty();
    }
    
    public T front(){
        if (elements.isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        return elements.get(0); 
    }
    
    //custom function to print out the contents of the queue
    public void printContents(){
        if (elements.isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        }
        System.out.printf("Queue contents: ");
        for(int i = 0; i < elements.size();i++){
            System.out.printf("%s ",elements.get(i).toString());
        }
        System.out.println();
    }
            
    
}
