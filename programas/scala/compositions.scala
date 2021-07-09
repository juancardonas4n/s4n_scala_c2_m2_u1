
def composicion(f:Int => Int, g:Int => Int):Int => Int = (x:Int) => f(g(x))
def composicion2(f:Double => Int, g:Int => Double):Int => Int = (x:Int) => f(g(x))
def composicion3(f:Int => Double, g:Int => Int):Int => Double = (x:Int) => f(g(x))
def composicion4(f:Double => Double, g:Int => Double):Int => Double = (x:Int) => f(g(x))

def composicion2p(f:Double => Int, g:Int => Double):Int => Int = (x:Int) => {
  val tmp = g(x)
  f(tmp)
}
def composicion3p(f:Int => Double, g:Int => Int):Int => Double = (x:Int) => {
  val tmp = g(x)
  f(tmp)
}
def composicion4p(f:Double => Double, g:Int => Double):Int => Double = (x:Int) => {
  val tmp = g(x)
  f(tmp)
}
