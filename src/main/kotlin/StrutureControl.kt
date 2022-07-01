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

            val year = 1986.. 2022
            //val year = 2022
            when(year){
                -4000.. 475 ->
                    println("antiguidade")
                476..1452 ->
                    println("medieval")
                1453..1789 ->
                    println("moderna")
                1900.. 2022 ->
                    println("contemporaneo")
                else ->
                    println("fora do tempo")
            }

            val grade = (0..10).random()
            println(grade.getStudentStatus())



            //elvis operator
            var numA:Int? = null
            var numB:Int? = 1
            var numC:Int? = numA?: numB?: 0
            println(numC)
        }

        fun Int.getStudentStatus():String{
            println("nota $this")
            return when(this){
                in 0..4 -> "Reprovado"
                in 5..7 -> "Media"
                in 7..9 -> "Bom"
                10 -> "Excelente"
                else -> "Indefinido"
            }
        }
    }
}