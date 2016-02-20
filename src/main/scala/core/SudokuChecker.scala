/**
  * Created by seth on 2/20/16.
  */
package object SudokuChecker {
    val validSet = Set(1 , 2, 3, 4, 5, 6, 7, 8, 9)

    def getColumns(board:Vector[Vector[Int]]) : Seq[Seq[Int]] =
      (1 to 9).map((colNum:Int) => board.map(_(colNum - 1)))

    def IsComplete(board:Vector[Vector[Int]]) : Boolean = {
      val isValidSudokuSet = (row:Seq[Int]) => row.toSet == validSet
      board.forall(isValidSudokuSet) &&
      getColumns(board).forall(isValidSudokuSet)
    }

}
