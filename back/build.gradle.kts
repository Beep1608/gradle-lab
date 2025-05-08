plugins{
    application
}

dependencies{

}


java { 
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application{
    mainModule = "nns"
    mainClass = "io.nns.Main"
}