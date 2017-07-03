using System;
using System.Collections.Generic;

namespace BattleshipApplication
{
    internal class Program
    {
        public static void Main(string[] args)
        {
            GameMap gameMap = new GameMap(20);
            GameUtil.FillMap(gameMap);

            Console.Clear();
            Console.Write(gameMap.ToString());

            while (true)
            {
                var line = Console.ReadLine();
                
                int[] cellCoordinates = GameUtil.ParseInputCoordinates(line);

                int row = cellCoordinates[0];
                int column = cellCoordinates[1];

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