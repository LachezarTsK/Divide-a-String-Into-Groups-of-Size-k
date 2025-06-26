
#include <vector>
#include <string>
#include <algorithm>
using namespace std;

class Solution {

public:
    vector<string> divideString(const string& input, int groupSize, char fill) const {
        vector<string> groups((input.length() + groupSize - 1) / groupSize);
        int index = 0;

        for (int i = 0; i < input.length(); i += groupSize) {
            groups[index] = input.substr(i, min(groupSize, static_cast<int>(input.length()) - i));
            ++index;
        }

        if (groups[index - 1].length() < groupSize) {
            groups[index - 1] += string(groupSize - groups[index - 1].length(), fill);
        }

        return groups;
    }
};
