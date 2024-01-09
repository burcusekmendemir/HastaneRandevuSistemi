package com.burcu.service;

import com.burcu.entity.Brans;
import com.burcu.entity.Doktor;
import com.burcu.entity.Hasta;
import com.burcu.entity.Randevu;
import com.burcu.repository.BransRepository;
import com.burcu.repository.DoktorRepository;
import com.burcu.repository.HastaRepository;
import com.burcu.repository.RandevuRepository;

import java.util.List;
import java.util.Optional;

public class DoktorService {
    private final DoktorRepository doktorRepository;
    private final HastaRepository hastaRepository;
    private final RandevuRepository randevuRepository;
    private final BransRepository bransRepository;

    public DoktorService(){
        this.bransRepository=new BransRepository();
        this.doktorRepository=new DoktorRepository();
        this.hastaRepository=new HastaRepository();
        this.randevuRepository=new RandevuRepository();
    }


    /**
     * Belli bir branşta görev yapan doktorları veren method.
     * @param bransName
     */
    public void bransaGoreDoktorListele(String bransName){
        Optional<Brans> brans= bransRepository.findByColumn("brans",bransName);
        brans.ifPresent(b-> {
            System.out.println("*** Brans ****");
            System.out.println(b);
            System.out.println();
            List<Doktor> doktorList=doktorRepository.findByColumnAndValue("bransId",b.getId());
            doktorList.forEach(d-> {
                System.out.println("*** DOKTOR BİLGİSİ ***");
                System.out.println(d);
                System.out.println();

                System.out.println("-----------------------------");
            });
        });
    }


    /**
     * Adı verilen doktorun kaç hasta baktığını gösteren method.
     * @param name : doktor ismi
     * @return
     */
    public List<Object[]> hastaSayisiBelirle(String name){
       return doktorRepository.findCountPatientNativeSql(name);

    }



}
