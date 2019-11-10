/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

public class Node<Word, Occurrences extends Comparable<Occurrences>> implements Comparable<Node> {

    Word word;
    Occurrences occurrences;

    public Node( Word word, Occurrences occrrences) {
        this.word = word;
        this.occurrences = occrrences;    
    }

    @Override
    public int compareTo(Node compareNode) {
        if (this.occurrences.getClass().equals(compareNode.occurrences.getClass())) {
            return this.occurrences.compareTo((Occurrences) compareNode.occurrences);
        }
        return -255;
    }

    public Word getKey() {
        return word;
    }
    
    public Occurrences getOccrrences() {
        return occurrences;
    }
}

