/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Pratium3 {
    public static void main (String[] args) {
BufferedReader masukan = new BufferedReader(new InputStreamReader(System.in));
String Nama="";
String NIS="";
String TempatLahir="";
String TanggalLahir="";
String Alamat="";
String Motto="";
int jumlah= 1;
int count= 0;
while ( count < jumlah)
{
    System.out.print("Nama Anda:");
try{
    Nama=masukan.readLine();
    }catch(IOException e){
        System.out.println("Error!");
        }
System.out.print("Alamat di Malang:");
try{
    NIS=masukan.readLine();
}catch(IOException e){
    System.out.print("Error!");
    }
System.out.print("TempatLahir:");
try{TempatLahir=masukan.readLine();
}catch(IOException e){
    System.out.println("Error!");
    }
System.out.print("TanggalLahir:");
try{TanggalLahir=masukan.readLine();
}catch(IOException e){
    System.out.println("Error!");
    }
System.out.print("Alamat:");
try{Alamat=masukan.readLine();
}catch(IOException e){
System.out.println("Error!");
}
System.out.print("Motto:");
try{Motto=masukan.readLine();
}catch(IOException e){
    
}
System.out.println("Error!");
System.out.println("\nBiodata Anda");
System.out.println("Nama:"+Nama);
System.out.println("NIS:"+NIS);
System.out.println("Tempat Lahir:"+TempatLahir);
System.out.println("Tanggal Lahir:"+TanggalLahir);
System.out.println("Alamat di Malang:"+Alamat);
    System.out.println("Motto Hidup:"+Motto);
System.out.println();
count++;
}
}

}