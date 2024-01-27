package org.example._2023_12_09;

import java.util.HashMap;

public class ST {
    public static void main(String[] args) {
        String text = "No hace falta gastar una inmensa suma " +
                "para tener un buen smartphone que nos acompañe durante años y " +
                "nos permita llevar a cabo las tareas del día a día. Hoy quiero hablarte " +
                "de uno de los móviles de realme, un dispositivo que puedes llevarte a " +
                "casa ahora mismo por menos de 200 euros. Y lo mejor es que tiene justo " +
                "lo que necesitas.\n" +
                "El realme 10 se ha desplomado en Amazon, está a tu alcance por solo 199 " +
                "euros en su versión global, a la que acompañan 8 GB de RAM y 128 GB de " +
                "almacenamiento. Además, si eres usuario de Amazon Prime no tendrás que " +
                "pagar absolutamente nada por el envío, con la tienda norteamericana todo " +
                "es comodidad.";

        StringBuffer sb = new StringBuffer();

        for (int i = text.length() - 1; i >= 0; i--) {
            sb.append(text.charAt(i));
        }

        System.out.println(sb);
    }
}
