import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.lang.Math;


class Coba{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args){
        //declare and init loop var
        String input = "", ulang = "y";
         
        //main loop
        while(ulang.equals("y") || ulang.equals("Y")){
            clearScreen();
            printSeparator();
            System.out.println("Choose One");
            printSeparator();
            System.out.println("1. Kalkulator Lingkaran");
            System.out.println("2. Deret");
            System.out.println("3. Pola");
            printSeparator();
            //get user choice
            try{
            System.out.print("Your Choice : ");
            input = br.readLine();
            }catch(IOException e){
                System.out.println(e);
            }

            switch(input){
                case "1":
                    Lingkaran();
                    break;
                case "2":
                    deret();
                    break;
                case "3":
                    pola();                
                    break;
                default:
                    System.out.println("Check your Input, Input Number Only");
            }

            System.out.print("Back to main menu? (Y/N)");
            try{
                ulang = br.readLine();
            }catch(IOException e){
                System.out.println(e);
            }


        }
    }

    static void Lingkaran(){
        clearScreen();
        String input = "";
        printSeparator();
        System.out.println("Pilih Operasi");
        printSeparator();
        System.out.println("1. Hitung Keliling Lingkaran");
        System.out.println("2. Hitung Luas Lingkaran");
        printSeparator();
        System.out.print("Masukkan pilihan : ");
        try{
            input = br.readLine();
        }catch(IOException e){
            System.out.println(e);
        }
        switch (input){
            case "1":
                System.out.println(kelilingLingkaran());
                printSeparator();
                break;
            case "2":
                System.out.println(luasLingkaran());
                printSeparator();
                break;
        }
    }

    static void deret(){
        clearScreen();
        int jumlah = 0,a,b,n,temp;
        String input;
        printSeparator();
        System.out.println("Membuat Deret dan menentukan Jumlahnya");
        printSeparator();
        try{
            System.out.print("Masukkan suku pertama : ");
            input = br.readLine();
            a = Integer.parseInt(input);
            temp = a;
            System.out.print("Masukkan beda : ");
            input = br.readLine();
            b = Integer.parseInt(input);
            System.out.print("Masukkan jumlah suku : ");
            input = br.readLine();
            n = Integer.parseInt(input);
            printSeparator();
            for(int i = 0; i < n; i++){
                System.out.print(temp + ",");
                if (i == n-1){
                    System.out.print("\n");
                }
                jumlah = jumlah + temp;
                temp += b;
            }
            System.out.println("Jumlah = " + jumlah);
        }catch(IOException e){
            System.out.println(e);
        }
        printSeparator();
    }

    static String kelilingLingkaran(){
        clearScreen();
        String input,message = "";
        Double r = 0.0, keliling = 0.0;
        printSeparator();
        System.out.println("Hitung Keliling Lingkaran");
        printSeparator();
        System.out.print("Masukkan panjang jari-jari : ");
        try{
            input = br.readLine();
            r = Double.parseDouble(input);
            keliling = Math.PI * 2 * r;
        }catch(IOException e){
            System.out.println(e);
        }
        message = "Keliling lingkaran = " + keliling;
        return message;
    }

    static String luasLingkaran(){
        clearScreen();
        Double r = 0.0 ,luas = 0.0;
        String input;
        
        printSeparator();
        System.out.println("Hitung Luas Lingkaran");
        printSeparator();
        System.out.print("Masukkan panjang jari-jari : ");
        try{
            input = br.readLine();
            r = Double.parseDouble(input);
        }catch(IOException e){
            System.out.println(e);
        }

        luas = Math.PI * Math.pow(r, 2);
        return "Luas Lingkaran = " + luas;
    }


    static void pola(){
        clearScreen();
        int temp = 0;
        //input y coordinate as[][] the second dimension of array, 
        //while the array of [] will be the x index
        int[][] kolom = {{1,8,11,17,20,28},
                         {1,8,11,12,17,22,26},
                         {1,8,11,14,17,24},
                         {1,8,11,16,17,24},
                         {2,3,4,5,6,7,11,17,24}};
        //loop for y index
        for(int i = 0; i< kolom.length;i++){
        //loop for x index
            for(int j = 0 ; j <= kolom[i][kolom[i].length -1];j++){
                    if(j == kolom[i][temp]){
                        System.out.print("*");
                        temp++;
                    }else{
                        System.out.print(" ");
                    }  
            }
            temp = 0;
            System.out.print("\n");
        }
        System.out.println();
    }


    static void clearScreen(){
        String command = "clear";
        Runtime runtime = Runtime.getRuntime();
        try {
         Process process = runtime.exec(command);
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
         String line;
         while ((line = bufferedReader.readLine()) != null) {
         System.out.println(line);
         }
        } catch (IOException e) {
         System.out.println(e);
        }
    }

    static void printSeparator(){
        System.out.println("=========================================");
    }
}