
import kotlin.math.min

class Solution {

    fun divideString(input: String, groupSize: Int, fill: Char): Array<String> {
        val groups = Array<String>((input.length + groupSize - 1) / groupSize) { String() }
        var index = 0

        for (i in input.indices step groupSize) {
            groups[index] = input.substring(i, min(i + groupSize, input.length))
            ++index
        }

        if (groups[index - 1].length < groupSize) {
            groups[index - 1] += fill.toString().repeat(groupSize - groups[index - 1].length)
        }

        return groups
    }
}
