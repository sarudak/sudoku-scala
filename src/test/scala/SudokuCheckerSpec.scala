/**
  * Created by seth on 2/20/16.
  */
import org.scalatest._


class SudokuCheckerSpec extends FlatSpec with Matchers{

  val validBoard = Vector(
    Vector(1, 2, 3, 4, 5, 6, 7, 8, 9),
    Vector(4, 5, 6, 7, 8, 9, 1, 2, 3),
    Vector(7, 8, 9, 1, 2, 3, 4, 5, 6),
    Vector(2, 3, 4, 5, 6, 7, 8, 9, 1),
    Vector(5, 6, 7, 8, 9, 1, 2, 3, 4),
    Vector(8, 9, 1, 2, 3, 4, 5, 6, 7),
    Vector(3, 4, 5, 6, 7, 8, 9, 1, 2),
    Vector(6, 7, 8, 9, 1, 2, 3, 4, 5),
    Vector(9, 1, 2, 3, 4, 5, 6, 7, 8))

  "A valid board when checked" should "be marked as valid" in
  {
    SudokuChecker.IsComplete(validBoard) should be (true)
  }



  val rowDupeBoard = Vector(
    Vector(1, 2, 3, 1, 2, 3, 1, 2, 3),
    Vector(4, 5, 6, 4, 5, 6, 4, 5, 6),
    Vector(7, 8, 9, 7, 8, 9, 7, 8, 9),
    Vector(2, 3, 4, 2, 3, 4, 2, 3, 4),
    Vector(5, 6, 7, 5, 6, 7, 5, 6, 7),
    Vector(8, 9, 1, 8, 9, 1, 8, 9, 1),
    Vector(3, 4, 5, 3, 4, 5, 3, 4, 5),
    Vector(6, 7, 8, 6, 7, 8, 6, 7, 8),
    Vector(9, 1, 2, 9, 1, 2, 9, 1, 2))

  "A board with row duplicates when checked" should "be marked as invalid" in
    {
      SudokuChecker.IsComplete(rowDupeBoard) should be (false)
    }

  val columnDupeBoard = Vector(
    Vector(1, 2, 3, 4, 5, 6, 7, 8, 9),
    Vector(4, 5, 6, 7, 8, 9, 1, 2, 3),
    Vector(7, 8, 9, 1, 2, 3, 4, 5, 6),
    Vector(1, 2, 3, 4, 5, 6, 7, 8, 9),
    Vector(4, 5, 6, 7, 8, 9, 1, 2, 3),
    Vector(7, 8, 9, 1, 2, 3, 4, 5, 6),
    Vector(1, 2, 3, 4, 5, 6, 7, 8, 9),
    Vector(4, 5, 6, 7, 8, 9, 1, 2, 3),
    Vector(7, 8, 9, 1, 2, 3, 4, 5, 6))

  "A board with column duplicates when checked" should "be marked as invalid" in
    {
      SudokuChecker.IsComplete(columnDupeBoard) should be (false)
    }

  val squareDupeBoard = Vector(
    Vector(1, 2, 3, 4, 5, 6, 7, 8, 9),
    Vector(2, 3, 4, 5, 6, 7, 8, 9, 1),
    Vector(3, 4, 5, 6, 7, 8, 9, 1, 2),
    Vector(4, 5, 6, 7, 8, 9, 1, 2, 3),
    Vector(5, 6, 7, 8, 9, 1, 2, 3, 4),
    Vector(6, 7, 8, 9, 1, 2, 3, 4, 5),
    Vector(7, 8, 9, 1, 2, 3, 4, 5, 6),
    Vector(8, 9, 1, 2, 3, 4, 5, 6, 7),
    Vector(9, 1, 2, 3, 4, 5, 6, 7, 8))

  "A board with duplicates in the squares when checked" should "be marked as invalid" in
    {
      SudokuChecker.IsComplete(squareDupeBoard) should be (false)
    }

}
