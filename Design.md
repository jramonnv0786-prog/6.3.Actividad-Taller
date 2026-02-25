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


    ----------------------------------------------
    DIAGRAMA CON CLASE FACTURA:


    classDiagram
    class Especialista {
        <<interface>>
        +reparar()
    }
    class Mecanico {
        +reparar()
    }
    Especialista <|.. Mecanico

    class Vehiculo {
        <<abstract>>
        +String matricula
        +String modelo
    }
    Vehiculo <|-- Coche
    Vehiculo <|-- Moto

    class Cliente {
        +String nombre
    }
    Cliente "1" o-- "1..*" Vehiculo

    class Reparacion {
        +Date fecha
        +double coste
    }
    Vehiculo "1" *-- "0..*" Reparacion

    %% NUEVA CLASE
    class Factura {
        -String numeroFactura
        -double importeTotal
        +imprimirFactura()
    }
    Reparacion "1" -- "1" Factura : genera

