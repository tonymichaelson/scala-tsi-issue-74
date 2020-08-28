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
