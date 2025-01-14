package br.luciano.sw_planet_api.domain;

import static br.luciano.sw_planet_api.common.PlanetConstants.PLANET;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    @Autowired
    private PlanetService planetService;
    
    //operacao_estado_retorno
    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {
        //SUT System Under Test
        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);
    }
}
