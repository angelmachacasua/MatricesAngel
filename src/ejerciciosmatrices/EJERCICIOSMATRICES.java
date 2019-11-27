
package ejerciciosmatrices;

import java.util.Scanner;

public class EJERCICIOSMATRICES {//Machaca Suaña Angel Raul
    static Scanner cs=new Scanner(System.in);

   

    public static void imprimirMatriz(int[][] M){

        for (int i = 0; i < M.length; i++) {

            for (int j = 0; j < M[0].length; j++) {

               if(j==0 && i!=0){System.out.println("");}

                System.out.print("\t"+M[i][j]+"|");

            }

        }

        System.out.println("");

    }

    

    public static int[][] ARMStransformada01(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim-i; j++) {                

                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;               

            }

        }        

        return M;

    }

    

    public static int[][] ARMStransformada02(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim-i; j++) {                

                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;                  

            }

        }        

        return M;

        }

    

    public static int[][] ARMStransformada03(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim-i; j++) {                

                if((i+j)%2==0){

                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      

                }else{

                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      

                }

            }

        }        

        return M;

        }

    

    public static int[][] ARMStransformada04(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim-i; j++) {                

                if((i+j)%2==0){

                M[i][j]=numInit+(i+j)*(i+j+1)/2 + i;      

                }else{

                M[i][j]=numInit+(i+j)*(i+j+1)/2 + j;      

                }                

            }

        }        

        return M;

        }

    public static int[][] ARMStransformada06(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j <= i; j++) {                

                M[i][j]=numInit;

                numInit++;

            }

        }        

        return M;

        }

    public static int [][] ARMStransformada07(){

      Scanner lt=new Scanner(System.in);

        System.out.print("ingrese la dimencion de la matriz ");

        int dim=lt.nextInt();

        int [][]M=new int [dim][dim];

        System.out.print("ingrese direccionando base");

        int munit=lt.nextInt();

        for (int i = 0; i <dim; i++) {

            for (int j = 0; j <dim-i; j++) {               

                M[i][j]=munit;

                munit++;

            

            }

        }    

        return M;

    }

    

    public static int [][] ARMStransformada12(){

      Scanner lt=new Scanner(System.in);

        System.out.print("ingrese la dimencion de la matriz: ");

        int dim=lt.nextInt();

        int [][]M=new int [dim][dim];

        System.out.print("ingrese direccionando base:");

        int munit=lt.nextInt();

        for(int j = 0; j <dim; j++) {

            for(int i = dim-1; i >=0+j; i--) {               

                M[j][i]=munit;

                munit++;

            

            }

        }

        

        return M;

    }

    public static int[][] ARMStransformada15(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = 0; j <dim; j++){

            for (int i = dim-1; i >=0+j; i--) {

                System.out.println("M["+i+"]["+j+"]="+numInit);

                M[i][j]=numInit;

                numInit++;

            }        

        }

        return M;

        }

    public static int[][] ARMStransformada16(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();//dim=5 numInit=0

        for(int j = 0; j <dim; j++){

            for (int i = dim-1; i >=(dim-1)-j; i--) {

                System.out.println("M["+i+"]["+j+"]="+numInit);

                M[i][j]=numInit;

                numInit++;

            }        

        }

        return M;

        }

    public static int[][] ARMStransformada21(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = 0; j <dim; j++){

            if(j%2==0){

            for (int i = 0; i <dim; i++) {                

                M[i][j]=numInit;

                numInit++; }            

            }else{

            for (int i = dim-1; i >=0; i--) {                

                M[i][j]=numInit;

                numInit++;}            

            }

        }

        return M;

        }

    public static int[][] ARMStransformada22(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = 0; j <dim; j++){

            if(j%2==0){

            

            for (int i = dim-1; i >=0; i--) {                

                M[i][j]=numInit;

                numInit++;}            

            }else{

            for (int i = 0; i <dim; i++) {                

                M[i][j]=numInit;

                numInit++; }

        }}

        return M;

        }

   public static int[][] ARMStransformada23(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = dim-1; j>=0; j--){

            if(j%2==0){

                for (int i = 0; i <dim; i++) {                

                M[i][j]=numInit;

                numInit++;}      

            }else{

            

                for (int i = dim-1; i >=0; i--) {             

                M[i][j]=numInit;

                numInit++; }             

            }

        }

        return M;

        }

    public static int[][] ARMStransformada24(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = dim-1; j>=0; j--){

            if(j%2==0){

            for (int i = dim-1; i >=0; i--) {             

                M[i][j]=numInit;

                numInit++; }            

            }else{

            for (int i = 0; i <dim; i++) {                

                M[i][j]=numInit;

                numInit++;}            

            }

        }

        return M;

        }

     public static int[][] ARMStransformada25(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = 0; j <dim; j++){

            if(j%2==0){

            for (int i = 0; i <dim; i++) {                

                M[j][i]=numInit;

                numInit++; }            

            }else{

            for (int i = dim-1; i >=0; i--) {                

                M[j][i]=numInit;

                numInit++;}            

            }

        }

        return M;

        }

     public static int[][] ARMStransformada26(){

        System.out.println("Ingrese la Dimension de la Matriz:");

        int dim=cs.nextInt();

        int[][] M=new int[dim][dim];

        System.out.println("Ingrese el numero de Inicio:");

        int numInit=cs.nextInt();

        for(int j = 0; j <dim; j++){

            if(j%2==0){

                for (int i = dim-1; i >=0; i--) {                

                M[j][i]=numInit;

                numInit++;}  

                        

            }else{

                for (int i = 0; i <dim; i++) {                

                M[j][i]=numInit;

                numInit++; }      

            }

        }

        return M;

        }

     

    

        public static int[][] ARMStransformCaracol29(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();

        for(int c=0;c<dim/2;c++){

            for (int ls = c; ls <dim-1-c; ls++) {

              M[c][ls]=numInit;

              numInit++;

            } 

            for (int ld = c; ld < dim-1-c; ld++) { 

              M[ld][dim-1-c]=numInit;

              numInit++;

            }  

            for (int li = dim-1-c; li >c; li--) {

              M[dim-1-c][li]=numInit;

              numInit++;

            }

            for (int liz = dim-1-c; liz >c; liz--) { 

              M[liz][c]=numInit;

              numInit++;

            }

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }

    

    public static int[][] ARMStransformCaracol30(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();

        for(int c=0;c<dim/2;c++){

            for (int ld = c; ld < dim-1-c; ld++) {

              M[ld][dim-1-c]=numInit;

              numInit++;

            }

            for (int li = dim-1-c; li >c; li--) {

              M[dim-1-c][li]=numInit;

              numInit++;

            }

            for (int liz = dim-1-c; liz >c; liz--) {

              M[liz][c]=numInit;

              numInit++;

            }

            for (int ls = c; ls <dim-1-c; ls++) {

              M[c][ls]=numInit;

              numInit++;

            }            

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }

    public static int[][] ARMStransformCaracol31(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();

        for(int c=0;c<dim/2;c++){

             for (int li = dim-1-c; li >c; li--) {

              M[dim-1-c][li]=numInit;

              numInit++;

            }

            for (int liz = dim-1-c; liz >c; liz--) {

              M[liz][c]=numInit;

              numInit++;

            }

            for (int ls = c; ls <dim-1-c; ls++) {

              M[c][ls]=numInit;

              numInit++;

            }        

            for (int ld = c; ld < dim-1-c; ld++) {

              M[ld][dim-1-c]=numInit;

              numInit++;

            }           

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }

    public static int[][] ARMStransformCaracol32(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();

        for(int c=0;c<dim/2;c++){

            for (int liz = dim-1-c; liz >c; liz--) {

              M[liz][c]=numInit;

              numInit++;

            }

            for (int ls = c; ls <dim-1-c; ls++) {

              M[c][ls]=numInit;

              numInit++;

            }

            for (int ld = c; ld < dim-1-c; ld++) {

              M[ld][dim-1-c]=numInit;

              numInit++;

            }

            for (int li = dim-1-c; li >c; li--) {

              M[dim-1-c][li]=numInit;

              numInit++;

            }

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }

    public static int[][] ARMStransformCaracol33(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();

        for(int c=0;c<dim/2;c++){

            for (int liz = dim-1-c; liz >c; liz--) {

              M[c][liz]=numInit;

              numInit++;

            }

            for (int lbs = c; lbs <dim-1-c; lbs++) {

              M[lbs][c]=numInit;

              numInit++;

            }

             for (int ld = c; ld < dim-1-c; ld++) {

              M[dim-1-c][ld]=numInit;

              numInit++;

            }

            for (int li = dim-1-c; li >c; li--) {

              M[li][dim-1-c]=numInit;

              numInit++;

            }

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }

    public static int[][] ARMStransformCaracol34(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();

        for(int c=0;c<dim/2;c++){

            for (int ld = c; ld < dim-1-c; ld++) {

              M[ld][dim-1-c]=numInit;

              numInit++;

            }

            for (int li = dim-1-c; li >c; li--) {

              M[dim-1-c][li]=numInit;

              numInit++;

            }

            for (int liz = dim-1-c; liz >c; liz--) {

              M[liz][c]=numInit;

              numInit++;

            }

            for (int ls = c; ls <dim-1-c; ls++) {

              M[c][ls]=numInit;

              numInit++;

            }            

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }

    public static int[][] ARMStransformCaracol35(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();//dim=5 numInit=0

        for(int c=0;c<dim/2;c++){

            for (int ld = c; ld < dim-1-c; ld++) {

              M[dim-1-c][ld]=numInit;

              numInit++;

            }

             for (int li = dim-1-c; li >c; li--) {

              M[li][dim-1-c]=numInit;

              numInit++;

            }

            for (int liz = dim-1-c; liz >c; liz--) {

              M[c][liz]=numInit;

              numInit++;

            }

            for (int ls = c; ls <dim-1-c; ls++) {

              M[ls][c]=numInit;

              numInit++;

            }                    

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    }    

    public static int[][] ARMStransformCaracol36(){

    System.out.println("Ingrese la Dimension de la Matriz:");

    int dim=cs.nextInt();

    int[][] M=new int[dim][dim];

    System.out.println("Ingrese el numero de Inicio:");

    int numInit=cs.nextInt();//dim=5 numInit=0

        for(int c=0;c<dim/2;c++){           

           for (int li = dim-1-c; li >c; li--) {

              M[li][dim-1-c]=numInit;

              numInit++;

            }

            for (int liz = dim-1-c; liz >c; liz--) {

              M[c][liz]=numInit;

              numInit++;

            }

            for (int ls = c; ls <dim-1-c; ls++) {

              M[ls][c]=numInit;

              numInit++;

            } 

            for (int ld = c; ld < dim-1-c; ld++) {

              M[dim-1-c][ld]=numInit;

              numInit++;

            }

        }

        if(dim%2!=0){

            M[dim/2][dim/2]=numInit;

        }        

        return M;

    } 

    public static void main(String[] args) {

        System.out.println("Ingrese el Matriz deseado que quiera ver:  ");

        int ejercicio=cs.nextInt();

        switch(ejercicio){

            case 1:{

              imprimirMatriz(ARMStransformada01());

              break;

            }

            case 2:{

              imprimirMatriz(ARMStransformada02());

              break;

            }

            case 3:{

              imprimirMatriz(ARMStransformada03());

              break;

            }

            case 4:{

              imprimirMatriz(ARMStransformada04());

              break;

            }

            

            case 6:{

                imprimirMatriz(ARMStransformada06());

                break;

            }

            case 7:{

                imprimirMatriz(ARMStransformada07());

                break;

            }

            

            case 12:{

                imprimirMatriz(ARMStransformada12());

                break;

            }

            case 15:{

                imprimirMatriz(ARMStransformada15());

                break;

            }

            case 16:{

                imprimirMatriz(ARMStransformada16());

                break;

            }

            case 21:{

                imprimirMatriz(ARMStransformada21());

                break;

            }

            case 22:{

                imprimirMatriz(ARMStransformada22());

                break;

            }

            case 23:{

                imprimirMatriz(ARMSransformada23());

                break;

            }

            case 24:{

                imprimirMatriz(ARMStransformada24());

                break;

            }

            case 25:{

                imprimirMatriz(ARMStransformada25());

                break;

            }

            case 26:{

                imprimirMatriz(ARMStransformada26());

                break;

            }

            case 29:{

                imprimirMatriz(ARMStransformCaracol29());

                break;

            }

            case 30:{

                imprimirMatriz(ARMSransformCaracol30());

                break;

            }

            case 31:{

                imprimirMatriz(ARMStransformCaracol31());

                break;

            }

            case 32:{

                imprimirMatriz(ARMStransformCaracol32());

                break;

            }

            case 33:{

                imprimirMatriz(ARMStransformCaracol33());

                break;

            }

            case 34:{

                imprimirMatriz(ARMStransformCaracol34());

                break;

            }

            case 35:{

                imprimirMatriz(ARMStransformCaracol35());

                break;

            }

            case 36:{

                imprimirMatriz(ARMStransformCaracol36());

                break;

            }

        }

    }

}  

    
    
    

