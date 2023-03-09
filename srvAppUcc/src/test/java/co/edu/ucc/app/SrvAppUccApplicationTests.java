package co.edu.ucc.app;

import co.edu.ucc.app.commons.converter.ConverterApp;
import co.edu.ucc.app.modeloCanonico.dto.EgresoDTO;
import co.edu.ucc.app.modeloCanonico.dto.generic.GenericRequestDTO;
import co.edu.ucc.app.modeloCanonico.dto.generic.GenericResponseDTO;
import co.edu.ucc.app.web.api.rest.IEgresoController;
import co.edu.ucc.app.web.api.rest.impl.EgresoControllerImpl;
import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SrvAppUccApplicationTests {

	@Autowired
	EgresoControllerImpl egresoController;

	@Autowired
	ConverterApp converterApp;

	@Autowired
	private ModelMapper modelMapper;

	@Test
	void crearEgreso() {


	}

}
