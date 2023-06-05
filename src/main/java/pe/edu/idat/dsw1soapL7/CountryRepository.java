package pe.edu.idat.dsw1soapL7;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Country;
import io.spring.guides.gs_producing_web_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class CountryRepository {
    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Lunes");
        spain.setCapital("Monday");
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Martes");
        poland.setCapital("Tuesday");
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("Miercoles");
        uk.setCapital("Wednesday");
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);

        Country lunes = new Country();
        lunes.setName("Jueves");
        lunes.setCapital("Thursday");
        lunes.setPopulation(63705000);

        countries.put(lunes.getName(), lunes);

        Country vienes = new Country();
        vienes.setName("Viernes");
        vienes.setCapital("Friday");
        vienes.setPopulation(63705000);

        countries.put(vienes.getName(), vienes);

        Country sabado = new Country();
        sabado.setName("Sabado");
        sabado.setCapital("Saturday");
        sabado.setPopulation(63705000);

        countries.put(sabado.getName(), sabado);

        Country domingo = new Country();
        domingo.setName("Domingo");
        domingo.setCapital("Sunday");
        domingo.setPopulation(63705000);

        countries.put(domingo.getName(), domingo);
    }

    public Country findCountry(String name) {
        Assert.notNull(name, "The country's name must not be null");
        return countries.get(name);
    }
}