package net.onlinenotepad.task;

import net.onlinenotepad.model.InputData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

public class FillNotes implements Task {



    public List<InputData> theList;
    public FillNotes(List<InputData> theList) {this.theList = theList;}
    public static Performable withThe(List<InputData> data) {return Tasks.instrumented(FillNotes.class,data);
    }




    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();

    }
}
