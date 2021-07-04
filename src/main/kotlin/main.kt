var currentUser : User? = null
val usuarios = mutableListOf(User("Einar","gay",true),User("ramon","puto",true))



fun main() {
    println("Bienvenido a airbnb")
    println("1.- Iniciar Sesión")
    println("2.- Crear cuenta")
    println("3.- Salir")
    var userKey = readLine()
    var mainSelector = 0
    while (true) {
        when (mainSelector) {


            0 -> while (true) {

                when (userKey) {
                    "1" -> {
                        var logger = LogIn()
                        println("Ingrese nombre: ")
                        var name = readLine().toString()
                        println("Ingrese contraseña: ")
                        var pass = readLine().toString()
                        logger.validateUser(name, pass)
                        mainSelector = 1
                        break
                    }
                    "2" -> {
                        var login = CreateUser()
                        println("Nombre:")
                        var name = readLine().toString()
                        println("Ingrese Contraseña:")
                        var pass = readLine().toString()
                        if (login.validPassword(pass)) {
                            currentUser = User(name, pass)
                            usuarios.add(currentUser!!)
                        }
                        mainSelector = 1
                        break
                    }
                    "3" -> {
                        println("Cerrando App")
                        mainSelector = 99
                        break
                    }
                    else -> {
                        println("Comando no reconocido, ingrese comando valido: ")
                        userKey = readLine()
                    }

                }

            }

            1 -> {
                println("1 Buscar Airbnb")
                println("2 cerrar sesion")
                println("3 salir")
                when(readLine().toString()){
                    "1"-> println("buscando")
                    "2"->{
                        mainSelector = 0
                        println("Bienvenido a airbnb")
                        println("1.- Iniciar Sesión")
                        println("2.- Crear cuenta")
                        println("3.- Salir")
                        userKey = readLine()
                    }
                    "3" ->{
                        mainSelector=99
                        break
                    }

                }
            }
            99 -> break
        }
    }
}

