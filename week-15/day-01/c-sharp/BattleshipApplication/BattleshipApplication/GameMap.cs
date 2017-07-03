using System;

namespace BattleshipApplication
{
    public class GameMap
    {
        public MapCell[,] CellMatrix { get; }

        public GameMap(int size)
        {
            CellMatrix = new MapCell[size, size];
        }

        public override string ToString()
        {
            string gameMapString = "";

            for (int row = 0; row < CellMatrix.GetLength(0); row++)
            {
                for (int column = 0; column < CellMatrix.GetLength(1); column++)
                {
                    MapCell currentCell = CellMatrix[row, column];

                    if (currentCell == MapCell.Empty)
                    {
                        gameMapString += ". ";
                    }
                    else if (currentCell == MapCell.ShipHidden)
                    {
                        gameMapString += "■ ";
                    }
                    else if (currentCell == MapCell.Miss)
                    {
                        gameMapString += "O ";
                    }
                    else if (currentCell == MapCell.ShipHit)
                    {
                        gameMapString += "X ";
                    }
                }
                gameMapString += Environment.NewLine;
            }
            return gameMapString;
        }
    }
}