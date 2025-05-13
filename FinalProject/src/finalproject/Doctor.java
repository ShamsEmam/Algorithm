/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalproject;

/**
 *
 * @author AFAQE
 */
public class Doctor implements Comparable<Doctor> {

    public String Id, Name, Tele, Specialization;

    public Doctor(String id, String name, String tele, String specialization) {
        this.Id = id;
        this.Name = name;
        this.Tele = tele;
        this.Specialization = specialization;
    }

    @Override
    public int compareTo(Doctor d) {
        return this.Id.compareTo(d.Id);
    }
}
