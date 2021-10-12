
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


val funcion4 = composicion(3+_,composicion(_-9,4*_))
val funcion5 = composicion(_-3,composicion(_+9,6*_))

val funcion4Lamb = (x:Int) => (3 +((4*x)-9))
val funcion5Lamb = (x:Int) => (((6*x)+9)-3)


def test(s:Int, e:Int, f1:Int => Int, f2:Int => Int):Unit = 
  for (x <- Range(1,10)) 
    println(f1(x) == f2(x))

val test2 = test(1,10,_,_)

test2(funcion4, funcion4Lamb)
test2(funcion5, funcion5Lamb)
