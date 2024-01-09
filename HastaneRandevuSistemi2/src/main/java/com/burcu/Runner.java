package com.burcu;

import com.burcu.service.DoktorService;
import com.burcu.service.HastaService;
import com.burcu.utility.Create.CreateRepoImpl;


import java.time.LocalDate;

public class Runner {

    public static void main(String[] args) {

      // new CreateRepoImpl().createDemoData();

      // new HastaService().hastaIsmineGoreRandevuListele("Burcu");

      //  new DoktorService().bransaGoreDoktorListele("Dahiliye");

//        new DoktorService().hastaSayisiBelirle("Burcu").forEach(d->{
//            System.out.println("Doktor Adı...: " + d[0] + "-> Hasta Sayısı...: " + d[1]);
//       });
//
//
//        new HastaService().tariheGoreRandevuListele(LocalDate.of(2024,2,20), LocalDate.of(2024,3,20))
//                .forEach(r-> System.out.println("Hastas_ID..: " + r[0] + " -> Tarih..: " +r[1]));
//
//
        new HastaService().randevuBransListele("Burcu").forEach(h-> {
            System.out.println("Hasta Adı: " + h[0] + " -> Brans..: " + h[1] + " -> Randevu Sayısı: " + h[2]);
        });

    }
}
