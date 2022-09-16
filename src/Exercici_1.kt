import java.io.File
import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val file = File.listRoots()[0]
    var indice = 1

    println("Lista de ficheros y directorios de: $file")
    println("-----------------------------------------")
    val arrayFiles = file.listFiles()
    for (i in arrayFiles.indices) {
        if (arrayFiles[i].isDirectory) {
            println(indice.toString() + ". " + arrayFiles[i] + " <directory>")
        }
        if (arrayFiles[i].isFile) {
            println(indice.toString() + ". " + arrayFiles[i] + " <file> " + file.length() + " bytes.")
        }
        indice++
    }
    println("Introduce un numero")
    var opcion = sc.nextInt()
    var listaArchivos = arrayFiles[opcion - 1].listFiles()
    while (opcion != -1) {
        var indice = 1
        for (l in listaArchivos) {
            if(l.isDirectory){
                println(indice.toString() + ". " + l + "<directory>")
            }
            if (l.isFile){
                println(indice.toString() + ". " + l + "<file>" + l.length() + " bytes.")
            }
            indice++
        }
        println("Introduce un numero")
        opcion = sc.nextInt()
    }
}




