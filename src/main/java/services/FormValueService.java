package services;

import Entity.FormValue;
import Entity.Location;

import java.util.List;

public interface FormValueService {
    List<FormValue> getAllFormValues();
    FormValue getFormValueById(Long id);
    FormValue createFormValue(FormValue formValue);
    FormValue updateFormValue(Long id, FormValue formValue);
    void deleteFormValue(Long id);

    List<Location> getAllLocations();
}
