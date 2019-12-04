# cg-referee-ghost-in-the-cell
A compatible referee for [cg-brutaltester](https://github.com/dreignier/cg-brutaltester/)

If you want to use it with recent versions of brutal tester make sure to provide the option `-o` (old mode) to it. You may either build a jar or a native image and provide either one of those to brutal tester. 

## Build native image (Option 1)
Run `./gradlew nativeImage` to create a native file that can be executed directly. File will be written to `build/graal/cg-refree-ghost-in-the-cell`.

**Hint**: As of now you must use JDK 1.8 (no JDK 9,10,...!) to compile the sources, otherwise the graaljvm-gradle-plugin will complain about class file version conflicts.

## Build jar (Option 2)
Run `./gradlew jar` to create a jar file which will be written to `build/libs/cg-refree-ghost-in-the-cell.jar`.
