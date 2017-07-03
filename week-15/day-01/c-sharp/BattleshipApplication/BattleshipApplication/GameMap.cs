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
            string gameMapString = "   ";

            for (int column = 0; column < CellMatrix.GetLength(1); column++)
            {
                char headerChar = 'A';
                headerChar += (char) column;
                gameMapString += headerChar + " ";
            }
            gameMapString += Environment.NewLine;

            for (int row = 0; row < CellMatrix.GetLength(0); row++)
            {
                int rowNumber = 1 + row;
                gameMapString += rowNumber.ToString("D2") + " ";
                
                for (int column = 0; column < CellMatrix.GetLength(1); column++)
                {
                    MapCell currentCell = CellMatrix[row, column];

                    switch (currentCell)
                    {
                        case MapCell.Empty:
                            gameMapString += ". ";
                            break;
                        case MapCell.ShipHidden:
                            gameMapString += "■ ";
                            break;
                        case MapCell.Miss:
                            gameMapString += "O ";
                            break;
                        case MapCell.ShipHit:
                            gameMapString += "X ";
                            break;
                        default:
                            throw new ArgumentOutOfRangeException();
                    }
                }
                gameMapString += Environment.NewLine;
            }
            return gameMapString;
        }
    }
}