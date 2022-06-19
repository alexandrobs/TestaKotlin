import java.util.*

class Testa {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //Formatação de Strings

            val name = "alex"
            val nameTwo = "ALEX"
            //ao invés de capitalize, replaceFirstChar
            println("primeira letra maiuscula: ${name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}")
            //ao invés de toUpperCase, uppercase
            println("todas letras maiusculas: ${name.uppercase(Locale.getDefault())}")
            //ao invés de toLowerCase, lowercase
            println("todas letras minusculas: ${nameTwo.lowercase(Locale.getDefault())}")
            //ao invés de decapitalize, replaceFirstChar
            println("primeira letra minuscula: ${nameTwo.replaceFirstChar { it.lowercase(Locale.getDefault()) }}")

            println("----------------------------------------------")

            val nameCompleted = " Alexandro Bernardino da Silva  "
            println(nameCompleted)
            //remoção de espaços no começo e no final da string
            println(nameCompleted.trim())

            println(nameCompleted.trimEnd())

            println(nameCompleted.trimStart())

            println("----------------------------------------------")

            val nameFemale = "Maria"
            val nameMale = "Joao"
            println("nameFemale: ${nameFemale.replace('M', 'J')}")
            println("nameFemaleReplace: ${nameFemale.replace(nameFemale, nameMale)}")

            println("---------------------------------------------")
            val price = 23.44000000
            val myStr = String.format("Preco em reais: %.2f", price)
            println(myStr)

        }
    }
}