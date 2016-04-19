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
public class EmptyQueueException extends RuntimeException {
    public EmptyQueueException(){
        this("Queue is empty");
    }
    public EmptyQueueException(String message){
        super(message);
    }
}
