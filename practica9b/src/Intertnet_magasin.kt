//Internet_magazin.kt
package Intertnet_magasin

open class Intertnet_magasin (var name:String,  var price:Double, var reiting:Int, var strana:String){

    open fun get_info(){
        println("Краткая информация о товаре:  $name")
        println("Цена одной штуки: $price\nРейтинг: $reiting")
    }

    open fun info_reiting(){
        println("Подробнее о рейтинге")
        if(reiting < 4) println("Судя по отзывам это плохой товар")
        else if((reiting > 4) && (reiting < 7)) println("В целом покупателям понравился товар")
        else println("Покупатели в восторге от товара!")
    }

    open fun country(){
        if(strana == "Россия") println("Это отечественный товар")
        else println("Это зарубежный товар")
    }
}