//Klient.kt
import Intertnet_magasin.*

open class Klient(var col:Int, val who:Boolean, var need:Int, var name_tovar:String,  var kl_price:Double,var kl_reiting:Int, var kl_strana:String) :
    Intertnet_magasin(name_tovar, kl_price, kl_reiting, kl_strana) {

    open fun fun_all_price():Double{
        val all_price = price * col
        return all_price
    }

    override fun get_info() {
        super.get_info()
        val all:Double = fun_all_price()
        println("Количесвто покупаемого товара: $col")
        println("Стоимость всего заказа: $all")
    }

    override fun info_reiting() {
        super.info_reiting()
    }

    override fun country() {
        super.country()
    }

    open fun podarok(){
        if(who) println("Клиент оставит этот товар себе")
        else println("Клиент покупаем этот товар на подарок")
    }

    open fun fun_need(){
        if(need < 4) println("Клиент не часто будет пользоваться этим товаром")
        else if((need > 4) && (need < 7)) println("Клиент будет часто пользоваться этим товаром")
        else println("Клиент не представляет свою жизнь без этого товара!")
    }
}