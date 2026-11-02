# POO_Taller-P-H.I-A-

# RETOS

1. Error Generado:

   Error que genera: Vehiculo is abstract; cannot be instantiated

   Ocurre porque definimos a Vehiculo como una clase abstract en la Etapa 3. Las clases abstractas sirven como plantillas genéricas para definir una jerarquía, por lo que Java prohíbe crear objetos directos (instancias) de ellas, ya que están incompletas (por ejemplo, tienen métodos abstractos sin cuerpo como tarifaPorKm()).

2. Sobrecarga o Sobreesccritura:

   Es una sobrecarga (overloading). Ocurre dentro de la misma clase Vehiculo al tener dos métodos con el mismo nombre pero diferentes parámetros (double km vs double km, boolean urgente). La sobrescritura (overriding), en cambio, ocurre cuando una clase hija redefine un método heredado exactamente con la misma firma.

3. ¿Qué cambió en la salida? Al mostrar la flota, la bicicleta ya no dirá , bicicleta eléctrica. al final. Imprimirá únicamente su placa y capacidad (ej: BIC001 (10 kg)).

  ¿Por qué compiló? Compiló porque al cambiar el nombre a describr, Java ya no lo vio como un intento de sobrescribir el método de la clase padre, sino como un método nuevo     y exclusivo de la clase Bicicleta que simplemente nunca fue llamado.

  
# PREGUNTAS:

1. ¿Por qué Bicicleta funcionó en mostrar() y en masEconomico() sin cambiar una sola línea de Flota?

Funcionó gracias al polimorfismo y al diseño basado en la superclase Vehiculo. La clase Flota almacena una lista de tipo genérico (ArrayList<Vehiculo>). Como Bicicleta hereda de Vehiculo, Java la reconoce automáticamente como un vehículo más, permitiendo recorrerla con mostrar() usando la ligadura dinámica y evaluar sus datos con métodos heredados como getCapacidadKg() y tarifaPorKm() en masEconomico().

2. ¿Por qué Vehiculo es abstracta y Moto no? ¿Qué pasaría si Moto también lo fuera?

Vehiculo es abstracta porque representa un concepto general y compartido del cual no tiene sentido crear un objeto directo sin conocer su tarifa específica. En cambio, Moto es concreta porque representa un tipo de vehículo completo y listo para ser instanciado. Si Moto también fuera abstracta, Java prohibiría crear objetos directos de ella (new Moto(...)) y solo se podrían instanciar clases hijas que extendieran de la misma.

3. ¿Por qué Bodega implementa Asegurable pero no hereda de Vehiculo?

Porque una bodega no es un vehículo (no tiene ruedas, motor, placa ni transporta carga), por lo que heredar de Vehiculo rompería la lógica del mundo real y el principio de sustitución. Sin embargo, comercialmente sí es asegurable. Las interfaces permiten compartir un comportamiento específico (calcular un seguro) entre clases totalmente independientes.

4. ¿Qué diferencia hay entre super(placa, capacidadKg) y super.describir()?

super(placa, capacidadKg) se usa estrictamente dentro de los constructores para invocar el constructor de la superclase y asegurar que los atributos heredados se inicialicen correctamente. Por otro lado, super.describir() se usa dentro de un método sobrescrito (@Override) para invocar el método original del padre, permitiendo aprovechar su resultado base y añadirle información propia de la clase hija.

5. Cierre del curso: Explica con tus palabras qué es la POO y señala en tu código del taller un ejemplo de cada pilar: abstracción, encapsulamiento, herencia y polimorfismo.

La Programación Orientada a Objetos (POO) es un paradigma que organiza el código en torno a "objetos" que combinan datos y comportamientos, facilitando la modularidad y reutilización. Sus pilares en el proyecto se reflejan así:

Abstracción: Definir la clase Vehiculo como abstract y declarar el método abstracto tarifaPorKm().

Encapsulamiento: Proteger los atributos con modificadores privados (private String placa;) y exponerlos mediante métodos de acceso públicos (getters).

Herencia: Hacer que Moto, Camion y Bicicleta extiendan de Vehiculo (extends) para reutilizar atributos y métodos comunes.

Polimorfismo: Permitir que Flota gestione diferentes tipos de vehículos de forma genérica ejecutando dinámicamente el comportamiento de la subclase real.
