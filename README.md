# POO_Taller-P-H.I-A-

# RETOS

1. Error Generado:

   Error que genera: Vehiculo is abstract; cannot be instantiated

   Ocurre porque definimos a Vehiculo como una clase abstract en la Etapa 3. Las clases abstractas sirven como plantillas genéricas para definir una jerarquía, por lo que Java prohíbe crear objetos directos (instancias) de ellas, ya que están incompletas (por ejemplo, tienen métodos abstractos sin cuerpo como tarifaPorKm()).

2. Sobrecarga o Sobreesccritura:

   Es una sobrecarga (overloading). Ocurre dentro de la misma clase Vehiculo al tener dos métodos con el mismo nombre pero diferentes parámetros (double km vs double km, boolean urgente). La sobrescritura (overriding), en cambio, ocurre cuando una clase hija redefine un método heredado exactamente con la misma firma.

3. ¿Qué cambió en la salida? Al mostrar la flota, la bicicleta ya no dirá , bicicleta eléctrica. al final. Imprimirá únicamente su placa y capacidad (ej: BIC001 (10 kg)).

  ¿Por qué compiló? Compiló porque al cambiar el nombre a describr, Java ya no lo vio como un intento de sobrescribir el método de la clase padre, sino como un método nuevo     y exclusivo de la clase Bicicleta que simplemente nunca fue llamado.
