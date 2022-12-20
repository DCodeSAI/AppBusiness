package VIEW;

import DB.DB;
import MODEL.Business;

import java.util.Scanner;

public class MenuDePrueba {

    private Business business = new Business();
    private String nombreNegocio;
    private String horarios;
    private String numTelefonico;

    private String setUbication;

    private DB arrays = new DB();

    public MenuDePrueba (){
        this.menu();

    }

    public void addNegocio() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de su negocio");
        nombreNegocio = sc.nextLine();

        System.out.println("Ingrese el num telefonico de su negocio");
        numTelefonico = sc.nextLine();

        System.out.println("Ingrese el horario de su negocio");
        horarios = sc.nextLine();

        System.out.println("Ingrese la ubicación de su negocio");
        setUbication = sc.nextLine();


       business.setNameRestaurant(nombreNegocio);
       business.setHorarios(horarios);
       business.setNumTelefonico(Long.valueOf(numTelefonico));
       business.setUbication(setUbication);

       this.arrays.addIntoArraylist(business.getNameRestaurant(), business.getNumTelefonico(), business.getHorarios(), business.getUbication());

    }

    public void menu (){


     Scanner sc = new Scanner(System.in);
     int response;

        do {

            System.out.println("Bienvenido,que operación desea realizar");
            System.out.println("1. Agregar nuevo negocio");
            System.out.println("2. Ver negocios");
            System.out.println("0. Salir");

            response = sc.nextInt();

            switch (response){

                case 1:

                    this.addNegocio();
                    break;

                case 2:
                    this.arrays.showBussines();
                    break;

                case 0:
                    System.out.println("Saliendo del sistema");

                    break;
            }
     } while (response!=0);
    }
}
