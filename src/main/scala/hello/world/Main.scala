package hello.world

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, JSImport}

import me.shadaj.slinky.core._

object Main {
  @JSExportTopLevel("entrypoint.main")
  def main(): Unit = {
    AppRegistry.registerComponent("Example", () => App.componentConstructor)
  }
}
