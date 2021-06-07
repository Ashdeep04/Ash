package com.example.androidproject

  fun main() {
    //println("Welcome Kotlin!!")
    //for (i in 20..40){
    //print("$i\n")
    //}

    //var lang = arrayOf("C","Java","Kotlin","Python")
    //for (index in lang.indices){
    // print(lang[index])
    //}
    var a: Int = 23
    var b: Int = 30
    var x:Int = hello(a, b)
    display(x)

  }
fun hello(a:Int,b:Int):Int{
 var c:Int = a+b
  return c
}
fun display(c:Int){
  print("Result : $c")
}



    /*
    var myName:String = "Ash"
    var num = 10
    var name = "Ashu"
    var myNum:Int = 69
    num = 100
    println("Hello $myNum")
    println("Hii "+num)
    val numm = 20 //cannot be changed
    println("Hell "+numm)

    val myInt = 4_5
    var myDouble:Double = 2.8
    println("Hey "+myInt)
    println("Heyyo "+myDouble)
    var myByte:Byte = 127 //if not mentioned, by default int will be taken
    println("Hi "+myByte)

    var myBoolean:Boolean = true
    println("You are "+myBoolean)
    var numbers = arrayOf(1,2,3,4,5)
    var animals = arrayOf("cat","dog","bat")
    var mixed = arrayOf("cat",1,"bat",true,'a')

    var nums = arrayOf(1,2,3,4,5,6)
    println("${nums.size}")

*/
   /* var myString:String = "Android Kotlin"
    var myFloat:Float = 13.37f
    val myDouble:Double = 3.14159265358979
    var myInt:Int = 27

    println(myString)
    println(myFloat)
    println(myDouble)
    println(myInt)
*/
   // var a = "19"
    //var b = "1"
    //var c:String = (a.toInt() + b.toInt()).toString()



