class TestaFunction {

    //introdução a funções em kotlin, simplificando funções

//    private fun getFullName(firstName:String, lastName:String):String{
//        val fullname = "$firstName, $lastName"
//        return fullname;
//    }
//
//    private fun getFullName(firstName: String, lastName: String):String{
//        return "$firstName, $lastName"
//    }
//
//    private fun getFullName(firstName: String, lastName: String):String { return "$firstName, $lastName"}

    private fun getFullName(firstName: String, lastName: String):String = "$firstName, $lastName"

    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            var testa = TestaFunction()
            println("Ola " + testa.getFullName("Alexandro", "Bernardino"))
        }
    }
}