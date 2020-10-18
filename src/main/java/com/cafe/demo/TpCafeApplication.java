package com.cafe.demo;

import com.cafe.demo.entities.*;
import com.cafe.demo.repositories.DocumentRepository;
import com.cafe.demo.repositories.UserRepository;
import com.cafe.demo.services.services.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class TpCafeApplication {
    private static final Logger log = LoggerFactory.getLogger(TpCafeApplication.class);
    private final CafeService cafeService;
    private final EquipeService equipeService;
    private final DeveloppeurService developpeurService;
    private final ChefProjetService chefProjetService;
    private final UserRepository userRepository;
    private final DocumentRepository documentRepository ;
    private final DemandeService demandeService;

    private final ConsommationService consommationService;
    private final ConsommationJourService consommationJourService;
    private final ConsommationSemaineService consommationSemaineService;

    public static void main(String[] args) {
        SpringApplication.run(TpCafeApplication.class, args);
    }

    public TpCafeApplication(CafeService cafeService,
                             EquipeService equipeService,
                             DeveloppeurService developpeurService,
                             ChefProjetService chefProjetService,
                             UserRepository userRepository, DocumentRepository documentRepository, DemandeService demandeService,
                             ConsommationService consommationService,
                             ConsommationJourService consommationJourService,
                             ConsommationSemaineService consommationSemaineService
    ) {
        this.cafeService = cafeService;
        this.equipeService = equipeService;
        this.developpeurService = developpeurService;
        this.chefProjetService = chefProjetService;
        this.userRepository = userRepository;
        this.documentRepository = documentRepository;
        this.demandeService = demandeService;
        this.consommationService = consommationService;
        this.consommationJourService = consommationJourService;
        this.consommationSemaineService = consommationSemaineService;
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            // ajouter les 2 équipes
            Equipe Equipe_jour = new Equipe("Equipe_jour", 1);
            Equipe Equipe_nuit = new Equipe("Equipe_nuit", 2);
            equipeService.save(Equipe_jour);
            equipeService.save(Equipe_nuit);

            //ajouter les developpeurs
            Developpeur sourour = new Developpeur("sourour", "Dridi", "Cynapsys", 1000.0, Equipe_jour);
            Developpeur basma = new Developpeur("Basma", "basma", "Cynapsys", 1000.0, Equipe_jour);
            Developpeur developpeur = new Developpeur("Basma", "basma", "Cynapsys", 1000.0, Equipe_nuit);
            ChefProjet chefProjet = new ChefProjet("chiheb", "rabeh", Equipe_jour);
            ChefProjet chf = new ChefProjet("chiheb", "rabeh", Equipe_nuit);
            developpeurService.save(sourour);
            developpeurService.save(basma);
            developpeurService.save(developpeur);
            chefProjetService.save(chefProjet);
            chefProjetService.save(chf);

            //ajouter les types Cafes
            Cafe Express = new Cafe("Express", 0.5);
            Cafe serre = new Cafe("serré", 0.5);
            Cafe allonge = new Cafe("allongé", 0.5);
            Cafe cappuccino = new Cafe("cappuccino", 0.7);
            Cafe glace = new Cafe("glacé ", 0.7);
            Cafe lait = new Cafe("cafe au lait ", 0.7);
            cafeService.save(Express);
            cafeService.save(serre);
            cafeService.save(allonge);
            cafeService.save(cappuccino);
            cafeService.save(glace);
            cafeService.save(lait);
            Demande DemandeSourour = new Demande(sourour, Express);
            Demande Demande2Sourour = new Demande(sourour, Express);
            Demande Demande3Sourour = new Demande(sourour, serre);
            Demande DemandeAllongeSourour = new Demande(sourour, allonge);
            demandeService.save(DemandeSourour);
            demandeService.save(Demande3Sourour);
            demandeService.save(Demande2Sourour);
            demandeService.save(DemandeAllongeSourour);
            Consommation c1 = new Consommation(DemandeSourour);
            Consommation c2 = new Consommation(Demande2Sourour);
            //consommationService.save(c1); consommationService.save(c2);

            ConsommationJour Cj1 = new ConsommationJour("10/10/2020", 5);
            ConsommationJour Cj2 = new ConsommationJour("11/10/2020", 11);
            consommationJourService.save(Cj1);
            consommationJourService.save(Cj2);
            c1.setConsommationJour(Cj1);
            c2.setConsommationJour(Cj2);
            consommationService.save(c1);
            consommationService.save(c2);
            ConsommationSemaine Cs1 = new ConsommationSemaine("semaine 1 octobor", 5, chefProjet);
            consommationSemaineService.save(Cs1);
            Cj1.setConsommationSemaine(Cs1);
            consommationJourService.save(Cj1);

            //consommationSemaineService.update(Cs1);
            // fetch all cafes
            log.info("List cafe found with findAll():");
            log.info("-------------------------------");


            for (Cafe cafe : cafeService.findAll()) {
                log.info(cafe.toString());
            }

            log.info("les programmeurs ayant consommé le nombre maximum de cafés :");
            List<Demande> demandes = demandeService.findAll();
            for (Demande D:demandes) {
                log.info(String.valueOf(D.getId()));
                log.info("developpeur :" + D.getDeveloppeur());
               // log.info("Consommations"  );
              //  log.info(D.getConsommations().toString());
            }


            User chiheb = new User();
            chiheb.setName("chiheb");

           List<Document> doc=new ArrayList<>();
           Document d=new Document(1,"Test");

          // doc.add(d);

            documentRepository.save(d);
         //    chiheb.setDocs(doc);

            userRepository.save(chiheb);
            d.setUserId(chiheb);
            for (User user : userRepository.findAll()) {
                log.info(user.getName());

            }


        };


    }
}