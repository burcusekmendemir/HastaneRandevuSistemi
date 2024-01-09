package com.burcu.service;

import com.burcu.entity.Brans;
import com.burcu.entity.Doktor;
import com.burcu.entity.Hasta;
import com.burcu.entity.Randevu;
import com.burcu.repository.BransRepository;
import com.burcu.repository.DoktorRepository;
import com.burcu.repository.HastaRepository;
import com.burcu.repository.RandevuRepository;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class HastaService {

    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;
    private final BransRepository bransRepository;

    public HastaService(){
        this.bransRepository=new BransRepository();
        this.doktorRepository=new DoktorRepository();
        this.hastaRepository=new HastaRepository();
        this.randevuRepository=new RandevuRepository();
    }


    /**
     * Adı verilen hastanın randevularını listeleyen method.
     * @param name : hasta ismi yazılmalıdır
     */
    public void hastaIsmineGoreRandevuListele(String name){
        Optional<Hasta> hasta=hastaRepository.findByColumn("ad",name);
        hasta.ifPresent(h->{
            System.out.println("*********** HASTA BİLGİSİ ************");
            System.out.println(h);
            System.out.println();
            List<Randevu> randevuList=randevuRepository.findByColumnAndValue("hastaId",h.getId());
            randevuList.forEach(r-> {
                System.out.println("****** Randevu Bilgisi ******");
                System.out.println(r);
                System.out.println("-------------------------------------");
            });
        });
    }


    /**
     * Belli tarih aralığındaki randevuları listeleyen method.
     * @param startDate : aranmak istenilen randevu başlangıç tarihi
     * @param endDate : aranmak istenilen randevu bitiş tarihi
     * @return
     */
    public List<Object[]> tariheGoreRandevuListele(LocalDate startDate,LocalDate endDate){
        return randevuRepository.findDateNativeSql(startDate,endDate);
    }




    /**
     * İsmi verilen hastanın hangi branşlardan kaç randevu aldığını gösteren method.
     * @param name : hasta ismi yazılmalıdır
     * @return
     */
    public List<Object []> randevuBransListele(String name){
        return hastaRepository.findCountNativeSql(name);
    }



}
