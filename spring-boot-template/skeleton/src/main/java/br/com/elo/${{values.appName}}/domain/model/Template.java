package br.com.elo.${{values.appName}}.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Template {
    private Long id;
    private String name;
}
