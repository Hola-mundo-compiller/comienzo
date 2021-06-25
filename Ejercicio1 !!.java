Import java.util.Scanner;
// estamos juntoa :)
// si xde
//esperoq se junten 

Public static void main(String args[]){
  Scanner teclado = new Scanner(System.in);
  int a[][], i = 0,m ,n ,j = 0;
  
  a = new int [m+1][n+1];
  System.out.println("Ingrese [M*N] de la matriz");
  m = teclado.nextInt();
  n = teclado.nextInt();
  
  System.out.println("Ingrese datos de la matriz");
  for (i = 0;i<=m;i++){
    System.out.print("[ ");
    for (j=0;j<=n;i++){
      a[i][j] = teclado.nextInt();
      System.out.print(a[i][j]," ");      
    }
    System.out.println("]");
  }
    
  }
