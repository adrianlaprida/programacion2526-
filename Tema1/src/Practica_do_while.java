import java.util.Scanner;

public class Practica_do_while {
    public void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        final String CONT = "contraseña";
        System.out.println("Dime tu contraseña");


        String passwordUsuario ="";

        do {
            System.out.println("Introduce una contraseña correcta");
            passwordUsuario = teclado.nextLine();

        } while (!CONT.equals(passwordUsuario));{
        System.out.println("Tu contraseña es correcta");
        }
    }
}
