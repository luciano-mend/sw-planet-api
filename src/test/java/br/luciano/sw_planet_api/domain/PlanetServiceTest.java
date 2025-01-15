package br.luciano.sw_planet_api.domain;

import static br.luciano.sw_planet_api.common.PlanetConstants.PLANET;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@ExtendWith(MockitoExtension.class)
// @SpringBootTest(classes = PlanetService.class)
public class PlanetServiceTest {
    // @Autowired
    @InjectMocks
    private PlanetService planetService;

    // @MockitoBean
    @Mock
    private PlanetRepository planetRepository;
    
    //operacao_estado_retorno
    @Test
    public void createPlanet_WithValidData_ReturnsPlanet() {
        when(planetRepository.save(PLANET)).thenReturn(PLANET);

        //SUT System Under Test
        Planet sut = planetService.create(PLANET);

        assertThat(sut).isEqualTo(PLANET);
    }
}
