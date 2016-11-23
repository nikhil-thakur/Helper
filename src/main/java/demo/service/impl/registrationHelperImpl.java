package demo.service.impl;

import demo.Dao.HelperRepository;
import demo.model.Helper;
import demo.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nikhi_000 on 7/27/2015.
 */
@Service
public class registrationHelperImpl implements RegistrationService {
    @Autowired
    HelperRepository helperRepository;

    @Override
    public void registerHelper(Helper helper) {
        helperRepository.save(helper);
    }
}
