package pe.edu.upc.vwalletweb.servicesinterfaces;

import pe.edu.upc.vwalletweb.entities.Servicio;
import pe.edu.upc.vwalletweb.entities.Servicio;

import java.util.List;

public interface IServicioService {
    public void insert (Servicio servicio);
    public List<Servicio> list();


}
