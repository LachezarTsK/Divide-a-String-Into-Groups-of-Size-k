
using System;

public class Solution
{
    public string[] DivideString(string input, int groupSize, char fill)
    {
        string[] groups = new string[(input.length() + groupSize - 1) / groupSize];
        int index = 0;

        for (int i = 0; i < input.Length; i += groupSize)
        {
            groups[index] = input.Substring(i, Math.Min(groupSize, input.Length - i));
            ++index;
        }

        if (groups[index - 1].Length < groupSize)
        {
            groups[index - 1] += new string(fill, groupSize - groups[index - 1].Length);
        }
        return groups;
    }
}
