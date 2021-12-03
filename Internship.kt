package com.example.assignment_2.algorithms

// extension for string - the simplest way to find if string is palindrome
//fun String.isPalindrome(): Boolean = this == this.reversed()

class Internship {
    private val internshipArray = mutableListOf(1 , 5 , 2 , 4 , 5 , -4 , 0 , -1 , 6)

    fun isPalindrome(text: String): Boolean {
        if (text.isEmpty() || text.length == 1) return true
        if (text[0] == text[text.length - 1])
            return isPalindrome(text.substring(1 , text.length - 1))
        return false

    }

    //    also we can use this method but that's not algorithmic approach
    //    fun isPalindrome(text: String): Boolean = text.isPalindrome()

    fun minSplit(amount: Int): Int {
        var amountA = amount
        val coins = listOf(1 , 5 , 10 , 20 , 50)
        val ans = mutableListOf<Int>()
        coins.sorted().reversed().forEach { value ->
            while (amountA >= value) {
                amountA -= value
                ans.add(value)
            }
        }
        return ans.size
    }

    fun notContains(array: MutableList<Int>): Int {
        if (array.isEmpty() || !array.contains(1)) return 1
        else
            array.distinct().sorted().filter { i -> i > 0 }.forEach { value ->
                if (!array.contains(value + 1)) return value + 1
            }
        return 0
    }

    fun isProperly(sequence: String): Boolean {
        val stack = mutableListOf<Char>()
        sequence.forEach { char ->
            if (char == '(') stack.add(char)
            else {
                if (stack.isNotEmpty() && (stack.first() == '(' && char == ')'))
                    stack.removeFirst()
                else return false
            }
        }
        return true
    }

    private fun fibonacciNumber(n: Int): Int = when {
        n <= 1 -> n
        else -> fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
    }

    fun countVariants(stairCount: Int): Int = fibonacciNumber(stairCount + 1)

    fun dataStructure(value: Int): Boolean {
        for (i in internshipArray.indices) {
            if (value == internshipArray[i]) {
                internshipArray.remove(i)
                return true
            }
        }
        return false

    }

}

fun main() {
    val array = mutableListOf(1 , 5 , 2 , 4 , 5 , -4 , 0 , -1 , 6)

    val internship1 = Internship()
    // 1
    println(
        "1 - antennas ${internship1.isPalindrome("antennas")}, " +
                "level ${internship1.isPalindrome("level")}"
    )
    // 2
    println("2 - ${internship1.minSplit(21)}")
    // 3
    println("\n 3 - ${internship1.notContains(array)}")
    // 4
    println(
        "4 - ())() - ${internship1.isProperly("())()")} " +
                "\n    (()()) - ${internship1.isProperly("(()())")} "
    )
    // 5
    println("5 - ${internship1.countVariants(4)}")
    // 6
//    println("6 - ${internship1.dataStructure(4)}")

    val list = MyDataStructure()
    list.insert(12) //12
    list.insertAtStart(191) //191 12 43
    list.insertAt(2 , 2222) //191 12 2222 43
    list.deleteAt(2) //191 12 43
    list.show()
}
