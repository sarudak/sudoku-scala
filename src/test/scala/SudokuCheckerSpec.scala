/**
  * Created by seth on 2/20/16.
  */

import org.specs2.mutable.Specification


class SudokuCheckerSpec extends Specification{
  "This is a specification for the sudoku checker".txt

  val validBoard = Vector(
    Vector(1, 2, 3, 4, 5, 6, 7, 8, 9),
    Vector(4, 5, 6, 7, 8, 9, 1, 2, 3),
    Vector(7, 8, 9, 1, 2, 3, 4, 5, 6),
    Vector(2, 3, 4, 5, 6, 7, 8, 9, 1),
    Vector(5, 6, 7, 8, 9, 1, 2, 3, 4),
    Vector(8, 9, 1, 2, 3, 4, 5, 6, 7),
    Vector(2, 3, 4, 5, 6, 7, 8, 9, 1),
    Vector(5, 6, 7, 8, 9, 1, 2, 3, 4),
    Vector(8, 9, 1, 2, 3, 4, 5, 6, 7))

  "When given a valid board should return true" >> {
      SudokuChecker.IsComplete(validBoard)
  }
}
