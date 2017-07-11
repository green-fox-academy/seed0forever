using System.Collections.Generic;

namespace CountLetters
{
    public class LetterCounter
    {
        public IDictionary<char, int> CountLettersIn(string input)
        {
            IDictionary<char, int> letterCounts = new Dictionary<char, int>();

            char[] inputAsCharArray = input.ToLower().ToCharArray();

            foreach (char currentChar in inputAsCharArray)
            {
                int currentValueInDictionary;
                if (letterCounts.TryGetValue(currentChar, out currentValueInDictionary))
                {
                    letterCounts[currentChar] = currentValueInDictionary + 1;
                }
                else
                {
                    letterCounts.Add(currentChar, 1);
                }
            }
            return letterCounts;
        }
    }
}