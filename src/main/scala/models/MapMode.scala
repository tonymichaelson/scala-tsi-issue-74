package models

import enumeratum.{Enum, EnumEntry}

sealed trait MapMode extends EnumEntry
object MapMode extends Enum[MapMode] {
  val values = findValues
  case object MAP      extends MapMode
  case object LIST     extends MapMode
  case object DOCUMENT extends MapMode
}