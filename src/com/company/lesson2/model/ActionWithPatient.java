package com.company.lesson2.model;

import com.company.lesson2.model.entities.Patient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActionWithPatient {

    private ArrayList<Patient> patients;

    public ActionWithPatient(){
        patients = new ArrayList<>();
    }

    public ArrayList<Patient> diagnosCheck(String diagnos){
        ArrayList<Patient> patientsWithDiagnos = new ArrayList<>();
        for (Patient p: patients) {
            if(p.getDiagnos().equals(diagnos)){
                patientsWithDiagnos.add(p);
            }
        }
        if(patientsWithDiagnos.size()==0){
            return null;
        } else
            return patientsWithDiagnos;
    }

    public ArrayList<Patient> getPatientsFromDiapason(int start, int end) {
        ArrayList<Patient> patients1 = new ArrayList<>();
        for (Patient p: patients) {
            if((p.getNumberOfMed()>=start)&(p.getNumberOfMed()<=end)){
                patients1.add(p);
            }
        }
        if(patients1.size()==0){
            return null;
        }else
            return patients1;
    }

    public List<Patient> sortPatients(){
        ComparatorPerson comparatorPerson = new ComparatorPerson();
        List<Patient> patientsSorted = patients;
        Collections.sort(patientsSorted,comparatorPerson);
        return patientsSorted;
    }

    private void addPatient(Patient patient){
        patients.add(patient);
    }

    public void fillStandart(){
        addPatient(new Patient("Василий", "Пончиков","Иванович","ул.Строителей 34",
                "0695486235",1,"Диабет"));
        addPatient(new Patient("Ирина","Белая","Васильевна","ул.Шевченка 5",
                "0502469587",2,"Сердечная недостаточность"));
        addPatient(new Patient("Григорий","Палочкин","Алексеевич","пр.Правды 76",
                "0632598745",3,"Диабет"));
        addPatient(new Patient("Татьяна","Пушная","Виталиевна","ул.Богдана Хмельницкого 4",
                "0694513678",45,"Перелом ключицы"));
        addPatient(new Patient("Николай","Топольников","Олегович","ул.Третья 3",
                "0652349685",68,"Катаракта"));
        addPatient(new Patient("Петр","Петров","Петрович","ул.Клубничная 67",
                "0369542186",39,"Катаракта"));
        addPatient(new Patient("Галина","Петрова","Ивановна","ул.Дубовая 8",
                "0452396845",50,"Диабет"));
        addPatient(new Patient("Авраам","Уточкин","Григорьевич","ул.Любова 4",
                "0853642541",93,"Перелом челюсти"));
        addPatient(new Patient("Никита","Головач","Дмитриевич","ул.Цветочная 123",
                "0893651249",34,"Диабет"));
        addPatient(new Patient("Лев","Толстой","Николаевич","ул.Пушкинская 90",
                "0892364516",45,"Амнезия"));

    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }
}
