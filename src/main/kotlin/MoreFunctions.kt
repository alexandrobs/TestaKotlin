class MoreFunctions {

    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            //chamando a funcao
            println(generateAnswerString(11))
            val stringLength: Int = stringFuncLenght("AndroidX")
            println(stringLength)
        }

        //passando funcao sem parametro
//        fun generateAnswerString():String {
//            var count:Int = 42
//            val answerString = if (count == 42) {
//                "I have the answer."
//            } else {
//                "The answer eludes me"
//            }
//
//            return answerString
//        }
        //passando parametro na funcao
//        fun generateAnswerString(count:Int):String {
//            val answerString = if (count == 42) {
//                "I have the answer."
//            } else {
//                "The answer eludes me"
//            }
//
//            return answerString
//        }
        //exemplo de uma funcao que depois sera simplificada
//        var count:Int = 10
//        fun generateAnswerString(countThreshold: Int):String {
//            return if (count > countThreshold) {
//                "I have the answer."
//            } else {
//                "The answer eludes me"
//            }
//        }
        //versao simplificada da mesma funcao
        var count:Int = 10
        fun generateAnswerString(countThreshold: Int):String = if (count > countThreshold) {
                "I have the answer."
            } else {
                "The answer eludes me"
            }

        //funcoes anonimas
        val stringFuncLenght: (String) -> Int = {input ->
            input.length
        }

    }
}