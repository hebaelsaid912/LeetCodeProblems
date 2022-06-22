fun main(){
    println(isPalindrome(1))
}
fun isPalindrome(x: Int): Boolean {
    var num = x
    var reversedInteger = 0
    var remainder: Int
    val originalInteger: Int = num
    //if(num >=9) {
        while (num != 0) {
            remainder = num.mod(10)
            reversedInteger = reversedInteger * 10 + remainder
            num = num.div(10)
        }

        if (originalInteger == reversedInteger)
            return true
   // }
    return false
}