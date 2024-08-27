package serviceImpl;

import Entity.FormValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.FormValueRepository;
import services.FormValueService;

import java.util.List;


@Service
public class FormValueServiceImpl implements FormValueService {

    @Autowired
    private FormValueRepository
            formValueRepository;

    @Override
    public List<FormValue> getAllFormValues() {
        return formValueRepository.findAll();
    }

    @Override
    public FormValue getFormValueById(Long id) {
        return formValueRepository.findById(id).orElse(null);
    }

    @Override
    public FormValue createFormValue(FormValue formValue) {
        return formValueRepository.save(formValue);
    }

    @Override
    public FormValue updateFormValue(Long id, FormValue formValue) {
        if (formValueRepository.existsById(id)) {
            formValue.setId(id);
            return formValueRepository.save(formValue);
        }
        return null;
    }

    @Override
    public void deleteFormValue(Long id) {
        formValueRepository.deleteById(id);
    }
}
