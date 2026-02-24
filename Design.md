classDiagram
    class Especialista {
        <<interface>>
        +reparar()
    }

    class Mecanico {
        +reparar()
    }
    Especialista <|.. Mecanico : implementa

    class Vehiculo {
        <<abstract>>
        +String matricula
        +String modelo
    }

    class Coche {
        +int numPuertas
    }

    class Moto {
        +boolean tieneSidecar
    }

    Vehiculo <|-- Coche : es un
    Vehiculo <|-- Moto : es un

    class Cliente {
        +String nombre
        +String dni
    }
    Cliente "1" o-- "1..*" Vehiculo : posee

    class Reparacion {
        +Date fecha
        +String descripcion
        +double coste
    }
    Vehiculo "1" *-- "0..*" Reparacion : historial (vínculo fuerte)

    class Taller {
        +asignarReparacion(Vehiculo v, Mecanico m)
    }

    Taller ..> Mecanico : usa (dependencia)
    Taller ..> Reparacion : crea

## Herencia: Coche y Moto heredan la clase Vehículo, ya que, comparten atributos.

## Interfaz: Mecánico implementa Especialista, cumpliendo contrato del método reparar().

## Agregación: La relación de Cliente y Vehículo es de agregación (rombo vacío), un cliente posee vehículos, pero estos tienen identidad propia, y podrían existir o pasar a otro dueño de forma independiente.

## Composición:La relación entre vehículo y reparación es de composición (rombo relleno) es un vínculo fortalecido, ya que, una reparación no tendría sentido sin un vehículo.

## Dependencia: La clase Taller tiene una dependencia puntual con Mecánico al recibirlo como parámetro para realizar una acción, pero no la posee de forma permanente.