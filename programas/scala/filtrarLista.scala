def filtraLista(lst:List[Int],pred:Int=>Boolean):List[Int] = { 
  def iFiltraLista(lst:List[Int],res:List[Int]):List[Int] = {
    if (lst.isEmpty) res
    else {
      val e = lst.head
      if (pred(e)) iFiltraLista(lst.tail,res :+ e)
      else iFiltraLista(lst.tail, res)
    }
  }
  iFiltraLista(lst,List())
}
