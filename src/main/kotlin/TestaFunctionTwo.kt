class TestaFunctionTwo {

    //funções de ordem superior
    //depois refatore e simplifique as funções

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val number: Int
            println("Soma")
            number = calculate(1,2,::sum)
            println(number)

            val numberTwo: Int
            println("Divisao")
            numberTwo = calculate(10,2,::division)
            println(numberTwo)

            val numberThree: Int
            println("Subtracao")
            numberThree = calculate(10,9,::subtraction)
            println(numberThree)

            val numberFour: Int
            println("Modulo")
            numberFour = calculate(10,3,::module)
            println(numberFour)
        }

        fun sum(n1: Int, n2: Int):Int {
            val result = n1.plus(n2)
            return result
        }

        fun division(n1: Int, n2: Int): Int {
            val result = n1 / n2
            return result
        }

        fun subtraction(n1: Int, n2: Int): Int {
            val result = n1 - n2
            return result
        }

        fun module(n1: Int, n2: Int): Int {
            val result = n1 % n2
            return result
        }

        fun calculate(n1: Int, n2: Int, operation:(Int, Int)->Int):Int{
            val result = operation(n1, n2)
            return result
        }
    }
}