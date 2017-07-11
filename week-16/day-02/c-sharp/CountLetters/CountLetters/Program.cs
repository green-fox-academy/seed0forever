using System;
using System.Collections.Generic;
using System.Linq;

namespace CountLetters
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            IDictionary<char, int> letterOccurrences =
                CountLettersIn("This method should count the letter occurrences in this string!");

            PrintDictionaryByValueDesc(letterOccurrences);
        }

        private static void PrintDictionaryByValueDesc(IDictionary<char, int> dictionary)
        {
            var sortingQuery = from keyValuePair in dictionary
                orderby keyValuePair.Value descending
                select keyValuePair;

            foreach (var pair in sortingQuery)
            {
                Console.WriteLine("{0}: {1}", pair.Key, pair.Value);
            }
        }

        private static IDictionary<char, int> CountLettersIn(string input)
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