package br.com.elo.${{values.appName}}.infrastructure.service;

import br.com.elo.${{values.appName}}.domain.model.Template;
import br.com.elo.${{values.appName}}.domain.repository.TemplateRepository;
import br.com.elo.${{values.appName}}.domain.service.TemplateService;
import br.com.elo.${{values.appName}}.infrastructure.api.dto.TemplateResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplateServiceImpl implements TemplateService {
    @Autowired
    private TemplateRepository templateRepository;
    @Override
    public TemplateResponse getTemplate() {
        Template template = templateRepository.findTemplate();
        return TemplateResponse.builder().name(template.getName()).build();
    }
}
