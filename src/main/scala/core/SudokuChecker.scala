/**
  * Created by seth on 2/20/16.
  */
package object SudokuChecker {
    val validSet = 1 to 9 toSet

    def getColumns(board:Vector[Vector[Int]]) : Seq[Seq[Int]] =
      (1 to 9).map((colNum:Int) => board.map(_(colNum - 1)))

    def getSquare(board:Vector[Vector[Int]], top:Int, left:Int) : Seq[Int] =
      for(row <- top to top + 3;
          column <- left to left + 3)
        yield board(row)(column)

    def getSquares(board:Vector[Vector[Int]]) : Seq[Seq[Int]] =
      for(top <- 0 to 2;
          left <- 0 to 2)
        yield getSquare(board, top, left)

    def IsComplete(board:Vector[Vector[Int]]) : Boolean = {
      val isValidSudokuSet = (row:Seq[Int]) => row.toSet == validSet
      board.forall(isValidSudokuSet) &&
      getColumns(board).forall(isValidSudokuSet) &&
      getSquares(board).forall(isValidSudokuSet)
    }
}