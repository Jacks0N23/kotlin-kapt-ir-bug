
// doesn't even building
/**
 * /Users/a.guzenko/IdeaProjects/kotlin-kapt-ir-bug/src/main/kotlin/Main.kt:2: error: cannot find symbol
 * // doesn't even building
 * ^
 *   symbol: class Function2
 *
 * FAILURE: Build failed with an exception.
 */
interface SomeInterface : suspend (List<String>, Boolean) -> List<Int>


// delete above and uncomment below to fix building
//interface SomeInterface {
//
//    suspend operator fun invoke(p1: List<String>, p2: Boolean): List<Int>
//}



fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}