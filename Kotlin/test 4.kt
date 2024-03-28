fun main(){
    println("Enter your temparature in celsius")
    val celsius = readLine()?.toDoubleOrNull()

    if(celsius != null ){
        val fahrenheit = celsius * 9 / 5 + 32
        println("Temparature in fahrenheit: $fahrenheit")
    }else{
        println("Invaid input. Please enter a valid number.")
    }

}