class TestaFunction {

    private fun getFullName1(firstName:String, lastName:String):String{
        val fullname = "$firstName, $lastName"
        return fullname;
    }

    private fun getFullName2(firstName: String, lastName: String):String{
        return "$firstName, $lastName"
    }

    private fun getFullName3(firstName: String, lastName: String):String { return "$firstName, $lastName"}

    private fun getFullName4(firstName: String, lastName: String):String = "$firstName, $lastName"

    companion object {
        @JvmStatic
        fun main(args: Array<String>){
            var testa = TestaFunction()
            println("Ola " + testa.getFullName4("Alexandro", "Bernardino"))
        }
    }
}