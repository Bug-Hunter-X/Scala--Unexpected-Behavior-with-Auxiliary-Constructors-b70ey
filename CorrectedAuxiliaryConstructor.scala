```scala
class MyCorrectedClass(var y: Int) {
  def this(z: Int) = {
    this(0) // Initialize y to 0 in the primary constructor
    y = z // Modify y correctly after initializing
  }
}

val correctedInstance = new MyCorrectedClass(5)
println(correctedInstance.y) // Output: 5

// Alternatively: directly initialize y in the auxiliary constructor
class MyCorrectedClass2(var y: Int) {
  def this(z: Int) = {
    this(z)
  }
}
val correctedInstance2 = new MyCorrectedClass2(5)
println(correctedInstance2.y) // Output: 5
```