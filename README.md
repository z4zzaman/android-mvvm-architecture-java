# android-mvvm-architecture-java
It's a MVVM architecture project.
The project contains an example of the Model-View-ViewModel pattern used together with RxJava.

The DataModel provides supported languages and also retrieval of the greeting based on the language. The ViewModel exposes greetings and supported languages as stream of events through RxJava Observables. The ViewModel also allows setting the selected language. The View is an Activity that contains a Spinner with the supported languages and a text view that displays a greeting, based on the selected language.

![Model-View-ViewModel](https://github.com/florina-muntenescu/DroidconMVVM/blob/readme/screenshots/mvvm.png?raw=true)
