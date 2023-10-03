import net.kigawa.kutil.unitapi.component.container.UnitContainer
import net.kigawa.kutil.unitapi.registrar.InstanceRegistrar
import net.kigawa.kutil.unitapi.registrar.ResourceRegistrar

object Main {
  val container = UnitContainer.create()

  @JvmStatic
  fun main(args: Array<String>) {
    container.getUnit(InstanceRegistrar::class.java).apply {
      register(this@Main)
    }
    container.getUnit(ResourceRegistrar::class.java).apply {
      register(javaClass)
    }
  }
}