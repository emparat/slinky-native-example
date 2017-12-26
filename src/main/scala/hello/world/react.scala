package hello.world

import scala.scalajs
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import me.shadaj.slinky.core.ExternalComponent
import me.shadaj.slinky.core.facade.ReactElement
import me.shadaj.slinky.core.annotations.react

@js.native
@JSImport("react-native", "AppRegistry")
object AppRegistry extends js.Object {
  def registerComponent(appKey: String, getComponentFunc: js.Function0[js.Object]): Unit = js.native
}

@react object View extends ExternalComponent {

  case class Props(style: Option[js.Object] = None)

  @js.native
  @JSImport("react-native", "View")
  object Component extends js.Object

  override val component = Component
}


@react object Button extends ExternalComponent {

  case class Props(title: String, onPress: () => Unit, style: Option[js.Object] = None)

  @js.native
  @JSImport("react-native", "Button")
  object Component extends js.Object

  override val component = Component
}

@react object Text extends ExternalComponent {

  case class Props(style: Option[js.Object] = None)

  @js.native
  @JSImport("react-native", "Text")
  object Component extends js.Object

  override val component = Component
}
