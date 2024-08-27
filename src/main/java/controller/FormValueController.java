package controller;

import Entity.FormValue;
import Entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.FormValueService;

import java.util.List;

@RestController
@RequestMapping("/api/form")
public class FormValueController {

    @Autowired
    private FormValueService formValueService;

    @GetMapping
    public List<FormValue> getAllFormValues() {
        return formValueService.getAllFormValues();
    }

    @GetMapping("/location")
    public List<Location> getAllLocation() {
        return formValueService.getAllLocations();
    }
    @GetMapping("/{id}")
    public FormValue getFormValueById(@PathVariable Long id) {
        return formValueService.getFormValueById(id);
    }
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello World");
    }
    @PostMapping
    public FormValue createFormValue(@RequestBody FormValue formValue) {
        return formValueService.createFormValue(formValue);
    }

    @PutMapping("/{id}")
    public FormValue updateFormValue(@PathVariable Long id, @RequestBody FormValue formValue) {
        return formValueService.updateFormValue(id, formValue);
    }

    @DeleteMapping("/{id}")
    public void deleteFormValue(@PathVariable Long id) {
        formValueService.deleteFormValue(id);
    }
}
