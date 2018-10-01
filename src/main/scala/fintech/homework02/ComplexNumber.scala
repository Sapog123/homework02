package fintech.homework02

class ComplexNumber(val a:Double, val b:Double) {


  // Написать класс описывающий комплексные числа.
  // Реализовать проверку на равенство, умножение и сложение, toString.
  // Реализовать оператор возведения в целую степень: "~".
  // Реализовать тесты в ComplexNumberSpec

  def ==( s: ComplexNumber):Boolean=
  {
    a == s.a && b == s.b
  }
  def +(s: ComplexNumber):ComplexNumber=
  {
    new ComplexNumber(a+s.a,b+s.b)

  }
  def *(s: ComplexNumber):ComplexNumber=
  {
    new ComplexNumber(a*s.a-b*s.b,a*s.b+b*s.a)
  }
  override def toString():String=
  {
    s"$a+i$b"
  }

  def ~(n: Int):ComplexNumber=
  {
    var ans = new ComplexNumber(0,0)
    for(k <- 0 to n)
    {
      val moodul =  (factorial(n)/(factorial(k)*factorial(n-k)))*Math.pow(a,n-k)*Math.pow(b,k)
      var p = -1
      if (k % 2 == 0 && k %4 == 0 || k % 2 == 1 && (k-1) %4 == 0) p = 1
      var item = new ComplexNumber(p*moodul,0)
      if(k%2 == 1){item = new ComplexNumber(0,p*moodul)}
      ans = ans+item

    }

    ans
  }

  def factorial(n: Int): Int = {
    if (n == 0)
      return 1
    else
      return n * factorial(n-1)
  }
}
