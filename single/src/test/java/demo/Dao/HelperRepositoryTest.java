package demo.Dao;

import demo.model.Helper;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static org.junit.Assert.*;

/**
 * Created by nikhi_000 on 7/27/2015.
 */
@SpringBootApplication
public class HelperRepositoryTest {

    Helper helper;

    @Autowired
    HelperRepository helperRepository;

    @Before
    public void setUp() throws Exception {
        helper = new Helper();
        helper.setFirstName("Nik");
        helper.setLastName("Thakur");
        helper.setPhone("5073828943");
        helper.setAddress("Heaven land");
    }

    @Test
    public void saveHelper(){
        helperRepository.save(helper);
        assertTrue(helperRepository.findAll()!=null);
    }
}