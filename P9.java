import java.util.Scanner;
public class P9 {
    Scanner sn = new Scanner(System.in);
    int [] matricula = new int [5];
    String [] carrera = new String [5];
    double promlocal=0;
    public void MenuOpc(int opc)
    {   //int []vmatricula;
    //     String []vcarrera;
        P9 pr = new P9();
        switch (opc) {
            case 1: //Crear carrera
                pr.CrearCarreras(carrera);
                break;
            case 2: //Registro de Cantidad de Matriculados por Carrera
                pr.RegistroMatriculaXCarrera(matricula, carrera);
                break;
            case 3: //Total de estudiantes matriculados en una Carrera X
                pr.TotalMatriculaXCarrera(matricula, carrera);
                break;
            case 4: //Promedio de estudiantes matriculados
                promlocal=pr.PromMatricula(matricula, carrera);
                break;
            case 5: //Carreras por debajo del promedio de estudiantes matriculados
                pr.CarrerasXDebajoProm(matricula, carrera, promlocal);
                break;
            case 6: //Carrera con mayor cantidad de Matriculados
                pr.CarreraWMayorMatricula(matricula, carrera);
                break;
            case 7: //Salir
                break;
            default:
                break;
        }
    }
    public void CrearCarreras(String[] carrera)  //OPCION 1
    {   //String [] carrera = new String [5]; 
        for(int fi=0; fi<=carrera.length-1;fi++)
        {   System.out.printf("Ingrese la carrera %d: ", fi+1);
            carrera[fi] = sn.nextLine();
        }   
    }
    public void RegistroMatriculaXCarrera(int[] matricula, String[] carrera) //OPCION 2
    {   for(int fi=0; fi<=matricula.length-1;fi++)
        {   System.out.printf("Ingrese la matricula de la carrera %s: ", carrera[fi]);//de %s : ", carrera[fi]); Aqui queria que imprimiera el nombre de la carrrera en lugar del numero 
            matricula[fi] = sn.nextInt();
        } 
    }
    public void TotalMatriculaXCarrera(int matricula[], String carrera[]) //OPCION 3 
    {   for(int fi=0; fi<=matricula.length-1;fi++)
        {   System.out.printf("El total de estudiantes de la carrera %s es de: %d\n", carrera[fi], matricula[fi]);
        } 
    }
    public double PromMatricula(int matricula[], String carrera[]) //OPCION 4
    {   int suma=0;
        double prom=0;
        for(int fi=0; fi<=matricula.length-1;fi++)
        {   suma = suma+matricula[fi];
            prom = (suma/5);
        } 
        System.out.printf("El promedio de estudiantes matriculados es de: %.2f\n", prom);
        return prom;
    }
    public void CarrerasXDebajoProm(int matricula[], String carrera[], double promlocal) //OPCION 5
    {   for(int fi=0; fi<=matricula.length-1;fi++)
        {   if(matricula[fi] < promlocal)
            {   System.out.printf("La carrera de %s esta por debajo del promedio %.2f con %d estudiantes matriculados.\n" ,carrera[fi] ,promlocal ,matricula[fi]);
            }
        } 
    }
    public void CarreraWMayorMatricula(int matricula[], String carrera[]) //OPCION 6
    {   int pos=0, mayor = matricula[0];
        for(int fi=0;fi<matricula.length;fi++)
        {   if(matricula[fi]>mayor)
            {   mayor = matricula[fi];
                pos=fi;
            }
        }
        System.out.printf("La carrera con el mayor numero de matricula es %s con %d estudiantes matriculados.\n" , carrera[pos] ,matricula[pos]);
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        P9 pr = new P9();
        int y=0,opc=0;
        do{ System.out.println("--------------------------------Menu-----------------------------------------------");
            System.out.println("1.Crear Carreras ");
            System.out.println("2.Registro de matricula por carrera ");
            System.out.println("3.Total de estudiantes matriculados por carrera ");
            System.out.println("4.Promedio de los estudiantes matriculados ");
            System.out.println("5.Carreras por debajo del promedio de estudiantes matriculados ");
            System.out.println("6.Carrera con mayor cantidad de estudiantes matriculados ");
            System.out.println("7.Salir ");
            System.out.print("Introduzca la opcion a realizar:");
            opc = sn.nextInt();
            pr.MenuOpc(opc);
            System.out.print("Desea realizar otra opcion? 1-Si 2-No: ");
            y = sn.nextInt();
        }while(y==1);
        sn.close();
    }
}