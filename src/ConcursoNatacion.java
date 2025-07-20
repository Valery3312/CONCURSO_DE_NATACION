import java.util.*; //// Importa todas las clases del paquete java.util (como Scanner y ArrayList)
public class ConcursoNatacion {
    // Lista global para almacenar todos los participantes registrados
    static List<Participante> participantes = new ArrayList<>();
    // Objeto Scanner para leer la entrada del usuario desde consola
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        // Menú principal que se repite hasta que el usuario elige salir (opción 0)
        do {
            System.out.println("\n--- Concurso de Natación ---");
            System.out.println("1. Registrar participante");
            System.out.println("2. Ver todos los participantes");
            System.out.println("3. Ver participantes aptos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt(); // Lee la opción numérica
            sc.nextLine(); // Limpia el buffer del scanner (evita errores al leer texto después de números)

            switch (opcion) {
                case 1: registrarParticipante(); break; // Muestra todos los participantes
                case 2: mostrarParticipantes(false); break; // Muestra todos los participantes
                case 3: mostrarParticipantes(true); break; // Muestra solo los participantes aptos
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción inválida."); // Validación si la opción no es reconocida
            }
        } while (opcion != 0); // Repite el menú hasta que se elija salir
    }
    // Método que permite registrar un nuevo participante
    public static void registrarParticipante() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt(); sc.nextLine();
        System.out.print("Género: ");
        String genero = sc.nextLine();
        System.out.print("¿Condición de salud buena? (true/false): ");
        boolean salud = sc.nextBoolean(); sc.nextLine();

        // Selección del tipo de entidad a la que pertenece el participante

        System.out.println("Tipo de entidad: - INGRESE UN NPUMERO ENTRE 1 Y 4 DE LAS OPCIONES: \n1. Colegio\n2. Universidad\n3. Empresa\n4. Sindicato");
        int tipo = sc.nextInt(); sc.nextLine();

        Participante p = null; // Se declara el participante que se va a crear

        // Según el tipo, se instancia la subclase correspondiente
        switch (tipo) {
            case 1:
                System.out.print("Nombre del colegio: ");
                p = new ParticipanteColegio(nombre, edad, genero, salud, sc.nextLine());
                break;
            case 2:
                System.out.print("Nombre de la universidad: ");
                p = new ParticipanteUniversidad(nombre, edad, genero, salud, sc.nextLine());
                break;
            case 3:
                System.out.print("¿Empresa pública o privada?: ");
                String tipoEmp = sc.nextLine();
                System.out.print("Nombre de la empresa: ");
                String nomEmp = sc.nextLine();
                p = new ParticipanteEmpresa(nombre, edad, genero, salud, tipoEmp, nomEmp);
                break;
            case 4:
                System.out.print("Tipo de sindicato: ");
                p = new ParticipanteSindicato(nombre, edad, genero, salud, sc.nextLine());
                break;
            default:
                System.out.println("Opción inválida."); // Validación si el tipo de entidad no es válido
        }
        // Si el participante fue creado correctamente, se añade a la lista
        if (p != null) {
            participantes.add(p);
            System.out.println("Participante registrado.");
        }
    }

    // Método para mostrar participantes
    // Si soloAptos es true, se muestran solo los que cumplen condiciones para participar
    public static void mostrarParticipantes(boolean soloAptos) {
        System.out.println("\n--- Lista de Participantes ---");
        for (Participante p : participantes) {
            // Si soloAptos es false, se muestran todos. Si es true, solo los aptos
            if (!soloAptos || p.puedeParticipar()) {
                System.out.println(p.getInfo() + (p.puedeParticipar() ? " ✅" : " ❌"));
            }
        }
    }
}
