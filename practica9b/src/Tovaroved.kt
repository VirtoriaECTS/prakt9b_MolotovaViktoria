//Tovarobed.kt
import Intertnet_magasin.*
import java.util.*
open class Tovaroved(var opisanie_tovar:String, var nal:Boolean, var tv_klient:Boolean, var name_tovar:String,  var tv_price:Double,var tv_reiting:Int, var tv_strana:String) :
    Intertnet_magasin(name_tovar, tv_price, tv_reiting, tv_strana) {

    override fun get_info() {
        super.get_info()
    }

    override fun info_reiting() {
        super.info_reiting()
    }

    override fun country() {
        super.country()
    }

    open fun info_opisanie(){
        println("Описание товара")
        println(opisanie_tovar)
    }
    open fun nalichie():String{
        var text:String = ""
        if(nal) {
            text = "Клиент может получить товар прямо сейчас"
        }
        else{
            val dostavka:Int = Random().nextInt((14 - 3) + 3)
            text = "Товара нет в наличии. Покупатель получит заказ через $dostavka дня"
        }
        return text
    }

    open fun black_list(){
        if(tv_klient) {
            println("Клиент оплатил товар")
            var text:String = nalichie();
            println(text)
        }
        else {
            println("Клиент не оплатил товар. Он довален в черный список")
            println("Товар никогда не приедет к клиенту")
        }

        }


}