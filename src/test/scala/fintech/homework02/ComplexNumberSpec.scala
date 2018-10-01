package fintech.homework02
package fintech.homework02
import org.scalatest.{FlatSpec, Matchers}

class ComplexNumberSpec extends FlatSpec with Matchers {
  "A ComplexNumber" should "plus (+)  a + ib and c + id equally a + c + i(b + d)" in {
    val first = new ComplexNumber(2,3)
    val second = new ComplexNumber(4,5)
    val ans = first+second
    ans.a should be (6)
    ans.b should be (8)
  }

  "A ComplexNumber" should "multiplication (*)  a + ib and c + id equally ac – bd + i(ad + bc)" in {
    val first = new ComplexNumber(2,3)
    val second = new ComplexNumber(4,5)
    val ans = first*second
    ans.a should be (-7)
    ans.b should be (22)
  }

  "A ComplexNumber" should "equality (==)  a + ib and c + id equally a = c and b = d." in {
    val first = new ComplexNumber(2,3)
    val second = new ComplexNumber(4,5)
    val third = new ComplexNumber(4,5)
    first==second should be (false)
    second==third should be (true)
  }

  "A ComplexNumber" should "pow (~)" in {
    val first = new ComplexNumber(5,2)
    val ans = first ~4
    ans.a should be (41)
    ans.b should be (840)

  }
}
