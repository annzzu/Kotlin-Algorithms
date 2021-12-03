package com.example.assignment_2.algorithms

class Node(var data: Int) {
    var next: Node? = null
}

class MyDataStructure {
    var head: Node? = null

    //function to add an element to the list at the end if there are element already and at the start if no elements are there
    fun insert(data: Int) {
        val newNode = Node(data)
        if (head == null) {
            head = newNode
        } else {
            var n = head
            while (n!!.next != null) {
                n = n.next
            }
            n.next = newNode
        }
    }

    //function to delete an element at the given index
    fun deleteAt(index: Int) {
        if (index == 0) {
            head = head!!.next
        } else {
            var currentNode = head
            for (i in 0 until index - 1) {
                currentNode = currentNode!!.next
            }
            currentNode!!.next = currentNode.next!!.next
        }
    }

    //function to show the list
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