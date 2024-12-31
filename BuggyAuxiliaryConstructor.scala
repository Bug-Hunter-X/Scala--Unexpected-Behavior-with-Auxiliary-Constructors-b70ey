```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val myInstance = new MyClass()
println(myInstance.x) // Output: 0

// Incorrect usage of auxiliary constructor leading to unexpected behavior
class MyOtherClass(var y: Int) {
  def this(z: Int) = {
    this()
    y = z // Attempt to modify y after calling this()
  }
}

val anotherInstance = new MyOtherClass(5)
println(anotherInstance.y) // Output: 0, unexpected as it should be 5
```