package com.demo.springboot.rest;

import logic.CheckingPesel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class IdentificationNumberApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IdentificationNumberApiController.class);

    @CrossOrigin
    @GetMapping(value = "/check-identification-number")
    public ResponseEntity<Void> checkIdentificationNumber(@RequestParam(defaultValue = "") String id) {
        LOGGER.info("--- check identification number: {}", id);
        System.out.print(id);

        // TODO: Bardzo prosze dokonczyc implementacje walidacji numeru PESEL
        // TODO: Jesli pesel jest poprawny usluga powinna zwracac kod bledu 200 (OK)
        // TODO: W przeciwnym wypadku usluga powinna zwracac kod bledu 400 (BAD REQUEST)
        // TODO: Bardzo prosze unikac implementacji logiki w kontrolerze!


        return new ResponseEntity<>(CheckingPesel.itcorectPesel(id) ? HttpStatus.OK : HttpStatus.BAD_REQUEST);
    }

}
