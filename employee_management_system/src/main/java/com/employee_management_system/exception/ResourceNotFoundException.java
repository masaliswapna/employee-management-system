package com.employee_management_system.exception;



public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L; 

    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String resource, Long id) {
        super(String.format("%s not found with id: %d", resource, id));
    }
}

