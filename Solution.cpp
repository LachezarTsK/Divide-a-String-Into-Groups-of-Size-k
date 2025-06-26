
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Solution {

public:
    vector<string> divideString(const string& input, int size, char fill) const {
        vector<string> result((input.length() + size - 1) / size);
        int index = 0;

        for (int i = 0; i < input.length(); i += size) {
            result[index] = input.substr(i, min(size, static_cast<int>(input.length()) - i));
            ++index;
        }

        if (result[index - 1].length() < size) {
            result[index - 1] += string(size - result[index - 1].length(), fill);
        }

        return result;
    }
};
