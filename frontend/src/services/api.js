import axios from 'axios';

const API_URL = 'http://localhost:8080/api/v1';

export const patientService = {
  getAllPatients: () => axios.get(`${API_URL}/patients`),
  getPatientById: (id) => axios.get(`${API_URL}/patients/${id}`),
  createPatient: (patient) => axios.post(`${API_URL}/patients`, patient),
  updatePatient: (id, patient) => axios.put(`${API_URL}/patients/${id}`, patient),
  deletePatient: (id) => axios.delete(`${API_URL}/patients/${id}`),
};

export const doctorService = {
  getAllDoctors: () => axios.get(`${API_URL}/doctors`),
  getDoctorById: (id) => axios.get(`${API_URL}/doctors/${id}`),
  createDoctor: (doctor) => axios.post(`${API_URL}/doctors`, doctor),
  updateDoctor: (id, doctor) => axios.put(`${API_URL}/doctors/${id}`, doctor),
  deleteDoctor: (id) => axios.delete(`${API_URL}/doctors/${id}`),
};
