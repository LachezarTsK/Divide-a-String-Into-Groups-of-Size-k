
public class Solution {

    public String[] divideString(String input, int size, char fill) {
        String[] result = new String[(input.length() + size - 1) / size];
        int index = 0;

        for (int i = 0; i < input.length(); i += size) {
            result[index] = input.substring(i, Math.min(i + size, input.length()));
            ++index;
        }

        if (result[index - 1].length() < size) {
            result[index - 1] += Character.toString(fill).repeat(size - result[index - 1].length());
        }

        return result;
    }
}
