```scala
class MyClass(val x: Int) {
  def myMethod(): Int = {
    x + 1 
  }
}

class MyClassSolution(val x: Int) {
  def myMethod(): Int = {
    Option(x).getOrElse(0) + 1 //Handles potential null values
  }
}
```