package br.com.elo.${{values.appName}}.infrastructure.api.controller;

import br.com.elo.${{values.appName}}.domain.service.TemplateService;
import br.com.elo.${{values.appName}}.infrastructure.api.dto.TemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/template")
public class TemplateController {
    @Autowired
    private TemplateService templateService;

    @GetMapping()
    public ResponseEntity<TemplateResponse> getTemplate() {
        TemplateResponse templateResponse = templateService.getTemplate();
        return new ResponseEntity<>(templateResponse, HttpStatus.OK);
    }
}
