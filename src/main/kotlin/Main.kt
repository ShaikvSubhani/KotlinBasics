
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// FUNCTIONS IN KOTLIN
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
fun Greeting(): String{

    return "hello getGreeting"
}

//function with arguments

fun param(someVar: String)
{
    val msg= "hello "+ someVar;
    println(msg)
}


//here name is top level variable
var name:String="sunil"
var greeting:String?="hello"

fun main() {
    println("Hello World!");
    println(greeting)
    //variables in kotlin
    //difference between var and val
    //after assigning to val you cant change the data
    //but in var you can change
    greeting="hi";

    println(greeting)

    //in kotlin you can also declare variables outside the main function,
    //those variables are called top level variables
    var name: String="subhani"
    name="shubham";

    // types are not null in kotlin
    println(name);


    //conditional statements in kotlin are same as java
    if(greeting !=null)
        println(greeting)
    else
        println(greeting);

    //like a switch case in java , kotlin has when
    when(greeting)
    {
        null-> println("hi")
        //in when else case is like default case when none of the above case is true, then else case get executed
        else-> println("not null")
    }


    println(Greeting())

    //calling the paramterized function
    param("Subhani")


}
