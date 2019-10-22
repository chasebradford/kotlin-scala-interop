package cbradford

object ScalaApp {
  def execute() {
    val arg = new Outer.Inn()

    // Demonstrates calling the Java defined method
    new JavaConsumer().use(arg)

    // Demonstrates calling the Java defined method
    // This line will not compile due to missing inner static class byte code.
    new KotlinConsumer().use(arg)
  }
}
