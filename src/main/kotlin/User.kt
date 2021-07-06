abstract class User {

    var userName: String
    var password: String
    var email: String
    var logedIn = false
    constructor(userName:String,email: String,password:String){
        this.userName = userName
        this.password = password
        this.email = email

        logedIn = true
        println("Usuarario Creado")

    }
    constructor(userName:String,email: String,password:String,listCreator: Boolean){
        this.userName = userName
        this.password = password
        this.email = email
        logedIn = false


    }
    /*constructor(){
        userName = ""
        password = ""
        logedIn = false
    }*/





    fun addPayment(cardNumber: Int, dateExpMonth: Int,dateExpYr: Int){



    }



}

/*class CreditCard(cardN: Int,  {

}){

}*/
class RegularUser(userName: String,email: String,password: String,payment: String) : User(userName,email,password){



}

