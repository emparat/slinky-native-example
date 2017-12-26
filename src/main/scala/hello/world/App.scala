package hello.world

import me.shadaj.slinky.core._
import me.shadaj.slinky.core.annotations.react

import scala.scalajs.js
import scala.scalajs.js.Dynamic.literal
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}

@react class App extends Component {
  type Props = Unit
  type State = Int

  def initialState = 0

  def onPress(): Unit =
    setState(_ + 1)

  def render() = {
    View(
      style =
        Some(literal(padding = 50))
    )(
      Text(
        style =
          Some(literal(fontSize = 30, color = "red"))
      )("Hello, Slinky!"),

      Text()("Count: " + state),
      Button(title = "Press me", onPress = onPress)
    )
  }
}
