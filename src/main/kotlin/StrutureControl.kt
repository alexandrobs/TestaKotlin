class StrutureControl {

    companion object {
        @JvmStatic
        fun main(args: Array<String>){

            var a = 4
            var b = 1
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
        }
    }
}