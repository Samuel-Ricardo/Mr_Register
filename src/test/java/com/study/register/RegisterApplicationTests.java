package com.study.register;

import com.study.register.Services.PersonService;
import com.study.register.dto.mapper.PersonMapper;
import com.study.register.dto.request.PersonDTO;
import com.study.register.dto.response.Response;
import com.study.register.entity.Person;
import com.study.register.factory.PersonFactory;
import static com.study.register.factory.PersonFactory.*;
import com.study.register.repository.PersonRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

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
        
    PersonMapper personMapper = PersonMapper.ISNTANCE;
    
    @Test
    void testGivenPersonDTOThenReturnSavedResponse() {
        
        PersonDTO fakeDTO = createFakeDTO();
        Person expectedEntity = createFakeEntity();
    
        when(personRepository.save(any(Person.class))).thenReturn(expectedEntity);
   
        
        Response<PersonDTO> expectedResponse = getExpectedResponse(expectedEntity);
        
        
        Response<PersonDTO> createdPersonResponse = personService.CreatePerson(fakeDTO);
        
        Assertions.assertEquals(expectedResponse, createdPersonResponse);
    }

    private Response<PersonDTO> getExpectedResponse(Person expectedEntity) {
        Response<PersonDTO> expectedResponse = new Response<PersonDTO> (
                personMapper.toDTO(expectedEntity),
                "Created, ID - " + expectedEntity.getId(),
                HttpStatus.CREATED);
        return expectedResponse;
    }
}
