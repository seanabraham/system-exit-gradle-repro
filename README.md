This is a project which exists to repro an issue with running JUnit tests with Gradle. When the code being tested calls System.exit, it kills the test JVM. What's worse, demonstrated in this repo, is that if System.exit(0) is called, the test JVM is cleanly killed, and Gradle reports a successful build even though we may have never executed many of the tests we intended too.



Observed behavior - The tests stop running and the build is successful after the first System.exit(0) call is reached.
```
❯ ./gradlew cleanTest test

> Task :test

me.seanabraham.AppTest > fakeTest STANDARD_OUT
    Hi

me.seanabraham.AppTest > testAppHasAGreeting STANDARD_OUT
    Doing a thing!

BUILD SUCCESSFUL in 1s
```


Ideal behavior -- All tests execute or an error is raised failing the build when System.exit is called
