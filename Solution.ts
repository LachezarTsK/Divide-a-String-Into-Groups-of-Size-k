
function divideString(input: string, groupSize: number, fill: string): string[] {
    const groups: string[] = new Array(Math.ceil(input.length / groupSize));
    let index = 0;

    for (let i = 0; i < input.length; i += groupSize) {
        groups[index] = input.substring(i, Math.min(i + groupSize, input.length));
        ++index;
    }

    if (groups[index - 1].length < groupSize) {
        groups[index - 1] += fill.repeat(groupSize - groups[index - 1].length);
    }

    return groups;
};
