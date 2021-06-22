























import scala.annotation.tailrec

def facIf(n:Int):Int = if (n == 0) 1 else n * facIf(n - 1)
def facCase(n:Int):Int = n match {
  case 0 => 1
  case n => n * facCase(n - 1)
}
def facCola(n:Int):Int = {
  @tailrec
  def iFacCola(n:Int, prod:Int):Int = n match {
    case 0 => prod
    case n => iFacCola(n - 1, n * prod)
  }
  iFacCola(n, 1)
}

def obtTmpEjec(fac:Int => Int, n:Int):Long = {
  val tInicio = System.nanoTime
  fac(n)
  System.nanoTime - tInicio
}

def obtTmpEjec2(fac:Int => Int):Int => Long =
  (n:Int) => obtTmpEjec(fac, n)
