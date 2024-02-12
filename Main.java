public class Main {
    public static void main(String[] args) {
        Plataforma nintendoSwitch = new Plataforma("Nintendo Switch", "Nintendo", 2017, new String[]{"NVIDIA Tegra X1", "4GB RAM", "32GB Storage"});
        Plataforma wiiU = new Plataforma("Wii U", "Nintendo", 2012, new String[]{"IBM PowerPC", "2GB RAM", "8GB Storage"});
        Videojuego media = new Videojuego("The Legend of Zelda: Breath of the Wild", 2017, new String[]{"Action", "Adventure"}, "Hidemaro Fujibayashi", new Plataforma[]{nintendoSwitch, wiiU}, "Nintendo EPD", "Nintendo");
        System.out.println(nintendoSwitch.printPlataforma());
        System.out.println(media.printVideojuego());
        holaMundo();
        Main m = new Main();
        m.holaMundoNoStatic();
        String nombre = "Franco";//tipo de dato por referencia
        System.out.println(nombre.toUpperCase());//tiene metodos
        //m.saludar(nombre);
        Integer numero = 10;//tipo de dato por referencia
        int numeroPrimitivo = 10;//tipo de dato primitivo
        System.out.println(numero.doubleValue()+"El nombre en mayuscula es: "+nombre.toUpperCase());//concatenacion
        var nombreVar = "Franco";//inferencia de tipos de datos como javascript
        var numeroVar = 10;
        System.out.println("nombreVar = " + nombreVar +" "+ "numeroVar = " + numeroVar);
        modeable(media);
    }

    

    public static void holaMundo() { //static no necesita una instancia de la clase para ser llamado
        System.out.println("Hola Mundo");
    }

    public void holaMundoNoStatic() {
        System.out.println("Hola Mundo");
    }

    public void saludar(String nombre) {
        System.out.println("Hola " + nombre);
    }

    public static void modeable(Modeable modeable){
        System.out.println(modeable.estoyModeado());

    }
}
