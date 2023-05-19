package net.onlinenotepad.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.onlinenotepad.model.InputData;
import net.onlinenotepad.task.FillNotes;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class stepDefs {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("abro la pagina notas")
    public void abroLaPaginaNotas(String usuario) {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www.online-notepad.net/es/bloc-de-notas-online"));
    }

    @Cuando("pongo la nota de")
    public void pongoLaNotaDe(List <InputData> data) {
        theActorInTheSpotlight().attemptsTo((FillNotes.withThe(data)));



    }


    @Entonces("deberia ver el mensaje de exito")
    public void deberiaVerElMensajeDeExito() {

    }
}
