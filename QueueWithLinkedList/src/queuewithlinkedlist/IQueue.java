/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queuewithlinkedlist;

public interface IQueue {

    public void enqueue(int measurement);

    public int dequeue();

    public int size();
}


