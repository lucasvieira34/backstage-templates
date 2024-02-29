package br.com.elo.${{values.appName}}.infrastructure.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TemplateResponse {
    private String name;
}
