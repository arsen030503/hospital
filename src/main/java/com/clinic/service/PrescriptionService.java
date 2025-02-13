package com.clinic.service;

import com.clinic.model.Prescription;
import com.clinic.repository.PrescriptionRepository;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class PrescriptionService {
    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public List<Prescription> getAllPrescriptions() {
        return prescriptionRepository.findAll();
    }

    public Prescription createPrescription(Prescription prescription) {
        return prescriptionRepository.save(prescription);
    }
}
