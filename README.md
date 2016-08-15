# Kotlin Practice Code

## Compiling on Command Line

To compile a single Kotlin file:

`$ kotlinc [filename].kt`

To compile and create a runnable .jar file:

`$ kotlinc [filename].kt -include-runtime -d [executablename].jar`

To run the application:

`$ java -jar [executablename].jar`

## Note on member function overriding (inheritance)

By default, all member functions to a class are `final` (aka they cannot be overriden). To allow a function to be overriden, you **must** declare it `open`.

In a derived class, to override a function, you must use the `override` keyword.

Furthermore, `override` will allow that function to be overriden by a further subclass (aka it becomes `open` by default). To prevent this, you must specify `final` with `override`. An example:

```kotlin
open class Base {
    // Can be overriden
    open fun foo () {}

    // Cannot be overriden
    fun bar () {}
}

class Derived() : Base() {
    // Specifies this is an overriden function
    // that can be overriden by any subclass
    override fun foo () {}
}

class AnotherDerived() : Base() {
    // Specifies this is an overriden function
    // But cannot be overriden by any subclass
    final override fun foo() {}
}
