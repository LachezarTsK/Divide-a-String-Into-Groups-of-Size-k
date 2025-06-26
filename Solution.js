
/**
 * @param {string} input
 * @param {number} size
 * @param {character} fill
 * @return {string[]}
 */
var divideString = function (input, size, fill) {
    const result = new Array(Math.ceil(input.length / size));
    let index = 0;

    for (let i = 0; i < input.length; i += size) {
        result[index] = input.substring(i, Math.min(i + size, input.length));
        ++index;
    }

    if (result[index - 1].length < size) {
        result[index - 1] += fill.repeat(size - result[index - 1].length);
    }

    return result;
};
