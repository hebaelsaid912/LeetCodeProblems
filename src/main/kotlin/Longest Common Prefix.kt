fun main(){
    var res = longestCommonPrefix(arrayOf("a"))
    println(res)
}

fun longestCommonPrefix(strs: Array<String>): String {
    var lcp = ""
    if(strs.size !=1) {
        for (i in strs.indices) {
            for (j in i + 1 until strs.size) {
                lcp = strs[i].commonPrefixWith(strs[j], true)
            }
        }
    }else{
        return strs[0]
    }
    return lcp
}