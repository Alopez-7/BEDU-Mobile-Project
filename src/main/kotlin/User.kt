class User {

    var userName: String
    var password: String
    var logedIn = false
    constructor(userName:String,password:String){
        this.userName = userName
        this.password = password
        logedIn = true
        println("Usuarario Creado")

    }
    constructor(userName:String,password:String,listCreator: Boolean){
        this.userName = userName
        this.password = password
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


