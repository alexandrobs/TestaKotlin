class StructureRepetition {

    companion object {
        @JvmStatic
        fun main(array: Array<String>){
            println("Estruturas de repeticao")

            for ( i in 0..20){
                println(i)
            }

            println("-------------------------")

            for ( i in 0..20 step 2){
                println(i)
            }

            println("-------------------------")

            for (i in 0 until 10){
                println(i)
            }

            println("-------------------------")

            for(i in 10 downTo 0){
                println(i)
            }

            println("-------------------------")

            var text = "Kotlin"

            for (letter in text){
                println(letter)
            }
        }
    }
}