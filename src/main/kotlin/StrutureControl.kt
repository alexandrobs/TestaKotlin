class StrutureControl {

    companion object {
        @JvmStatic
        fun main(args: Array<String>){

            var a = 5
            var b = 5
            var c = 3

            //if, else
            if(a > b){
                println("a e > b")
            }else{
                println("a e < b")
            }

            //if, else if, else
            if (a > b){
                println("a e > b")
            }else if(a > c){
                println("a e > c")
            }else{
                println("a e < que b e c")
            }

            //when
            when{
                a > b -> {
                    println("a > b")
                }
                a > c -> {
                    println("a > c")
                }
                else -> {
                    println("a < b e c")
                }
            }

            //elvis operator
            var numberX: Int? = null
            var numberY = numberX ?: 0
            println("numberX: " + numberX)
            println("numberY: " + numberY)

            //atribuicao
            println("valores de a $a e b $b")
            val maxValue = if (a > b) a else if (a < b) b else b
            println("maxValue $maxValue")

            println("valores de a $a e b $b")

            val minValue = if (a > b) { println("b ($b) e o menor valor")
                b
            } else if (a < b) { println("a ($a) e o menor valor")
                a
            } else {
                println("os valores sao iguais")
                b
            }
            println(minValue)

            //when atribuindo
            when {
                a > b -> {
                    println("a e > b")
                }
                a != b && a > c -> {
                    println("a e diferente b e a e > c")
                }
                b == 0 -> {
                    println("b e igual a 0")
                }
                else -> {
                    println("outra saida qualquer")
                }
            }

        }
    }
}