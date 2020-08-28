export type FunkyMapMode = (IMAP | ILIST | IDOCUMENT)

export interface ICaseClass {
  mode: MapMode
}

export interface IDOCUMENT {

}

export interface ILIST {

}

export interface IMAP {

}

export type MapMode = ("MAP" | "LIST" | "DOCUMENT")
