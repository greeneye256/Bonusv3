public class Main {

    public static void main(String[] args) {

        Csv cvs1 = new Csv("1,Ana,V,1994,ana@mail.com,Java","Id,Nume,Initiala Tatalui,Anul Nasterii,Email,Limbaj Programare");
        cvs1.printValueOfIndex(2);
        cvs1.printValueOfParameter("Nume");

    }

}
