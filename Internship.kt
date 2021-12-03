package com.example.assignment_2.algorithms


class Internship {
    //1.     დაწერეთ ფუნქცია, რომელსაც გადაეცემა ტექსტი  და აბრუნებს პალინდრომია თუ არა.
    // (პალინდრომი არის ტექსტი რომელიც ერთნაირად იკითხება ორივე მხრიდან).
    // Boolean isPalindrome(String text);
    fun isPalindrome(text: String): Boolean = text == text.reversed()

    //2.     გვაქვს 1,5,10,20 და 50 თეთრიანი მონეტები. დაწერეთ ფუნქცია, რომელსაც გადაეცემა თანხა
    // (თეთრებში) და აბრუნებს მონეტების მინიმალურ რაოდენობას, რომლითაც შეგვიძლია ეს თანხა დავახურდაოთ.
    //Int minSplit(Int amount);
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

    //3. მოცემულია მასივი, რომელიც შედგება მთელი რიცხვებისგან. დაწერეთ ფუნქცია რომელსაც გადაეცემა ეს
    // მასივი და აბრუნებს მინიმალურ მთელ რიცხვს, რომელიც 0-ზე მეტია და ამ მასივში არ შედის.
    //Int notContains(Int[] array);
    fun notContains(array: MutableList<Int>): Int {
        if (array.isEmpty()) return 1
        var i = 0
        while (i < array.size) {
            if (array[i] >= 1 && array[i] <= array.size && array[i] != array[array[i] - 1]) {
                val temp = array[i] - 1
                val temp2 = array[i]
                array[i] = array[temp]
                array[temp] = temp2
            } else i += 1
        }
        for (i in 0..array.size)
            if (array[i] != i + 1)
                return i + 1
        return i + 1


    }


    //4.     მოცემულია String რომელიც შედგება „(„ და „)“ ელემენტებისგან. დაწერეთ ფუნქცია
    // რომელიც აბრუნებს ფრჩხილები არის თუ არა მათემატიკურად სწორად დასმული.
    //Boolean isProperly(String sequence);
    //მაგ: (()()) სწორი მიმდევრობაა,  ())() არასწორია
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

    //5.     გვაქვს n სართულიანი კიბე, ერთ მოქმედებაში შეგვიძლია ავიდეთ 1 ან 2 საფეხურით.
    // დაწერეთ ფუნქცია რომელიც დაითვლის n სართულზე ასვლის ვარიანტების რაოდენობას.
    //Int countVariants(Int stearsCount);
    private fun fibonacciNumber(n: Int): Int = when {
        n <= 1 -> n
        else -> fibonacciNumber(n - 1) + fibonacciNumber(n - 2)
    }

    fun countVariants(stearsCount: Int): Int =
        fibonacciNumber(stearsCount + 1)

    //6.     დაწერეთ საკუთარი მონაცემთა სტრუქტურა,
    // რომელიც საშუალებას მოგვცემს O(1) დროში წავშალოთ ელემენტი.
    fun dataStructure(value: Int) {
//        if (!contains(value)) {
//            throw NoSuchElementException()
//        }
//        val index: Int = valueIndexes.get(value)
//        return deleteValue(index)
    }

}

fun main() {
    val array1 = mutableListOf(1 , 2 , 4 , 5 , 6)

    val internship1 = Internship()
    // 1
    //    println("1 - anuki ${internship1.isPalindrome("anuki")}, annnzznnna ${internship1.isPalindrome("annnzznnna")}")
    // 2
    //    println("2 - ${internship1.minSplit(21)}")
    // 3
    //    println("3 - ${internship1.notContains(array1)}")
    // 4
    //    println(
    //        "4 - ())() - ${internship1.isProperly("())()")} " +
    //                "\n    (()()) - ${internship1.isProperly("(()())")} "
    //    )
    // 5
    //    println("5 - ${internship1.countVariants(4)}")
    // 6
    //    println("6 - ${internship1.dataStructure(4)}")
}
