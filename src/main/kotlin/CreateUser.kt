class CreateUser {
    val miLista = listOf(
        "Pedro Luis",
        "Juan Manuel",
        "Juan Luis",
        "María Inés",
        "Romeo",
        "Ernesto",
        "Juan Pedro",
        "Ariadna",
        "Mireya María",
        "Ana Sofía",
        "José Juan")

    val miListaFloat= listOf<Float>(
        10f,10f,10f,10f,10f,10f,10f,10f,10f,10f
    )



    fun validInput(lista: List<String>): Int {
        var validOpt = false
        var opt: Int = -1

        while(!validOpt) {
            println("Ingrese el numero correspondiente a la opcion que desea elegir:\n")

            for ((index, value) in lista.withIndex()) {
                println("$index: $value")
            }

            val input = readLine()

            if (input == null || input == ""){
                println("Entro una opcion no valida")
                continue
            } else {
                opt = input.toInt()
            }

            if (opt >= 0 && opt < lista.size) {
                validOpt = true
            } else {
                println("Entro una opcion no valida")
            }

        }

        return opt
    }

    fun sumWithIva(lista: List<Float>): Triple<Float,Float,Float> {
        var total = 0f

        lista.forEach { total += it }

        val IVA :Float = total.times(0.16f)

        return Triple(total, IVA, total + IVA)
    }

    fun validPassword(pass: String):Boolean {
        var isValid = true

        val specialChars = listOf<Char>(',','.', '<','>',';',':','"','[',']','{','}','|','!','@','#','$','%','^','&','*','(',')','-','_')
        val len = pass.length
        val upperCase = pass.filter { it.isUpperCase() }
        val lowerCase = pass.filter { it.isLowerCase() }
        val digits = pass.filter { it.isDigit() }

        for( item in specialChars){
            if(pass.contains(item)){
                isValid = true
                break
            }
            else isValid = false
        }

        if (!isValid) println("Must have at least one special character")

        if (len < 8){
            println("Must have at least 8 characters has $len")
            isValid = false
        }

        if (upperCase.isEmpty()) {
            println("Must have a upper case")
            isValid = false
        }

        if (lowerCase.isEmpty()) {
            println("Must have a lower case" )
            isValid = false
        }

        if (digits.isEmpty()) {
            println("Must have a digit")
            isValid = false
        }

        return isValid
    }
    fun createUser(new: User){

    }
    //var Userslist = mutableListOf(intArrayOf)

}