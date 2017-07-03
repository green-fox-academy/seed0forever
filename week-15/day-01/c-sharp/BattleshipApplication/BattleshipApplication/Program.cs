﻿using System;
using System.Collections.Generic;

namespace BattleshipApplication
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            GameMap gameMap = new GameMap(20);
            GameMapFillerUtil.FillMap(gameMap);

            Console.Clear();
            Console.Write(gameMap.ToString());

            while (true)
            {
                var line = Console.ReadLine();
                int column = -1 + int.Parse(line.Substring(0, 2));
                int row = -1 + int.Parse(line.Substring(3, 2));

                MapCell targetMapCell = gameMap.CellMatrix[row, column];

                if (targetMapCell == MapCell.Empty)
                {
                    gameMap.CellMatrix[row, column] = MapCell.Miss;
                }
                else if (targetMapCell == MapCell.ShipHidden)
                {
                    gameMap.CellMatrix[row, column] = MapCell.ShipHit;
                }

                Console.Clear();
                Console.Write(gameMap.ToString());
            }
        }
    }
}