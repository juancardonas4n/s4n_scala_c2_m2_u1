import scala.math._

val cuadratica:(Double,Double,Double) => (Double,Double) = (a,b,c) => {
  val mb = -b
  val b2 = pow(b,2)
  val tSqrt = sqrt(b2 - 4 * a * c)
  val dem = 2 * a
  val term:((Double,Double)=>Double)=>Double = f => f(mb,tSqrt)/dem
  (term(_+_),term(_-_))
}
