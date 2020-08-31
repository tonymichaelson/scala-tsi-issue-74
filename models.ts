export type FunkyMapMode = ("MAP" | "LIST" | "DOCUMENT")

export interface ICaseClass {
  mode: MapMode
}

export interface IFunkyMapModeDuplicateExport {
  mode: FunkyMapMode
}

export type MapMode = ("MAP" | "LIST" | "DOCUMENT")
