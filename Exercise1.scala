
object Exercise1 {
    def main(args:Array[String]){
      val x : Double = 42.354562
      val y : Int = 3
      println("The round value of x is " + BigDecimal(x).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble)
      println("The left zero padding version of y is "+ f"$y%04d")
      printfactorial(6)
      printfactorial(8)
      printfactorial(a=4.52)
    }
    def factorial(a:Int): Int = {
      var p = 1
      for (i <- 1 to a){
      
        p = p * i;
        }
      return p
    }
    def printfactorial(b:Int=0, a:Double = 0) {
      if (b.getClass() == 1.getClass() &&  b != 0) {
        println(factorial(b))
      }
      else if (a.getClass() == 1.1.getClass()) {
        val c=a.toInt
        println(factorial(c))
      }
      else{
        println("NA")
      }
     }
    
}