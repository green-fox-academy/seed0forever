﻿using System;
using System.Collections.Generic;
using System.Linq;

namespace LinqExercises
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };

            var evenNumbers = LinqExercise1(n);
            PrintEnumerableNumbers(evenNumbers);

            var averageOfEvenNumbers = LinqExercise2(n);
            Console.WriteLine("Average of the even numbers: " + averageOfEvenNumbers);


        }

        private static double LinqExercise2(int[] numbers)
        {
            var averageOfNumbers = LinqExercise1(numbers).Average();

            return averageOfNumbers;
        }

        private static IEnumerable<int> LinqExercise1(int[] n)
        {
            
            IEnumerable<int> evenNumbers = n.Where(number => number % 2 == 0);

            return evenNumbers;
        }

        private static void PrintEnumerableNumbers(IEnumerable<int> evenNumbers)
        {
            foreach (var number in evenNumbers)
            {
                Console.Write(number);
                Console.Write(", ");
            }
            Console.WriteLine();
        }
    }
}