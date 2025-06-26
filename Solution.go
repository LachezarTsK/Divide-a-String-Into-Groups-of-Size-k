
package main
import "strings"

func divideString(input string, groupSize int, fill byte) []string {
    groups := make([]string, (len(input) + groupSize - 1) / groupSize)
    index := 0

    for i := 0; i < len(input); i += groupSize {
        groups[index] = input[i:min(i + groupSize, len(input))]
        index++
    }

    if len(groups[index - 1]) < groupSize {
        groups[index - 1] += strings.Repeat(string(fill), groupSize - len(groups[index - 1]))
    }

    return groups
}
