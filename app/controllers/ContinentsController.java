package controllers;

import models.Continent;
import models.Continents;
import play.mvc.Controller;
import play.mvc.Result;

public class ContinentsController extends Controller
{
    public Result getContinents()
    {
        Continents continents = new Continents();

        return ok(views.html.continents.render(continents.getContinents().values()));
    }

    public Result getContinent(String continentKey)
    {
        Continents continents = new Continents();
        Continent continent = continents.getContinents().get(continentKey);
        return ok(views.html.continent.render(continent));
    }
}
