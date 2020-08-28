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
