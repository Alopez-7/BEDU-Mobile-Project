class LogIn() {
    fun validateUser(name: String,password: String) {
        var userOk = false
        var userIndex = 0
        usuarios.forEach {

            if ((it.password == password) && (it.userName == name)) {
                userOk = true
                userIndex = usuarios.indexOf(it)
            }
        }
        //print("¡Bienvenido ${it.userName}!")
        if (userOk){
         println("Bienvenido ${usuarios[userIndex].userName}")
        }
        else{
            println("El usuario no es valido/no extiste")
        }
    }

}