package pack

object obj {
  
  def main(args:Array[String]):Unit={
    
    println("===spark started===")
    
    val data=List("state->TN~city->Chennai","state->AP~city->Amaravathi")
    println("===========Raw list===========")
    val seplist = data.flatMap(x=>x.split("~"))
  
    val state = seplist.filter(x=> x.contains("state"))

    val city = seplist.filter(x=>x.contains("city"))
    
    println("*************************************************")
    val state1=state.flatMap(x=>x.split("->")).map(x=>x(1))
    println(state1)
    
    
    
    
    
    
    println("*************************************************")

    
    println("========Expected List=============")
    println
    val stat = state.map(x=>x.replace("state->"," "))
    stat.foreach(println)
    println
    val cit = city.map(x=>x.replace("city->"," "))
    cit.foreach(println)
  }
  
}