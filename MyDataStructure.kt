package com.example.assignment_2.algorithms

class Node(var data: Int) {
    var next: Node? = null
    var prev: Node? = null
}

class MyDataStructure {
    private var head: Node? = null
    private var tail: Node? = null


    fun insert(node: Node) {
        if (head == null) {
            head = node
            tail = node
            tail!!.next = null
            head!!.prev = null
        } else {
            tail!!.next = node
            node.prev = tail
            tail = node
            tail!!.next = null
        }
    }

    fun delete(node: Node) {
        if (head == node) {
            head = null
        }
        if (node.next != null){
            node.next!!.prev = node.prev
        }
        if (node.prev != null){
            node.prev!!.next = node.next
        }
    }
    fun show() {
        var currentNode = head
        if (currentNode == null) {
            println("Linked list is empty")
        } else {
            while (currentNode != null) {
                print(currentNode.data.toString() + " ")
                currentNode = currentNode.next
            }
        }
    }

}