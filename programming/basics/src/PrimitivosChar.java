public class PrimitivosChar {
    public static void main(String[] args) {
        char symbol = '@';
        char code = '\u0040';
        char decimal = 64;
        System.out.println("symbol = " + symbol);
        System.out.println("code = " + code);
        System.out.println("decimal = " + decimal);
        System.out.println("symbol = code: " + (symbol == code));


        char space = ' ';
        char backspace = '\b'; // borra un caracter
        char tab = '\t'; // añade un tabulador (4 espacios vacios)
        char newline = '\n'; // Inserta una nueva linea

        System.out.println("text" + newline + "hola");
    }
}
