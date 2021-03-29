�Qu� es Maven?

Maven es una herramienta de build, posiblemente la m�s utilizada en la actualidad en el mundo Java.

Una herramienta de build es una herramienta que nos permite �Buildear� un proyecto. �Buildear� (ejecutar un proceso de Build) implica ejecutar un conjunto de tareas las cuales pueden variar dependiendo de cada proyecto. En el caso m�s b�sico el proceso de build implica tan solo compilar. En casos m�s avanzados el build implica ejecutar algunas otras tareas como ser resoluci�n de dependencias (previa a la compilaci�n)., verificaci�n de est�ndares de codificaci�n, ejecuci�n de pruebas automatizadas, generaci�n de binarios, etc. 



�POM que significa y para que nos sirve?

Un modelo de objeto de proyecto o POM es la unidad fundamental de trabajo en Maven.�Es un archivo XML que contiene informaci�n sobre el proyecto y los detalles de configuraci�n utilizados por Maven para construir el proyecto.�Contiene valores predeterminados para la mayor�a de los proyectos.�Ejemplos de esto es el directorio de compilaci�n, que es�target;�el directorio de origen, que es�src/main/java;�el directorio de origen de la prueba, que es�src/test/java;�etc�tera.�Al ejecutar una tarea u objetivo, Maven busca el POM en el directorio actual.�Lee el POM, obtiene la informaci�n de configuraci�n necesaria y luego ejecuta el objetivo.
Algunas de las configuraciones que se pueden especificar en el POM son las dependencias del proyecto, los complementos o objetivos que se pueden ejecutar, los perfiles de compilaci�n, etc.�Tambi�n se puede especificar otra informaci�n, como la versi�n del proyecto, la descripci�n, los desarrolladores, las listas de correo, etc
.


Diferencia entre Archetype y ArtifacId.

      Maven utiliza el t�rmino artifact para denominar a la unidad m�nima que maneja en su repositorio. Puede ser por ejemplo un jar, un rae, un zip, etc. Cuando Maven compila y empaqueta c�digo, produce tambi�n artifacts que instala en el repositorio. Los artifacts est�n agrupados bajo el id de grupo (groupId) y tienen un id propio (artifactId)
      En cambio, un Archetype es un conjunto de herramientas de creaci�n de plantillas de proyectos de Maven.�Un arquetipo se define como�un patr�n o modelo original a partir del cual se hacen todas las dem�s cosas del mismo tipo.�Los nombres encajan ya que estamos tratando de proporcionar un sistema que proporcione un medio consistente para generar proyectos Maven.�Archetype ayudar� a los autores a crear plantillas de proyectos de Maven para los usuarios y les proporcionar� los medios para generar versiones parametrizadas de esas plantillas de proyectos.



Goals de Maven [clean, package, install, compile]

Los Goals de Maven son las unidades m�nimas de ejecuci�n de las que disponemos durante su uso. Los goals pueden programarse en diferentes lenguajes, pero en la pr�ctica est�n la mayor�a programados en Java. No es com�n que como usuario se piense en programar un goal. Un grupo de goals conforman un plugin

Algunos de los goals de Maven son:
* clean: Limpia los artefactos creados por compilaciones anteriores.
* package: Toma el c�digo compilado y lo empaqueta en un formato distribuible, como un JAR.
* install: Instala el paquete en el repositorio local para usarlo como dependencia en otros proyectos de forma local.
* compile: Compila el c�digo fuente del proyecto



Scopes [Compile, provide, runtime, test, system]


      Scope se refiere a la ruta de clase de la tarea en cuesti�n (compilaci�n y tiempo de ejecuci�n, pruebas, etc.), as� como a c�mo limitar la transitividad de una dependencia. Hay cinco osciloscopios disponibles:

      Compilar: este es el �mbito predeterminado, que se utiliza si no se especifica ninguno. Las dependencias de compilaci�n est�n disponibles en todas las rutas de clases. Adem�s, esas dependencias se propagan a proyectos dependientes.
      Proporcionado: esto es muy parecido a la compilaci�n, pero indica que espera que el JDK o un contenedor lo proporcione en tiempo de ejecuci�n. Solo est� disponible en la ruta de clases de compilaci�n y prueba, y no es transitivo.
      Runtime: este �mbito indica que la dependencia no es necesaria para la compilaci�n, sino para la ejecuci�n. Est� en el tiempo de ejecuci�n y en las rutas de clases de prueba, pero no en la ruta de clases de compilaci�n.
      Test: este alcance indica que la dependencia no es necesaria para el uso normal de la aplicaci�n y solo est� disponible para las fases de compilaci�n y ejecuci�n de la prueba. No es transitivo.
      System: este alcance es similar al proporcionado, excepto que debe proporcionar el JAR que lo contiene expl�citamente. El artefacto siempre est� disponible y no se busca en un repositorio.
