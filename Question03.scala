val toUpper = (s: String) => s.map{letter => if (letter.isLower) (letter - 32).toChar else letter}
val toLower = (s: String) => s.map{letter => if (letter.isUpper) (letter + 32).toChar else letter}

def formatNames(name: String)(formatFunction: String => String): String = {
  formatFunction(name);
}

object Question03 extends App{
    println(formatNames("Benny")(toUpper));
    println(formatNames("Ni")(toUpper) + "roshan");
    println(formatNames("S")(toLower) + "aman");
    println("kumar" + formatNames("a")(toUpper));
}
