# SL-Cucumber-JVM examples

Examples of using SL with Cucumber tests and different testing frameworks.

## Build types
Any example project may be built individually. 
 
All examples may be built all together from the root project.

By default the example projects are built without sealights.

## Build with sealights
Similar to a regular build, the build with sealights may be done for all the examples together
 or to a single example. 
 
When all the examples are built together the same application name is used for all the projects. 
 
When a single example is built, its own application name is used.

For both plugins all the plugin parameters are defined in the root project and they are inherited by 
the examples.

Each example redefines the **appName** plugin parameter.

## Maven examples

### Profiles
1. The default profile executes just a regular build without sealights plugin.
 The maven command is executed in the same way for either root project or any sub-project.
2. The profile **'sl'** executes a build of a sub-project as an individual application. 
It is intended for a subproject build and so is not effective if applied to the root project.
See the Examples section for usage.
3. The profile **'sl-all'** executes a build of all sub-projects with the same application name. 
It is intended for root recursive build of the root project. 
When it is applied to the sub-project, it works same as the **'sl'** profile.
See the Examples section for usage.

### Pom Settings
There are several properties to be set in the root pom:
1. The property `tokenfile.path` should be set to the relevant token file location.
2. The property `buildscanner.path` should be set to the actual path to the build-scanner jar.
3. The property `testlistener.path` should be set to the actual path to the test-listener jar.

### Sealigts Plugin Parameters
1. The Sealigts plugin parameters are defined in the root project pom; the sub-projects poms by default contain only **appName** parameter.
2. Parameter, which is defined in the sub-project, overrides the parameter in the root project.
3. When running build with profiles _'sl'_ or _'sl-all'_  the build number should be provided as system property
 _'-Dsl.build={build value}'_ .

### Examples
1. Build all projects as a single application. Run from the root project directory:

       mvn clean install -Psl-all -Dsl.build=12345
2. Build a particular project from the root project directory:

       mvn clean install -f example-java8 -Psl -Dsl.build=12345  
       
3. Build a particular project from the project directory:
   
       mvn clean install -Psl -Dsl.build=12345  
   
**Build with Gradle so far is not supported**