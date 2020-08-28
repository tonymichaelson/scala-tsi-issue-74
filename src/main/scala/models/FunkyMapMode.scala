package models

import enumeratum.{Enum, EnumEntry}

sealed trait FunkyMapMode extends EnumEntry
object FunkyMapMode extends Enum[FunkyMapMode] {
  val values = findValues
  case object MAP      extends FunkyMapMode
  case object LIST     extends FunkyMapMode
  case object DOCUMENT extends FunkyMapMode
}