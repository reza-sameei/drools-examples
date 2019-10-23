package com.github.reza_sameei.droolsexamples.withtemplates;

import org.junit.Test;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Optional;

public class TestDroolsExamplesWithTemplates {

    public MappedFact getFact() {
        return new MappedFactImpl(
                "0001",
                Optional.of("SA"),
                Optional.of(OffsetDateTime.now().plusYears(1)),
                "S_JUNOD",
                "1.0.0",
                "?",
                "S_101",
                "S_101001",
                "/S_JUNOD/1.0.0/SE_INITVISIT",
                "ARM_A"
        );
    }

    @Test
    public void testDrools() {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieBase kieBase = kieContainer.getKieBase("withTemplates");
        KieSession kieSession = kieBase.newKieSession();

        kieSession.insert(getFact());

        int firedRules = kieSession.fireAllRules();

        System.out.println("Fired rules : " + firedRules);

        for (FactHandle fh : kieSession.getFactHandles()) {
            System.out.println("=======");
            System.out.println(fh.getClass().getName());
            System.out.println(fh);
        }

    }

    @Test
    public void testDroolsSyntax() {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieBase kieBase = kieContainer.getKieBase("withTemplates");
        KieSession kieSession = kieBase.newKieSession();

        ArrayList<SampleFact.SampleGroup> groups1 = new ArrayList<>();
        groups1.add(new SampleFact.SampleGroup("Hello"));
        groups1.add(new SampleFact.SampleGroup("World"));
        groups1.add(new SampleFact.SampleGroup(""));

        ArrayList<SampleFact.SampleGroup> groups2 = new ArrayList<>();
        groups2.add(new SampleFact.SampleGroup("Hello"));
        groups2.add(new SampleFact.SampleGroup(""));

        ArrayList<SampleFact.SampleForm> forms = new ArrayList<>();
        forms.add(new SampleFact.SampleForm(groups1, new SampleFact.SampleGroup("Single1")));
        forms.add(new SampleFact.SampleForm(groups2, new SampleFact.SampleGroup("Single2")));


        ArrayList<SampleFact.SampleGroup> groups3 = new ArrayList<>();
        groups3.add(new SampleFact.SampleGroup("Hello"));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        groups3.add(new SampleFact.SampleGroup(""));
        SampleFact.SampleForm singleForm =
                new SampleFact.SampleForm(groups3, new SampleFact.SampleGroup("Single3"));

        SampleFact sampleFact =
                new SampleFact("1234", Optional.of(OffsetDateTime.now()), forms, singleForm);

        kieSession.insert(sampleFact);

        kieSession.fireAllRules();

    }

}
