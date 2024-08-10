# CSS Object Model Java binding

This repository contains Java bindings of the CSS Object Model intended for use
by the EchoSVG project.

<br/>

## Building from source

### Requirements

To build `cssom-api` you need the following software installed:

- The [Git version control system](https://git-scm.com/downloads) is required to
obtain the sources. Any recent version should suffice.

- Java 11 or later. You can install it from your favourite package manager or by
downloading from [Adoptium](https://adoptium.net/).

<br/>

### Building with Gradle

Execute the build script with `gradlew build` to build. For example:

```shell
git clone https://github.com/css4j/cssom-apis.git
cd cssom-apis
./gradlew build
```
or just `gradlew build` (without the `./`) on a Windows command prompt.

<br/>

### Deploying to a Maven repository

Use:

- `gradlew publishToMavenLocal` to install both modules in your local Maven repository.

- `gradlew :cssom-api:publishToMavenLocal` to install the cssom-api module into your local Maven repository.

- `gradlew :domview-api:publishToMavenLocal` to install the domview-api module into your local Maven repository.

- `gradlew publish` to deploy both modules to a (generally remote) Maven repository.

- `gradlew :cssom-api:publish` to deploy the cssom-api module to a Maven repository.

- `gradlew :domview-api:publish` to deploy the domview-api module to a Maven repository.

Before deploying to a remote Maven repository, please read the
`publishing.repositories.maven` block of
[cssom-apis.java-conventions.gradle](https://github.com/css4j/cssom-apis/blob/master/buildSrc/src/main/groovy/cssom-apis.java-conventions.gradle)
to learn which properties you need to set (like `mavenReleaseRepoUrl`or
`mavenRepoUsername`), either at the [command line](https://docs.gradle.org/current/userguide/build_environment.html#sec:project_properties)
(`-P` option) or your `GRADLE_USER_HOME/gradle.properties` file.

<br/>

## Usage from a Gradle project

If your Gradle project depends on any of the web-apis modules, you can use this
project's own Maven repository in a `repositories` section of your build file:

```groovy
repositories {
    maven {
        url "https://css4j.github.io/maven/"
        mavenContent {
            releasesOnly()
        }
        content {
            includeGroup 'io.sf.w3'
        }
    }
}
```
Then, in your `build.gradle` file you can list the dependencies, for example:

```groovy
dependencies {
    api 'io.sf.w3:cssom-api:0.1'
}
```

<br/>

##  Licensing

The source files and derived works are available under the "W3C Software and
Document Notice and License". Please read the [LICENSE.txt](LICENSE.txt) file
for details.
