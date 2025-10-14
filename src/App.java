public class App {
    
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static void main(String[] args) throws Exception {
        try {
            System.out.printf(
            """
            SISTEMA DE ANÁLISIS DE CALIFICACIONES
            =====================================
            """
            );
            System.out.print("Nombre del estudiante: ");
            String nombre = System.console().readLine();

            System.out.print("Calificación numérica (0-100): ");
            int calif = Integer.parseInt(System.console().readLine());
            String cualitativa = "";
            if (calif >= 0 && calif < 50) cualitativa = "Suspenso";
            else if (calif < 60) cualitativa = "Suficiente";
            else if (calif < 70) cualitativa = "Bien";
            else if (calif < 90) cualitativa = "Notable";
            else if (calif <= 100) cualitativa = "Sobresaliente";
            else cualitativa = "Error en la calificación";

            String estado = calif >= 50 ? "APROBADO" : "SUSPENSO";

            System.out.print("Asignatura (Matemáticas, Programación, Historia)");
            String asig = System.console().readLine();

            System.out.print("¿Es evaluación final? (s/n): ");
            String evalFin = System.console().readLine();


            System.out.printf(
            """
            RESULTADOS DEL ANÁLISIS
            =======================
            Estudiante: %-36s Asignatura: %s
            Calificación numérica: %-36d/100 Calificación cualitativa: %s
            Estado: %-36s 
            """, nombre, asig, calif, cualitativa, estado
            );

        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return ;
        } catch (Exception e) {
            System.out.println("Unexpected error");
            return;
        }

    }
}
