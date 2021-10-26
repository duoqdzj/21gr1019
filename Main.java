package com.company;

import javax.imageio.ImageTranscoder;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("\"");//kabute atspausidantn reikia prideti \
//
// 1* Sukurkite 4 kintamuosius, kurie saugotų jūsų vardą, pavardę, gimimo
//metus ir šiuos metus (nebūtinai tikrus). Parašykite kodą, kuris pagal
//gimimo metus paskaičiuotų jūsų amžių ir naudodamas vardo ir
//pavardės kintamuosius atspausdintų tokį sakinį :
//"Aš esu Vardenis Pavardenis. Man yra XX metai(ų)".
//
////        System.out.println(Math.random());
//        String Vardas = "Vilius";
//        String Pavarde = "Juodvalkis";
//        int amzius = 34;
//        System.out.println("As esu "+Vardas+" "+Pavarde+" Man yra "+amzius+" metai");
//
//        int random = (int)(Math.random()*6+2); //taip generuoja nuo 2 iki 7 sveikus skaicius



//     2*   Naudokite funkcija Math.random(). Sukurkite du kintamuosius ir
//        naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines
//        reikšmes nuo 0 iki 4. Didesnę reikšmę padalinkite iš mažesnės.
//                Atspausdinkite rezultatą jį suapvalinę iki 2 skaičių po kablelio.

//    int first = (int) (Math.random() * 5);
//    int second = (int) (Math.random() * 5);
//
//        System.out.println("pirmas skaicius "+first+", antras skacius " +second);
//
//        if (first == second){
//            System.out.println("abu skaiciai vienodi");}
//
//
//        if (first == 0 || second == 0){
//            System.out.println("dalyba is nulio negalima");
//        }
//
//        if (first != 0 && second != 0){
//
//            if (first > second){
//                System.out.println( Math.round((double) first / second * 100)/ 100);
//            }
//
//
//            if (second > first){
//                System.out.println(((double) second / first * 100) / 100);
//            }
//        }

//funkcija kuri negrazina nieko "void"
//public static void funkcija(){


//        3* Naudokite funkcija Math.random(). Sukurkite tris kintamuosius ir
//        naudodamiesi funkcija Math.random() jiems priskirkite atsitiktines
//        reikšmes nuo 0 iki 25. Raskite ir atspausdinkite kintąmąjį turintį vidurinę
//        reikšmę.


//        int first3 = (int) (Math.random() * 26);
//        int second3 = (int) (Math.random() * 26);
//        int fird3 = (int) (Math.random() * 26);
//        System.out.println(first3+"  "+second3+"  "+fird3);
//        if (first3 == second3 && first3 == fird3 && second3 == fird3){
//            System.out.println("visi vienodi skaiciai"+first3+"  "+second3+"  "+fird3);}
//
//        if ((first3 < second3 && second3 > fird3) || (fird3 < second3 && second3 > first3)){
//            System.out.println("pirmas skaicius turi vidurine reiksme "+first3);}
//
//
//        if ((first3 < second3 && second3 < fird3) || (fird3 > second3 && second3 > first3) ) {
//            System.out.println("antras skaicius turi vidurine reiksme" + "  " + second3);
//        }
//
//
//        if ((first3 < second3 && second3 > fird3) || (fird3 < second3 && second3 > first3)) {
//            System.out.println("trecias skaicius turi vidurine reiksme" + "  " + fird3);
//        }

//        4* Įvedami skaičiai -a, b, c –kraštinių ilgiai, trys kintamieji (naudokite
//                Math.random() funkcija nuo 1 iki 10). Parašykite Java programą, kuri
//        nustatytų, ar galima sudaryti trikampį ir atsakymą atspausdintų.

//
//        int a = (int) (Math.random()*10)+1;
//        int b = (int) (Math.random()*10)+1;
//        int c = (int) (Math.random()*10)+1;
//
//        System.out.println("a="+a+"  b="+b+"  c="+c);
//    if (a+b > c && a + c > b && c + b > a){
//        System.out.println("Trikampis galimas");
//    }else{
//        System.out.println("negalimas trikampis");
//    }

//        5* Sukurkite keturis kintamuosius ir Math.random() funkcija
//        sugeneruokite jiems
//        reikšmes nuo 0 iki 2. Suskaičiuokite kiek yra nulių, vienetų ir dvejetų.
//        (sprendimui masyvo nenaudoti).

//
//        int a = (int) (Math.random()*2)+1;
//        int b = (int) (Math.random()*2)+1;
//        int c = (int) (Math.random()*2)+1;
//        int d = (int) (Math.random()*2)+1;
//        int aa = 0;
//        int aaa = 0;
//        int aaaa = 0;
//
//        if(a==0) {aa=aa+1;}
//        if(b==0) {aa=aa+1;}
//        if(c==0) {aa=aa+1;}
//        if(d==0) {aa=aa+1;}
//
//        if(a==1) {aaa++;}
//        if(b==1) {aaa++;}
//        if(c==1) {aaa++;}
//        if(d==1) {aaa++;}
//
//        if(a==2) {aaaa++;}
//        if(b==2) {aaaa++;}
//        if(c==2) {aaaa++;}
//        if(d==2) {aaaa++;}
//
//        System.out.println(a+" "+ b +" "+c+" "+ d+" is viso nuliu  "+aa+" is viso vienetu  "+aaa+" is viso dvejetu  "+aaaa);
//
//        6* Naudokite funkcija Math.random(). Atspausdinkite 3 skaičius nuo -10 iki
//        10. Skaičiai mažesni už 0 turi būti laužtiniuose skliaustuose [], 0 - (),
//                didesni už 0 {}.
//
//        int a = (int) (Math.random()*20)-10;
//        int b = (int) (Math.random()*20)-10;
//        int c = (int) (Math.random()*20)-10;
//
//        if (a < 0){System.out.println("["+a+"]");}
//        if (a == 0){System.out.println("("+a+")");}
//        if (a > 0){System.out.println("{"+a+"}");}
//
//        if (b < 0){System.out.println("["+b+"]");}
//        if (b == 0){System.out.println("("+b+")");}
//        if (b > 0){System.out.println("{"+b+"}");}
//
//        if (c < 0){System.out.println("["+c+"]");}
//        if (c == 0){System.out.println("("+c+")");}
//        if (c > 0){System.out.println("{"+c+"}");}

//        7* Įmonė parduoda žvakes po 1 EUR. Perkant daugiau kaip už 1000 EUR
//        taikoma 3 % nuolaida, daugiau kaip už 2000 EUR - 4 % nuolaida.
//                Parašykite programą, kuri skaičiuos žvakių kainą ir atspausdintų
//        atsakymą kiek žvakių ir kokia kaina perkama. Žvakių kiekį generuokite
//        Math.random() funkcija nuo 5 iki 3000.
//
//        int kiekis = (int) (Math.random()*3000)+5;
//
//        if (kiekis > 1000){System.out.println("perkamas kiekis  "+kiekis+" uz kaina  "+(kiekis*0.97));}
//        if (kiekis > 2000){System.out.println("perkamas kiekis  "+kiekis+" uz kaina  "+(kiekis*0.96));}

//        8* Naudokite funkcija Math.random(). Sukurkite tris kintamuosius su
//        atsitiktinėm reikšmėm nuo 0 iki 100. Paskaičiuokite jų aritmetinį vidurkį.
//        Ir aritmetinį vidurkį atmetus tas reikšmes, kurios yra mažesnės nei 10
//        arba didesnės nei 90. Abu vidurkius atspausdinkite. Rezultatus
//        apvalinkite iki sveiko skaičiaus.

//        int a = (int) (Math.random()*100);
//        int b = (int) (Math.random()*100);
//        int c = (int) (Math.random()*100);
//        int vid;
//        int vida;
//        int aa = 0;
//        int bb = 0;
//        int cc = 0;
//
//        vid = (a+b+c) / 3 ;
//
//        if (a < 10 || a > 90){ aa = a;}
//        if (b < 10 || b > 90){ bb = b;}
//        if (c < 10 || c > 90){ cc = c;}
//
//        vida = (aa+bb+cc)/3;
//        System.out.println(a+" "+ b +" "+c+"  "+aa+"   "+bb+"  "+cc);
//        System.out.println(vid +" ir kitas vidurkis  "+vida);

//        9* Padarykite skaitmeninį laikrodį, rodantį valandas, minutes ir sekundes.
//        Valandom, minutėm ir sekundėm sugeneruoti panaudokite funkciją
//        Math.random(). Sugeneruokite skaičių nuo 0 iki 300. Tai papildomos
//        sekundės. Skaičių pridėkite prie jau sugeneruoto laiko. Atspausdinkite
//        laikrodį prieš ir po sekundžių pridėjimo ir pridedamų sekundžių skaičių.


//        int h = (int) (Math.random()*24);
//        int min = (int) (Math.random()*60);
//        int s = (int) (Math.random()*60);
//        int add = (int) (Math.random()*300);
//        int adds = add % 60;
//        int addm = (add-adds)/60;
//        int addss = 0;
//        int addmm = 0;
//        int addhh = h;
//
//
//        System.out.println(h+" : "+ min +" : "+s+" ir prideti "+add+" su liekana "+adds+"  minutes add " +addm);
//
//        System.out.println(+h+" : "+ (min+addm) +" : "+(s+adds)+" laikas su pridejimu  ");
//
//        if ((s+adds)>60){ addss = (s + adds) % 60; addmm = min + addm + 1;}
//
//        if(addmm>60) { addmm = addmm - 60; addhh = h+1;}
//
//        System.out.println(addhh+" : "+addmm+" : "+addss +"  naujas laikas ");

//        10*Papildomas.
//        Naudokite funkcija Math.random(). Sugeneruokite 6 kintamuosius su
//        atsitiktinem reikšmėm nuo 1000 iki 9999. Atspausdinkite reikšmes
//        viename strige, išrūšiuotas nuo didžiausios iki mažiausios, atskirtas
//        tarpais. Naudoti ciklų ir masyvų NEGALIMA.

















        }
}
