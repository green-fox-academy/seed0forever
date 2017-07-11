using System;
using System.Collections.Generic;
using System.Linq;

namespace CountLetters
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            var letterCounter = new LetterCounter();
            IDictionary<char, int> letterOccurrences =
                letterCounter.CountLettersIn("This method should count the letter occurrences in this string!");

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
    }
}