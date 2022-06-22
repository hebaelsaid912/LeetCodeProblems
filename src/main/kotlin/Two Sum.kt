import java.util.Collections
import java.util.Dictionary

fun main() {
    var res = twoSum(listOf(3,3).toIntArray(), 6)
    if (res != null) {
        for (i in res) {
            println(i)
        }
    }
}

fun twoSum(nums: IntArray, target: Int): IntArray? {

    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[j] == (target - nums[i])) {
                return listOf(i, j).toIntArray()
            }
        }
    }
    return null
}