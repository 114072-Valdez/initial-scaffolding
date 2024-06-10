package ar.edu.utn.frc.tup.lc.iii.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DummyDto {
    private Long id;

    @JsonProperty("description")
    private String description;
}
