# java-webservice


Create a web service 
JAX-WS web service in eclipse 

JDK 1.8
Eclipse IDE

STEPS

1) Open Eclipse IDE
2) Create Java Project named "WebServerAp"
     On JRE: Chose (Use an Execution environment JRE: JavaSE-1.8/JavaEE-1.8) / whichever you have.
     Click finish 
     Create package named "com.mwendapeter.gmail.webserver"
     Create an interface named "AppAddNum"
     Create a class named "AddNum" to implemet the interface
     Create a class name "AddNumPublisher" to publish the interface

3) Create Java Project named "WebClientApp"  
   Run the class  "AddNumPublisher"
   Open terminal and cd to the "workspace/AddNumPublisher/src"
   Type the following "wsimport -s . http://localhost:8080/APP/AddNum?wsdl"
   This will generate some classes in the following package
     "com.mwendapeter.gmail.webserver"
    Create a package "com.mwendapeter.gmail.webserver.client"  
    Create a class named "AddClient"
    Run the class "AddClient"

    Done!

    See the source code here : 