def obtenerImpares(lst:List[Int]):List[Int] = { 
  def iObtenerImpares(lst:List[Int],res:List[Int]):List[Int] = {
    if (lst.isEmpty) res
    else {
      val e = lst.head
      if (e % 2 == 1) iObtenerImpares(lst.tail,res :+ e)
      else iObtenerImpares(lst.tail, res)
    }
  }
  iObtenerImpares(lst,List())
}
