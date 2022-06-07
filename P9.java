import java.util.Scanner;
public class P9 {
    private String [] Carrera = new String [5];
    private int [] Matricula = new int [5];
    private String carrera;
    public void camb (String scarrera)
    { carrera=scarrera;
    }

    public void MenuOpc()
    {   int opc=0;
        P9 pr = new P9();
        switch (opc) {
            case 1: //Crear carrera
                pr.CrearCarreras();
                break;
            case 2: //Registro de Cantidad de Matriculados por Carrera
                break;
            case 3: //Total de estudiantes matriculados en una Carrera X
                break;
            case 4: //Promedio de estudiantes matriculados
                break;
            case 5: //Carreras por debajo del promedio de estudiantes matriculados
                break;
            case 6: //Carrera con mayor cantidad de Matriculados
                break;
            case 7: //Salir
                break;
            default:
                break;
        }
    }
    public void CrearCarreras()
    {   int fi;
        String scarrera;
        Scanner sn = new Scanner(System.in);
        for(fi=0;fi<=4;fi++)
        {   System.out.println("Introduzca las carreras");
            scarrera=sn.nextLine();
            camb(scarrera);
            Carrera[fi]=scarrera;
        }
        
        
    }
    public void IngresarDatos()
    {   int vnumero, i;
        Scanner sn = new Scanner(System.in);
        for(i=0;i<=A.length-1;i++)
        {   System.out.printf("Deme el numero %d: ",i+1);
            vnumero = sn.nextInt();
            camb(vnumero);
            A[i]=num;
        }
        System.out.print("Introduzca el Segundo Array\n");
        for(i=0;i<=B.length-1;i++)
        {   System.out.printf("Deme el numero %d: ",i+1);
            vnumero = sn.nextInt();
            camb(vnumero);
            B[i]=num;
        }
        sn.close();
    }
    public void Multiplicando()
    {   int i=0,j=0;
        System.out.print("\nEl arreglo multiplicado es: ");
        for(i=A.length-1, j=0;i>=0;i--,j++)
        {   C[j]=A[j]*B[i];
            System.out.printf("%d  ", C[j] );
        }
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        P9 pr = new P9();
        int y=1;
        do{ 
            pr.MenuOpc();
            System.out.println("Desea realizar otra opcion? 1-Si 2-No  ");
            y = sn.nextInt();
        }while(y==1);
        sn.close();
        pr.IngresarDatos();
        pr.Multiplicando();
    }
}