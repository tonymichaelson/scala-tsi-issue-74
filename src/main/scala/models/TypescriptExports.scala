package models

import com.scalatsi.TypescriptType.{TSLiteralString, TSUnion}
import com.scalatsi._

object TypescriptExports extends DefaultTSTypes {
  def enumTsType[E <: enumeratum.EnumEntry, AllValues <: enumeratum.Enum[E]: Manifest](enum: AllValues)(
    implicit m: Manifest[AllValues]): TSType[E] =
    TSType.alias[E](
      m.runtimeClass.getSimpleName.stripSuffix("$"),
      TSUnion(enum.values.map(e => TSLiteralString(e.entryName)))
    )

  implicit val funkyMapMode: TSType[FunkyMapMode] = enumTsType(FunkyMapMode)
  implicit val mapMode     : TSType[MapMode]      = enumTsType(MapMode)
}
