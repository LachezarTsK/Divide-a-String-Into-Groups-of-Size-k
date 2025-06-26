
public class Solution {

    public String[] divideString(String input, int groupSize, char fill) {
        String[] groups = new String[(input.length() + groupSize - 1) / groupSize];
        int index = 0;

        for (int i = 0; i < input.length(); i += groupSize) {
            groups[index] = input.substring(i, Math.min(i + groupSize, input.length()));
            ++index;
        }

        if (groups[index - 1].length() < groupSize) {
            groups[index - 1] += Character.toString(fill).repeat(groupSize - groups[index - 1].length());
        }

        return groups;
    }
}
