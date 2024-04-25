package com.example.oblig3data1700praneeth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BillettController {

    @Autowired
    private BillettRepository rep;

    @GetMapping("/hentFilmer")
    public List<Filmer> hentFilmer(){
        List<Filmer> listFilmer = new ArrayList<>();
        listFilmer.add(new Filmer("Velg en film"));
        listFilmer.add(new Filmer("Black Widow"));
        listFilmer.add(new Filmer("Fast & Furious 9"));
        listFilmer.add(new Filmer("Shang-Chi"));
        listFilmer.add(new Filmer("The Batman"));
        return listFilmer;
    }

    @PostMapping("/lagre")
    public void lagreBillett(Billett innBillett){

        rep.lagreBillett(innBillett);
    }

    @GetMapping("/hentAlle")
    public List<Billett> hentAlle(){

        return rep.hentAlleBilletter();
    }




    @GetMapping("/slettAlle")
    public void slettAlle(){

        rep.slettAlleBilletter();
    }

}
