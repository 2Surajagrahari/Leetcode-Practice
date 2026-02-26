class Solution
{
public:
    int numSteps(string s)
    {
        int stps = 0;
        int cry = 0;

        for (int i = s.size() - 1; i > 0; i--)
        {
            int bit = (s[i] - '0') + cry;

            if (bit % 2 == 0)
            {
                stps += 1;
            }
            else
            {
                stps += 2;
                cry = 1;
            }
        }

        return stps + cry;
    }
};