import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*


fun main() {
     /*val list = listOf(
         Pair('I', 1), Pair('V', 5), Pair('X', 10), Pair('L', 50), Pair('C', 100), Pair('D', 500), Pair('M', 1000)
     )
    var res = 0
    val arrTemp = ArrayList<Int>()
    val input = readLine()!!.trimEnd().split(" ")
    val romanNum = input[0]
    for (c in romanNum) {
        for (item in list)
        if (item.first == c) {
            arrTemp.add(item.second)
        }
    }
    for ( item in 0 until arrTemp.size) {
        if (item != arrTemp.size - 1 && arrTemp[item] < arrTemp[item + 1] ) {
            arrTemp[item] = arrTemp[item+1]-arrTemp[item]
        }else{
            continue
        }
    }

    for (item in arrTemp) {
        println(item)
        res+=  item
    }*/
    var flag =0
    var res = 0
    val listRoman = listOf<Char>(
        'I', 'V', 'X', 'L', 'C', 'D', 'M'
    )
    val listNumbers = listOf<Int>(
        1, 5, 10, 50, 100, 500, 1000
    )
    val arrTemp = ArrayList<Int>()
    val arrRes = ArrayList<Int>()
    val input = readLine()!!.trimEnd().split(" ")
    for (c in input.toString()) {
        if (listRoman.contains(c)) {
            arrTemp.add(listNumbers[listRoman.indexOf(c)])
        }
    }
    for ( item in 0 until arrTemp.size) {
        if(flag != 0 ){
            flag = 0
            continue
        }
        if (item != arrTemp.size - 1 && arrTemp[item] < arrTemp[item + 1] ) {
            var x = arrTemp[item+1]-arrTemp[item]
            arrRes.add(x)
            flag = 1
        }else{
            arrRes.add(arrTemp[item])
        }
    }

    for (item in arrRes) {
        res+=  item
    }
    println(res)
}