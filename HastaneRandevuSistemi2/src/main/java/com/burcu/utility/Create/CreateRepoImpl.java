package com.burcu.utility.Create;

import com.burcu.entity.Brans;
import com.burcu.entity.Doktor;
import com.burcu.entity.Hasta;
import com.burcu.entity.Randevu;
import com.burcu.repository.BransRepository;
import com.burcu.repository.DoktorRepository;
import com.burcu.repository.HastaRepository;
import com.burcu.repository.RandevuRepository;
import com.burcu.utility.enums.Cinsiyet;
import com.burcu.utility.enums.Unvan;


import java.time.LocalDate;
import java.time.LocalTime;

public class CreateRepoImpl {

    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;
    private final BransRepository bransRepository;

    public CreateRepoImpl(){
        this.bransRepository=new BransRepository();
        this.doktorRepository=new DoktorRepository();
        this.hastaRepository=new HastaRepository();
        this.randevuRepository=new RandevuRepository();
    }

    public void createDemoData(){

        createDoktor();
        createHasta();
        createRandevu();
        createBrans();
    }

    private void createBrans(){
        bransRepository.save(Brans.builder().brans("Dahiliye").build());
        bransRepository.save(Brans.builder().brans("Çocuk Sağlığı Hastalıkları").build());
        bransRepository.save(Brans.builder().brans("Dermatoloji").build());
        bransRepository.save(Brans.builder().brans("Genel Cerrahi").build());
        bransRepository.save(Brans.builder().brans("Estetik Cerrahi").build());
        bransRepository.save(Brans.builder().brans("Göğüs Hastalıkları").build());
        bransRepository.save(Brans.builder().brans("Göz Hastalıkları").build());
        bransRepository.save(Brans.builder().brans("Kadın Hastalıkları ve Doğum").build());
        bransRepository.save(Brans.builder().brans("Kardiyoloji").build());
        bransRepository.save(Brans.builder().brans("Kulak Burun Boğaz").build());
        bransRepository.save(Brans.builder().brans("Ortopedi ve Travmatoloji").build());
        bransRepository.save(Brans.builder().brans("Psikiyatri").build());
    }


    private void createDoktor(){
        doktorRepository.save(Doktor.builder()
                        .bransId(1L)
                        .ad("Burcu")
                        .adres("İstanbul/Pendik")
                        .telefon("0555 555 55 55")
                        .unvan(Unvan.DOCENT)
                        .build());
        doktorRepository.save(Doktor.builder()
                .bransId(8L)
                .ad("Ahmet")
                .adres("İstanbul/Maltepe")
                .telefon("0544 444 44 44")
                .unvan(Unvan.OPERATOR_DOKTOR)
                .build());
        doktorRepository.save(Doktor.builder()
                .bransId(3L)
                .ad("Ali")
                .adres("İstanbul/Tuzla")
                .telefon("0543 333 33 33")
                .unvan(Unvan.UZMAN_DOKTOR)
                .build());
        doktorRepository.save(Doktor.builder()
                .bransId(5L)
                .ad("Ece")
                .adres("İstanbul/Kadıköy")
                .telefon("0542 222 22 22")
                .unvan(Unvan.PRATISYEN_DOKTOR)
                .build());
        doktorRepository.save(Doktor.builder()
                .bransId(7L)
                .ad("Ozge")
                .adres("İstanbul/Ataşehir")
                .telefon("0555 521 21 21")
                .unvan(Unvan.YARDIMCI_DOCENT)
                .build());
        doktorRepository.save(Doktor.builder()
                .bransId(1L)
                .ad("Bahar")
                .adres("İstanbul/Beşiktaş")
                .telefon("0555 444 44 44")
                .unvan(Unvan.PROFESOR)
                .build());
        doktorRepository.save(Doktor.builder()
                .bransId(1L)
                .ad("Mehmet")
                .adres("İstanbul/Kozyatağı")
                .telefon("0545 555 44 44")
                .unvan(Unvan.ORDINARYUS)
                .build());
    }
    private void createHasta(){
        hastaRepository.save(Hasta.builder().ad("Ayse").yas(48).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0532 325 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Ali").yas(54).adres("Bursa").cinsiyet(Cinsiyet.ERKEK).telefon("0533 335 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Ahmet").yas(68).adres("Ankara").cinsiyet(Cinsiyet.ERKEK).telefon("0545 444 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Mehmet").yas(32).adres("İzmir").cinsiyet(Cinsiyet.ERKEK).telefon("0535 353 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Hilal").yas(49).adres("Bursa").cinsiyet(Cinsiyet.KADIN).telefon("0536 363 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Mert").yas(27).adres("İstanbul").cinsiyet(Cinsiyet.ERKEK).telefon("0541 411 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Burak").yas(32).adres("İstanbul").cinsiyet(Cinsiyet.ERKEK).telefon("0542 422 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Burcu").yas(26).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0543 433 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Didem").yas(30).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0544 456 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Meral").yas(30).adres("Bursa").cinsiyet(Cinsiyet.KADIN).telefon("0531 369 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Seha").yas(24).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0532 458 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Ece").yas(25).adres("Ankara").cinsiyet(Cinsiyet.KADIN).telefon("0533 789 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Merve").yas(29).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0544 746 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Fatma").yas(45).adres("İzmir").cinsiyet(Cinsiyet.KADIN).telefon("0543 788 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Emine").yas(43).adres("İzmir").cinsiyet(Cinsiyet.KADIN).telefon("0546 145 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Ekrem").yas(46).adres("Ankara").cinsiyet(Cinsiyet.ERKEK).telefon("0545 748 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Bahar").yas(37).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0544 444 44 44").build());
        hastaRepository.save(Hasta.builder().ad("Emre").yas(16).adres("İstanbul").cinsiyet(Cinsiyet.ERKEK).telefon("0506 666 6 55").build());
        hastaRepository.save(Hasta.builder().ad("Beyza").yas(19).adres("Ankara").cinsiyet(Cinsiyet.KADIN).telefon("0505 566 65 55").build());
        hastaRepository.save(Hasta.builder().ad("Aysu").yas(22).adres("İzmir").cinsiyet(Cinsiyet.KADIN).telefon("0544 444 44 55").build());
        hastaRepository.save(Hasta.builder().ad("Kübra").yas(32).adres("İstanbul").cinsiyet(Cinsiyet.KADIN).telefon("0543 333 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Furkan").yas(25).adres("İAnkara").cinsiyet(Cinsiyet.ERKEK).telefon("0546 444 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Gorkem").yas(24).adres("İstanbul").cinsiyet(Cinsiyet.ERKEK).telefon("0545 525 55 55").build());
        hastaRepository.save(Hasta.builder().ad("Meltem").yas(44).adres("İzmir").cinsiyet(Cinsiyet.KADIN).telefon("0555 333 33 33").build());
    }
    private void createRandevu(){
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(1L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(2L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(3L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(4L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(5L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(6L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(7L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(11,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(8L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(11,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(9L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(11,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(10L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(11,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(11L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(11,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(12L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(11,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(13L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(12,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(14L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(12,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(15L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(12,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(16L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(12,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(17L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(12,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(18L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(12,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(19L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(13,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(20L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(13,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(1L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(13,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(22L).tarih(LocalDate.of(2024,01,24)).randevuSaati(LocalTime.of(13,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(23L).tarih(LocalDate.of(2024,01,24)).randevuSaati(LocalTime.of(13,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(1L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(14,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(2L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(14,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(3L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(14,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(4L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(14,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(5L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(14,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(6L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(14,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(7L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(15,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(8L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(15,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(9L).tarih(LocalDate.of(2024,01,21)).randevuSaati(LocalTime.of(15,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(10L).tarih(LocalDate.of(2024,02,20)).randevuSaati(LocalTime.of(15,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(11L).tarih(LocalDate.of(2024,02,15)).randevuSaati(LocalTime.of(15,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(1L).tarih(LocalDate.of(2024,02,14)).randevuSaati(LocalTime.of(15,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(13L).tarih(LocalDate.of(2024,02,14)).randevuSaati(LocalTime.of(9,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(14L).tarih(LocalDate.of(2024,02,13)).randevuSaati(LocalTime.of(9,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(15L).tarih(LocalDate.of(2024,01,12)).randevuSaati(LocalTime.of(9,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(16L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(9,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(17L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(9,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(18L).tarih(LocalDate.of(2024,03,27)).randevuSaati(LocalTime.of(9,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(1L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(9,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(20L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(21L).tarih(LocalDate.of(2024,03,26)).randevuSaati(LocalTime.of(10,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(22L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(10,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(23L).tarih(LocalDate.of(2024,02,6)).randevuSaati(LocalTime.of(10,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(1L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(10,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(1L).tarih(LocalDate.of(2024,02,23)).randevuSaati(LocalTime.of(10,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(3L).tarih(LocalDate.of(2024,01,23)).randevuSaati(LocalTime.of(11,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(4L).tarih(LocalDate.of(2024,02,23)).randevuSaati(LocalTime.of(11,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(5L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(11,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(6L).tarih(LocalDate.of(2024,02,22)).randevuSaati(LocalTime.of(11,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(7L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(11,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(8L).tarih(LocalDate.of(2024,01,22)).randevuSaati(LocalTime.of(11,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(1L).tarih(LocalDate.of(2024,02,14)).randevuSaati(LocalTime.of(12,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(10L).tarih(LocalDate.of(2024,02,20)).randevuSaati(LocalTime.of(12,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(11L).tarih(LocalDate.of(2024,02,15)).randevuSaati(LocalTime.of(12,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(12L).tarih(LocalDate.of(2024,02,14)).randevuSaati(LocalTime.of(12,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(13L).tarih(LocalDate.of(2024,02,14)).randevuSaati(LocalTime.of(12,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(14L).tarih(LocalDate.of(2024,02,13)).randevuSaati(LocalTime.of(12,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(15L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(13,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(16L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(13,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(17L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(13,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(18L).tarih(LocalDate.of(2024,01,6)).randevuSaati(LocalTime.of(13,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(19L).tarih(LocalDate.of(2024,01,16)).randevuSaati(LocalTime.of(13,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(20L).tarih(LocalDate.of(2024,01,16)).randevuSaati(LocalTime.of(13,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(21L).tarih(LocalDate.of(2024,01,12)).randevuSaati(LocalTime.of(14,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(22L).tarih(LocalDate.of(2024,01,12)).randevuSaati(LocalTime.of(14,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(23L).tarih(LocalDate.of(2024,01,12)).randevuSaati(LocalTime.of(14,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(1L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(14,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(2L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(14,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(3L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(14,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(4L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(15,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(5L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(15,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(6L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(15,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(7L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(15,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(8L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(15,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(9L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(15,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(10L).tarih(LocalDate.of(2024,01,26)).randevuSaati(LocalTime.of(15,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(11L).tarih(LocalDate.of(2024,01,6)).randevuSaati(LocalTime.of(16,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(12L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(16,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(13L).tarih(LocalDate.of(2024,01,7)).randevuSaati(LocalTime.of(16,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(14L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(16,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(15L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(16,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(16L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(16,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(17L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(17,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(18L).tarih(LocalDate.of(2024,01,5)).randevuSaati(LocalTime.of(17,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(19L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(17,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(20L).tarih(LocalDate.of(2024,01,6)).randevuSaati(LocalTime.of(17,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(2L).hastaId(1L).tarih(LocalDate.of(2024,01,4)).randevuSaati(LocalTime.of(8,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(22L).tarih(LocalDate.of(2024,01,8)).randevuSaati(LocalTime.of(8,5)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(23L).tarih(LocalDate.of(2024,01,24)).randevuSaati(LocalTime.of(8,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(1L).tarih(LocalDate.of(2024,01,29)).randevuSaati(LocalTime.of(8,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(2L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(8,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(3L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(8,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(4L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(8,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(5L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(9,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(3L).hastaId(6L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(9,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(7L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(9,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(8L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(9,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(9L).tarih(LocalDate.of(2024,01,27)).randevuSaati(LocalTime.of(9,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(10L).tarih(LocalDate.of(2024,02,27)).randevuSaati(LocalTime.of(9,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(11L).tarih(LocalDate.of(2024,02,19)).randevuSaati(LocalTime.of(9,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(1L).tarih(LocalDate.of(2024,02,19)).randevuSaati(LocalTime.of(10,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(13L).tarih(LocalDate.of(2024,02,18)).randevuSaati(LocalTime.of(10,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(14L).tarih(LocalDate.of(2024,02,14)).randevuSaati(LocalTime.of(10,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(4L).hastaId(15L).tarih(LocalDate.of(2024,01,14)).randevuSaati(LocalTime.of(10,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(16L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(10,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(17L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(10,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(18L).tarih(LocalDate.of(2024,03,15)).randevuSaati(LocalTime.of(10,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(1L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(11,0)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(20L).tarih(LocalDate.of(2024,01,16)).randevuSaati(LocalTime.of(11,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(21L).tarih(LocalDate.of(2024,03,15)).randevuSaati(LocalTime.of(11,15)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(22L).tarih(LocalDate.of(2024,01,15)).randevuSaati(LocalTime.of(11,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(5L).hastaId(23L).tarih(LocalDate.of(2024,02,17)).randevuSaati(LocalTime.of(11,25)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(1L).tarih(LocalDate.of(2024,01,17)).randevuSaati(LocalTime.of(11,35)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(1L).tarih(LocalDate.of(2024,02,17)).randevuSaati(LocalTime.of(11,45)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(3L).tarih(LocalDate.of(2024,01,17)).randevuSaati(LocalTime.of(11,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(4L).tarih(LocalDate.of(2024,02,17)).randevuSaati(LocalTime.of(12,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(5L).tarih(LocalDate.of(2024,01,18)).randevuSaati(LocalTime.of(12,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(6L).tarih(LocalDate.of(2024,02,18)).randevuSaati(LocalTime.of(12,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(6L).hastaId(7L).tarih(LocalDate.of(2024,01,18)).randevuSaati(LocalTime.of(12,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(8L).tarih(LocalDate.of(2024,01,18)).randevuSaati(LocalTime.of(12,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(1L).tarih(LocalDate.of(2024,05,14)).randevuSaati(LocalTime.of(12,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(10L).tarih(LocalDate.of(2024,05,20)).randevuSaati(LocalTime.of(13,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(11L).tarih(LocalDate.of(2024,05,15)).randevuSaati(LocalTime.of(13,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(12L).tarih(LocalDate.of(2024,03,14)).randevuSaati(LocalTime.of(13,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(13L).tarih(LocalDate.of(2024,04,14)).randevuSaati(LocalTime.of(13,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(14L).tarih(LocalDate.of(2024,03,13)).randevuSaati(LocalTime.of(13,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(15L).tarih(LocalDate.of(2024,03,15)).randevuSaati(LocalTime.of(13,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(16L).tarih(LocalDate.of(2024,03,15)).randevuSaati(LocalTime.of(14,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(17L).tarih(LocalDate.of(2024,04,15)).randevuSaati(LocalTime.of(14,20)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(18L).tarih(LocalDate.of(2024,03,6)).randevuSaati(LocalTime.of(14,30)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(7L).hastaId(19L).tarih(LocalDate.of(2024,04,16)).randevuSaati(LocalTime.of(14,40)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(20L).tarih(LocalDate.of(2024,04,16)).randevuSaati(LocalTime.of(14,50)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(21L).tarih(LocalDate.of(2024,04,12)).randevuSaati(LocalTime.of(14,55)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(22L).tarih(LocalDate.of(2024,04,12)).randevuSaati(LocalTime.of(15,10)).state(1).build());
        randevuRepository.save(Randevu.builder().doktorId(1L).hastaId(23L).tarih(LocalDate.of(2024,04,18)).randevuSaati(LocalTime.of(15,15)).state(1).build());

    }
}
