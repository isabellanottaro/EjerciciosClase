public class TiposDeVariables {

    public static void main(String[] args) {

        // ==============================
        // Introducción
        // ==============================
        // Este fichero Java contiene VARIOS ejercicios básicos.
        // Para cada ejercicio, tenéis que hacer lo que indica.
        // Conforme vayáis haciendo ejercicios, cada vez que lo ejecutéis
        // ejecutará de nuevo todos los anteriores, pero está correcto (no borréis
        // los ejercicios ya hechos).

        // ==============================
        // EJERCICIO 1 – Ficha de personaje (Minecraft)
        // ==============================
        // Crea variables con el nombre del jugador, nivel, vida (double)
        // y si tiene armadura (boolean). Imprímelas como si fuese una ficha del jugador.


        String nombreJugador = "PacoFiestas" ;
        long nivel = 31321984;
        double vida = 20.0;
        boolean tieneArmadura = true;

        System.out.println("La Ficha de Jugador es: "
                + "Nombre: " + nombreJugador +
                " , tiene nivel: " + nivel
                + " y su vida es " + vida
                + " y tiene armadura? " + tieneArmadura);


        // ==============================
        // EJERCICIO 2 – Batalla rápida (Pokémon)
        // ==============================
        // Declara dos variables con el ataque de Pikachu y la defensa de Charmander.
        // Calcula el daño causado (ataque – defensa).
        // Imprime el resultado: "Pikachu hace X puntos de daño a Charmander" - X es el valor real del daño.

        long ataquePikachu = 50;
        long defensacharmander = 30;
        long daño = ataquePikachu-defensacharmander;
        System.out.println(" Pikachu quita a charmander " + daño  + " puntos de vida " );



        // ==============================
        // EJERCICIO 3 – Monedas y compras (Fortnite)
        // ==============================
        // Declara una variable con el número de V-Bucks que tiene un jugador.
        // Resta el precio de una skin (ej: 1200).
        // Imprime el resultado: "Después de comprar la skin, te quedan X V-Bucks".

        String nombrejugador = "Cazorla" ;
        long Pavos= 3200;
        long skin= 1200;
        long PavosRestantes= (Pavos-skin);
        String pavos = " VBucks " ;
        System.out.println( "Después de comprar a Frozono, te quedan: " + PavosRestantes + pavos + nombrejugador );

        // ==============================
        // EJERCICIO 4 – Velocidad de campeón (League of Legends)
        // ==============================
        // Declara una variable con la velocidad base de un campeón
        // y otra con un buff de velocidad.
        // Calcula la velocidad final sumando ambos valores.
        // Imprime el resultado: "La velocidad final de Jinx es X".

        long VelocidadYone= 345;
        long BotasVelocidad=150;
        long VelocidadNuevaYone= (VelocidadYone+BotasVelocidad);
        System.out.println(" La velocidad final de Yone es " + VelocidadNuevaYone );


        // ==============================
        // EJERCICIO 5 – Conversor de monedas de juego
        // ==============================
        // Declara una cantidad de monedas de Minecraft.
        // Convierte a su equivalente en V-Bucks y en RP de LoL
        // usando tasas de cambio inventadas (ej: 1 moneda MC = 5 V-Bucks = 2 RP).
        // Imprime el resultado en formato claro.


        // ==============================
        // EJERCICIO 6 – Clasificación de jugador (Fortnite / LoL)
        // ==============================
        // ESTE EJERCICIO INCLUYE SENTENCIAS DE CONTROL. No pertenece a tipos de variables.
        // Si te aburres, investiga cómo se haría y entiéndelo.
        //
        // Declara variables con el número de kills, muertes y asistencias de una partida.
        // Calcula el KDA = (kills + asistencias) / muertes.
        // Según el resultado:
        //   KDA ≥ 5        → "Jugador PRO"
        //   KDA entre 3–5  → "Jugador BUENO"
        //   KDA entre 1–3  → "Jugador NORMAL"
        //   KDA < 1        → "Jugador NOOB"
        //
        // OPCIONAL: muestra también el tier en el que quedaría (Bronce, Plata, Oro, Platino…).

    }
}
