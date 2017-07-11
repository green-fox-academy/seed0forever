using System;
using System.Collections;
using System.Collections.Generic;
using CountLetters;
using NUnit.Framework;

namespace CountLettersTest
{
    [TestFixture]
    public class Tests
    {
        private LetterCounter _letterCounter;
        private string _testInput;
        private IDictionary<char, int> _testDictionary;

        [TestFixtureSetUp]
        public void Init()
        {
            //arrange
            _letterCounter = new LetterCounter();
            _testInput = "abbb";
            
            _testDictionary = new Dictionary<char, int>();
            _testDictionary.Add('b', 3);
            _testDictionary.Add('a', 1);
        }
        
        [Test]
        public void Test1()
        {
            //act
            _letterCounter.CountLettersIn(_testInput);
            //assert
            Assert.AreEqual(_testDictionary, _letterCounter.CountLettersIn(_testInput));
        }
    }
}