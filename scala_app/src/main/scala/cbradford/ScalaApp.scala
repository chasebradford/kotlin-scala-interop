package cbradford

object ScalaApp {
  def execute() {
    val arg = new Outer.Inn()
    new JavaConsumer().use(arg)
    new KotlinConsumer().use(arg)
  }
}
