package boletin16;

/**
 * Representa una publicación con un código, título y año de publicación.
 */
class Publicacion {
    private int codigo;
    private String titulo;
    private int anioPublicacion;

    /**
     * Constructor para la clase Publicacion.
     * 
     * @param codigo          El código de la publicación.
     * @param titulo          El título de la publicación.
     * @param anioPublicacion El año de publicación de la publicación.
     */
    public Publicacion(int codigo, String titulo, int anioPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
    }

    /**
     * Obtiene el código de la publicación.
     * 
     * @return El código de la publicación.
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Obtiene el año de publicación de la publicación.
     * 
     * @return El año de publicación de la publicación.
     */
    public int getAnio() {
        return anioPublicacion;
    }

    /**
     * Representación en cadena de la publicación.
     * 
     * @return La representación en cadena de la publicación.
     */
    @Override
    public String toString() {
        return "Código: " + codigo + ", Título: " + titulo + ", Año de Publicación: " + anioPublicacion;
    }
}

/**
 * Representa un libro que hereda de la clase Publicacion.
 */
class Libro extends Publicacion {
    private boolean prestado;

    /**
     * Constructor para la clase Libro.
     * 
     * @param codigo          El código del libro.
     * @param titulo          El título del libro.
     * @param anioPublicacion El año de publicación del libro.
     */
    public Libro(int codigo, String titulo, int anioPublicacion) {
        super(codigo, titulo, anioPublicacion);
        this.prestado = false; // Por defecto, un libro no está prestado al crearse.
    }

    /**
     * Verifica si el libro está prestado.
     * 
     * @return true si el libro está prestado, false de lo contrario.
     */
    public boolean isPrestado() {
        return prestado;
    }

    /**
     * Presta el libro.
     */
    public void prestar() {
        prestado = true;
    }

    /**
     * Devuelve el libro.
     */
    public void devolver() {
        prestado = false;
    }

    /**
     * Representación en cadena del libro.
     * 
     * @return La representación en cadena del libro.
     */
    @Override
    public String toString() {
        return super.toString() + ", Prestado: " + prestado;
    }
}

/**
 * Representa una revista que hereda de la clase Publicacion.
 */
class Revista extends Publicacion {
    private int numero;

    /**
     * Constructor para la clase Revista.
     * 
     * @param codigo          El código de la revista.
     * @param titulo          El título de la revista.
     * @param anioPublicacion El año de publicación de la revista.
     * @param numero          El número de la revista.
     */
    public Revista(int codigo, String titulo, int anioPublicacion, int numero) {
        super(codigo, titulo, anioPublicacion);
        this.numero = numero;
    }

    /**
     * Obtiene el número de la revista.
     * 
     * @return El número de la revista.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Representación en cadena de la revista.
     * 
     * @return La representación en cadena de la revista.
     */
    @Override
    public String toString() {
        return super.toString() + ", Número: " + numero;
    }
}

/**
 * Clase principal Biblioteca para demostrar el uso de las clases anteriores.
 */
public class Biblioteca {
    public static void main(String[] args) {
        Libro libro = new Libro(1, "El señor de los anillos", 1954);
        Revista revista = new Revista(2, "National Geographic", 2022, 123);

        System.out.println(libro.toString());
        System.out.println(revista.toString());
    }
}
