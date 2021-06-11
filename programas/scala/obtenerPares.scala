def obtenerPares(lst:List[Int]):List[Int] = { 
  def iObtenerPares(lst:List[Int],res:List[Int]):List[Int] = {
    if (lst.isEmpty) res
    else {
      val e = lst.head
      if (e % 2 == 0) iObtenerPares(lst.tail,res :+ e)
      else iObtenerPares(lst.tail, res)
    }
  }
  iObtenerPares(lst,List())
}
