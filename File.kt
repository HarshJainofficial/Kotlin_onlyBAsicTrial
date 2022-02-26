fun main() {
    // val is immutble cant changed
    // var is mutable - can changed 
    val a  = 12 
    val b = 'd'
    val c = "String Immutable"
    val d = "HelloWorld"
    val e =  1212122222222222222 // 666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666666
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println("This is $b")
    println("Uppercase string ${d.uppercase()}")
    println("Lowercase string ${d.lowercase()}")
    val z  = 18 
    if(z > 18){
        println("Yes you can't vote")
} else{
        println("Yes you can vote")
}
}
