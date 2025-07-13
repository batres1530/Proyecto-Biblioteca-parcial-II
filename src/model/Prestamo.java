package model;

import java.util.Date;

public class Prestamo {
    private int id;
    private int usuarioId;
    private int libroId;
    private int empleadoId;
    private Date fechaPrestamo;
    private Date fechaLimite;

    public Prestamo(int id, int usuarioId, int libroId, int empleadoId, Date fechaPrestamo, Date fechaLimite) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.libroId = libroId;
        this.empleadoId = empleadoId;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaLimite = fechaLimite;
    }

    // Getters estándar
    public int getId() {
        return id;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getLibroId() {
        return libroId;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaLimite() {
        return fechaLimite;
    }

    // Setters (opcional si no necesitas modificar)
    public void setId(int id) {
        this.id = id;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaLimite(Date fechaLimite) {
        this.fechaLimite = fechaLimite;
    }
}
