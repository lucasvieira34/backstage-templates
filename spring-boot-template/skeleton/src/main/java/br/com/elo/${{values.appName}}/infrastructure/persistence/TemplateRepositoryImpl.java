package br.com.elo.${{values.appName}}.infrastructure.persistence;

import br.com.elo.${{values.appName}}.domain.model.Template;
{{ values.appName }}.domain.repository.TemplateRepository;
import org.springframework.stereotype.Repository;

@Repository
public class TemplateRepositoryImpl implements br.com.elo.$.TemplateRepository {
    @Override
    public Template findTemplate() {
        return Template.builder().id(1L).name("Spring Template").build();
    }
}
