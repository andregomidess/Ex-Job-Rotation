fun main (args: Array<String>){
    println(fib(2))
}

fun fib (n: Int): Int{
    if (n == 0 || n == 1)
        return n
    return fib(n-1) + fib(n-2)
}