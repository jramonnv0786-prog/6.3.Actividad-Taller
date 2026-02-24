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

