# Kotlin Practice Code

## Compiling on Command Line

To compile a single Kotlin file:

`$ kotlinc [filename].kt`

To compile and create a runnable .jar file:

`$ kotlinc [filename].kt -include-runtime -d [executablename].jar`

To run the application:

`$ java -jar [executablename].jar`
