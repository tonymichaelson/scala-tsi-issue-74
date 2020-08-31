# scalatsi-issue-74
demonstrating issue exporting enums to typescript

### Generated Output

```typescript
export type FunkyMapMode = (IDOCUMENT | ILIST | IMAP)

export type FunkyMapMode = ("MAP" | "LIST" | "DOCUMENT")

export interface ICaseClass {
  mode: MapMode
}

export interface IDOCUMENT {

}

export interface IFunkyMapModeDuplicateExport {
  mode: FunkyMapMode
}

export interface ILIST {

}

export interface IMAP {

}

export type MapMode = ("MAP" | "LIST" | "DOCUMENT")
```

### Expected Output

```typescript
export type MapMode = ("MAP" | "LIST" | "DOCUMENT")
export type FunkyMapMode = ("MAP" | "LIST" | "DOCUMENT")

export interface ICaseClass {
  mode: MapMode
}

export interface IFunkyMapModeDuplicateExport {
  mode: FunkyMapMode
}
```

### Fix from David

> Changing the annotation from TSType to TSNamedType fixes the problem

```scala
object TypescriptExports extends DefaultTSTypes {
  def enumTsType[E <: enumeratum.EnumEntry, AllValues <: enumeratum.Enum[E]: Manifest](enum: AllValues)(
    implicit m: Manifest[AllValues]): TSNamedType[E] =
    TSType.alias[E](
      m.runtimeClass.getSimpleName.stripSuffix("$"),
      TSUnion(enum.values.map(e => TSLiteralString(e.entryName)))
    )

  implicit val funkyMapMode: TSNamedType[FunkyMapMode] = enumTsType(FunkyMapMode)
  implicit val mapMode     : TSNamedType[MapMode]      = enumTsType(MapMode)
}
```
