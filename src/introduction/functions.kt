package introduction

fun main() {

    printMessage("This is a message")

    // calling with second default parameter
    printMessageWithPrefix("Message")

    //calling with custom second parameter
    printMessageWithPrefix("Message","Log")


    //Calls the same function using named arguments and changing the order of the arguments
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    //Prints the result of a function call
    println(sum(10,15))


    // calling the inferred return typed function
    print(multiply(4,3))

}

// declared a function
// function parameter should be like 'parameter name: type'
// : Unit means there is no return value of this function (kind of 'void' in java but not exactly)
fun printMessage(message: String): Unit{
    println(message)
}


//A function that takes a second optional parameter with default value Info.
// The return type is omitted, meaning that it's actually Unit
fun printMessageWithPrefix(message: String, prefix:String = "Info"){
    println("[$prefix] $message")
}


// a function that reruns an integer
fun sum(x: Int, y: Int):Int{
    return x+y
}

//A single-expression function that returns an integer (inferred)
fun multiply(x: Int, y: Int) = x*y
