name := "nlcodestare-issue-74"

version := "0.1"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  "com.beachape" %% "enumeratum" % "1.6.1"
)

lazy val root = (project in file("."))
  .settings(
    // Include the package(s) of the classes here, and make sure to import your typescript conversions
    typescriptGenerationImports := Seq("models.TypescriptExports._", "models.MapMode", "models.FunkyMapMode", "models.CaseClass", "models.FunkyMapModeDuplicateExport"),
    // The classes that you want to generate typescript interfaces for
    typescriptClassesToGenerateFor := Seq("FunkyMapMode", "CaseClass"),
    // The output file which will contain the typescript interfaces
    typescriptOutputFile := baseDirectory.value / "models.ts"
  )
