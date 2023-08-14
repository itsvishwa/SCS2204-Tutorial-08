object Question01 extends App(){
    val getInterset = (depositAmount: Double) => depositAmount match {
        case x if x < 20000 => x * 0.02
        case x if x < 200000 => x * 0.035
        case x if x < 2000000 => x * 0.04
        case _ => depositAmount * 0.065
    }
    print("Deposit Amount: ")
    var depositAmount = scala.io.StdIn.readDouble()
    printf("Interst Amount: %.2f", getInterset(depositAmount))

}