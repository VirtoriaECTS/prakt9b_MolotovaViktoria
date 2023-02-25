//main.kt
import Intertnet_magasin.Intertnet_magasin

fun main(){
    var name :String = ""
    var strana :String = ""
    var price :Double =0.0
    var reiting:Int = 1

    println("Класс Интернет магазин")

    println("Введите название товара")
    name = readLine()!!.toString()
    if(name.length == 0) println("Необходимо ввести название товара")
    else{
        println("Введите страну произодителя товара с большой буквы")
        strana = readLine()!!.toString()
        if(strana.length == 0) println("Необходимо ввести cтрану производителя товара")
        else{
            try {
                println("Введите цену товара в рублях")
                price=readLine()!!.toDouble()
                if(price <= 0) println("Цена не может быть отрицательная")
                else{
                    println("Введите рейтинг товара от 1 до 10")
                    reiting=readLine()!!.toInt()
                    if(reiting <= 0) println("Рейтинг не может быть отрицательным")
                    else{
                        val shop = Intertnet_magasin(name, price, reiting, strana)
                        shop.get_info()
                        shop.info_reiting()
                        shop.country()
                        println()
                    }
                }
            }catch (e: NumberFormatException){
                println("Ошибка. Необходимо ввести число")
            }
        }
    }



    val tovarobed = Tovaroved("Этот чехол очень прочный и имеет черный цвет", false, true,"Чехол для айфон 11" ,70.55, 5, "Китай")
    tovarobed.get_info()
    tovarobed.info_reiting()
    tovarobed.country()
    tovarobed.info_opisanie()
    tovarobed.black_list()
    println()


    val klient = Klient(3, true, 8, "Чехол для айфон 11", 70.55, 5, "Китай")
    klient.get_info()
    klient.info_reiting()
    klient.country()
    klient.podarok()
    klient.fun_need()

}