package com.study.register;

import com.study.register.Services.PersonService;
import com.study.register.dto.request.PersonDTO;
import com.study.register.dto.response.Response;
import com.study.register.entity.Person;
import com.study.register.factory.PersonFactory;
import static com.study.register.factory.PersonFactory.*;
import com.study.register.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class RegisterApplicationTests {

//	@Test
//	void contextLoads() {
//	}

    @Mock
    private PersonRepository personRepository;
    
    @InjectMocks
    private PersonService personService;
    
    
}
