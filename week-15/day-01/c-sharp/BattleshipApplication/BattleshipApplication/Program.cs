using System;
using System.Collections.Generic;

namespace BattleshipApplication
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            GameMap gameMap = new GameMap(20);
            GameMapFillerUtil.FillMap(gameMap);
            Console.Write(gameMap.ToString());
        }
    }
}