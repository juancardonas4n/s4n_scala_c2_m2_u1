// Scala 
import scala.annotation.tailrec

// Factorial recursivo utilizando un If
def factorialIf(n:Int):Int = if (n == 0) 1 else n * factorialIf(n - 1)

def factorialCase(n:Int):Int = n match {
  case 0 => 1
  case n => n * factorialCase(n - 1)
}

def factorialCola(n:Int):Int = {
  @tailrec
  def iFactorialCola(n:Int, prod:Int):Int = n match {
    case 0 => prod
    case n => iFactorialCola(n - 1, n * prod)
  }
  iFactorialCola(n, 1)
}

def tiempoEjeFac(fac:Int => Int, n:Int):Long = {
  val tInicial = System.nanoTime
  fac(n)
  System.nanoTime - tInicial
}
