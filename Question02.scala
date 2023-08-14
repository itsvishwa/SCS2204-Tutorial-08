object Question02 extends App {
    val matchNum = (num: Int) => num match{
        case x if x < 0 => println("Negative")
        case x if x > 0 => println("Positive")
        case _ => print("Zero")
    }

    val isEvenOdd = (num: Int) => num match{
        case x if (x % 2 == 0) => println("Even Number")
        case _ => println("Odd Number")
    }

    val res = (func1: (Int)=>Unit, func2: (Int)=>Unit, num: Int) => {
        func1(num)
        func2(num)
    }

    print("Enter a number: ")
    var num = scala.io.StdIn.readInt()
    res(matchNum, isEvenOdd, num)
}