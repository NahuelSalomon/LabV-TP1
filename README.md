¿Qué es Maven?

Maven es una herramienta de build, posiblemente la más utilizada en la actualidad en el mundo Java.

Una herramienta de build es una herramienta que nos permite “Buildear” un proyecto. “Buildear” (ejecutar un proceso de Build) implica ejecutar un conjunto de tareas las cuales pueden variar dependiendo de cada proyecto. En el caso más básico el proceso de build implica tan solo compilar. En casos más avanzados el build implica ejecutar algunas otras tareas como ser resolución de dependencias (previa a la compilación)., verificación de estándares de codificación, ejecución de pruebas automatizadas, generación de binarios, etc. 



¿POM que significa y para que nos sirve?

Un modelo de objeto de proyecto o POM es la unidad fundamental de trabajo en Maven. Es un archivo XML que contiene información sobre el proyecto y los detalles de configuración utilizados por Maven para construir el proyecto. Contiene valores predeterminados para la mayoría de los proyectos. Ejemplos de esto es el directorio de compilación, que es target; el directorio de origen, que es src/main/java; el directorio de origen de la prueba, que es src/test/java; etcétera. Al ejecutar una tarea u objetivo, Maven busca el POM en el directorio actual. Lee el POM, obtiene la información de configuración necesaria y luego ejecuta el objetivo.
Algunas de las configuraciones que se pueden especificar en el POM son las dependencias del proyecto, los complementos o objetivos que se pueden ejecutar, los perfiles de compilación, etc. También se puede especificar otra información, como la versión del proyecto, la descripción, los desarrolladores, las listas de correo, etc
.


Diferencia entre Archetype y ArtifacId.

      Maven utiliza el término artifact para denominar a la unidad mínima que maneja en su repositorio. Puede ser por ejemplo un jar, un rae, un zip, etc. Cuando Maven compila y empaqueta código, produce también artifacts que instala en el repositorio. Los artifacts están agrupados bajo el id de grupo (groupId) y tienen un id propio (artifactId)
      En cambio, un Archetype es un conjunto de herramientas de creación de plantillas de proyectos de Maven. Un arquetipo se define como un patrón o modelo original a partir del cual se hacen todas las demás cosas del mismo tipo. Los nombres encajan ya que estamos tratando de proporcionar un sistema que proporcione un medio consistente para generar proyectos Maven. Archetype ayudará a los autores a crear plantillas de proyectos de Maven para los usuarios y les proporcionará los medios para generar versiones parametrizadas de esas plantillas de proyectos.



Goals de Maven [clean, package, install, compile]

Los Goals de Maven son las unidades mínimas de ejecución de las que disponemos durante su uso. Los goals pueden programarse en diferentes lenguajes, pero en la práctica están la mayoría programados en Java. No es común que como usuario se piense en programar un goal. Un grupo de goals conforman un plugin

Algunos de los goals de Maven son:
* clean: Limpia los artefactos creados por compilaciones anteriores.
* package: Toma el código compilado y lo empaqueta en un formato distribuible, como un JAR.
* install: Instala el paquete en el repositorio local para usarlo como dependencia en otros proyectos de forma local.
* compile: Compila el código fuente del proyecto



Scopes [Compile, provide, runtime, test, system]


      Scope se refiere a la ruta de clase de la tarea en cuestión (compilación y tiempo de ejecución, pruebas, etc.), así como a cómo limitar la transitividad de una dependencia. Hay cinco osciloscopios disponibles:

      Compilar: este es el ámbito predeterminado, que se utiliza si no se especifica ninguno. Las dependencias de compilación están disponibles en todas las rutas de clases. Además, esas dependencias se propagan a proyectos dependientes.
      Proporcionado: esto es muy parecido a la compilación, pero indica que espera que el JDK o un contenedor lo proporcione en tiempo de ejecución. Solo está disponible en la ruta de clases de compilación y prueba, y no es transitivo.
      Runtime: este ámbito indica que la dependencia no es necesaria para la compilación, sino para la ejecución. Está en el tiempo de ejecución y en las rutas de clases de prueba, pero no en la ruta de clases de compilación.
      Test: este alcance indica que la dependencia no es necesaria para el uso normal de la aplicación y solo está disponible para las fases de compilación y ejecución de la prueba. No es transitivo.
      System: este alcance es similar al proporcionado, excepto que debe proporcionar el JAR que lo contiene explícitamente. El artefacto siempre está disponible y no se busca en un repositorio.
