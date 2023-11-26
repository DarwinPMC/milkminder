package pe.edu.upeu.milkminder.services;
import java.util.List;
import java.util.Map;

import pe.edu.upeu.milkminder.dtos.ControlDto;
import pe.edu.upeu.milkminder.models.Control;

public interface ControlService {
    Control save(ControlDto.ControlDtoBuilder entidad);

    List<Control> findAll();

    Map<String, Boolean> delete(Long id);

    Control getControlById(Long id);

    Control update(ControlDto.ControlDtoBuilder entidad, Long id);     
}